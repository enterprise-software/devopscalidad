package co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService implements ILoggingService {
    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);
    public String warning() {
        logger.warn("A WARN Message");
        return "A WARN Message";
    }
    public String error() {
        logger.error("A ERROR Message");
        return "A ERROR Message";
    }
    public String info() {
        logger.info("A INFO Message");
        return "A INFO Message";
    }
    public String debug() {
        logger.debug("A DEBUG Message");
        return "A DEBUG Message";
    }
}
