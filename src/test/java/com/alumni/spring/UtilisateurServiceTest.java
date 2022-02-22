package com.alumni.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.alumni.spring.repository.UtilisateurRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class UtilisateurServiceTest extends ApplicationTests{

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void nouveauUtilisateurPostSuccess() throws Exception {
        mockMvc
                .perform(post("/inscription")
                        .param("login","test99")
                        .param("nom","Testing-Success")
                        .param("prenom","Test")
                        .param("password","99isbest")
                        .param("anneePromotion","01/01/1999"))
                .andExpect(status().isOk());
                //.andExpect(model().attributeExists("utilisateurForm"));
                //.andExpect(model().hasNoErrors());

    }


}
