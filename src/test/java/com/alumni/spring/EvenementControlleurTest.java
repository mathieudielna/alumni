package com.alumni.spring;

import com.alumni.spring.service.EvenementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class EvenementControlleurTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EvenementService evenementService;

    @Test
    public void testGetEvenement_success() throws  Exception{
        mockMvc.perform(get("/evenement/open-event"))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser("test")
    public void testAuthentificatedAjouterEvenement_success() throws Exception{
        mockMvc.perform(get("/evenement/ajouter"))
                .andExpect(status().isOk());
    }


    @Test
    @WithMockUser("test")
    public void testPostEvenement_sucess() throws Exception {
        mockMvc.perform(post("/evenement/ajouter")
                        .param("nbPersonneMax","70")
                        .param("lieuEvent","test_lieu")
                        .param("heureEvent","02:01:01")
                        .param("nomEvent","test_event")
                        .param("dateEvent","01/01/1999"))
                .andExpect(status().isFound())
                .andExpect(model().hasNoErrors())
                .andExpect(redirectedUrl("/evenement/open-event"));
    }

    @Test
    @WithMockUser("test")
    public void testPostEvenement_error() throws Exception {
        mockMvc.perform(post("/evenement/ajouter")
                        .param("nbPersonneMax","70")
                        .param("lieuEvent","test_lieu")
                        .param("heureEvent","02:01:01")
                        .param("nomEvent","")
                        .param("dateEvent","01/03/1999"))
                .andExpect(status().isOk())
                .andExpect(model().hasErrors());
    }
}
