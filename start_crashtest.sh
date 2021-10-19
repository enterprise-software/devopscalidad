#!/usr/bin/env sh

# TODO: Set WEBHOOK to webhook ID (without URL)
WEBHOOK="73e00c1d-8c04-41a9-9065-5a34cd99e36d"

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
