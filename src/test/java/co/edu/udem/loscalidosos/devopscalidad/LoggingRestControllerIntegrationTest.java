package co.edu.udem.loscalidosos.devopscalidad;

import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.controller.LoggingController;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.ILoggingService;
import co.edu.udem.loscalidosos.devopscalidad.prqrdrs.ws.service.LoggingService;
import org.apache.commons.logging.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@WebMvcTest(LoggingController.class)
public class LoggingRestControllerIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private ILoggingService service;

    @Test
    public void when_WARNING_thenReturnWarningText()
            throws Exception {
        String expectedReturn = "A WARN Message";
        when(service.warning()).thenReturn(expectedReturn);
        this.mvc.perform(get("/loggings/warning" ))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(expectedReturn)));
    }

    @Test
    public void when_ERROR_thenReturnErrorText()
            throws Exception {
        String expectedReturn = "A ERROR Message";
        when(service.error()).thenReturn(expectedReturn);
        this.mvc.perform(get("/loggings/error" ))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(expectedReturn)));
    }

    @Test
    public void when_INFO_thenReturnInfoText()
            throws Exception {
        String expectedReturn = "A INFO Message";
        when(service.info()).thenReturn(expectedReturn);
        this.mvc.perform(get("/loggings/info" ))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(expectedReturn)));
    }

    @Test
    public void when_DEBUG_thenReturnDebugText()
            throws Exception {
        String expectedReturn = "A DEBUG Message";
        when(service.debug()).thenReturn(expectedReturn);
        this.mvc.perform(get("/loggings/debug" ))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(expectedReturn)));
    }
}
