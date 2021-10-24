#!/usr/bin/env sh

# TODO: Set WEBHOOK to webhook ID (without URL)
WEBHOOK="856a56b0-53e0-4d42-82dc-4f7c653ede83"

API_ENDPOINT="https://api.crashtest.cloud/webhook"

# Start Scan and get scan ID
SCAN_ID=`curl --silent -X POST --data "" $API_ENDPOINT/$WEBHOOK | jq .data.scanId`
echo "Started Scan for Webhook $WEBHOOK. Scan ID is $SCAN_ID."

# Refresh Scan status
STATUS="100"
while [[ $STATUS -le "101" ]]
do
    echo "Scan Status currently is $STATUS (101 = Running)"

    # Only poll every minute
    sleep 60

    # Refresh status
    STATUS=`curl --silent $API_ENDPOINT/$WEBHOOK/scans/$SCAN_ID/status | jq .data.status.status_code`

done

echo "Scan finished with status $STATUS."

# Download Report
curl --silent $API_ENDPOINT/$WEBHOOK/scans/$SCAN_ID/report/junit -o report.xml
echo "Downloaded Report to report.xml"
