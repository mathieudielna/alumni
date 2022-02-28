package com.alumni.spring;

import com.alumni.spring.service.UtilisateurService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UtilisateurControlleurTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UtilisateurService utilisateurService;


    @Test
    public void testGetInscription_sucess() throws Exception {
        mockMvc.perform(get("/inscription"))
                .andExpect(status().isOk());
    }

    @Test
    public void testPostInscription_sucess() throws Exception {
        mockMvc.perform(post("/inscription")
                        .param("login","testing")
                        .param("nom","test_name")
                        .param("prenom","testing")
                        .param("password","pass")
                        .param("anneePromotion","01/01/1999"))
                .andExpect(status().isFound())
                .andExpect(model().hasNoErrors())
                .andExpect(redirectedUrl("/connexion"));
    }

    @Test
    public void testPostInscription_error() throws Exception {
        mockMvc.perform(post("/inscription")
                        .param("login","testing")
                        .param("nom","test_name")
                        .param("prenom","testing")
                        .param("password","pass")
                        .param("anneePromotion","1999/01/39"))
                .andExpect(status().isOk())
                .andExpect(model().hasErrors())
                .andExpect(model().errorCount(1));
    }

}
