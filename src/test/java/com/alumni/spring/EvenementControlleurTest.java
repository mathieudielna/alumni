package com.alumni.spring;

import com.alumni.spring.service.EvenementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class EvenementControlleurTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EvenementService evenementService;

    @Test
    public void testGetEvenementAdmin_error() throws  Exception{
        mockMvc.perform(get("/evenement/consultation"))
                .andExpect(status().isNetworkAuthenticationRequired())
                .andExpect(model().attributeHasErrors());
    }

    @Test
    public void testGetEvenement_success() throws  Exception{
        mockMvc.perform(get("/evenement/open-event"))
                .andExpect(status().isOk());
    }
}
