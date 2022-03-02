package com.alumni.spring;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.UtilisateurRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class UtilisateurJpaTest {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Test
    public void enregistrementUtilisateurTest_success() {
        Date date = new Date();
        Utilisateur utilisateurGenerer =
                utilisateurRepository.save(new Utilisateur("test-test","test-test","test-test","test-test",date));
        Utilisateur utilisateurTrouver =
                utilisateurRepository.findUtilisateursById(utilisateurGenerer.getId());

        assertNotNull(utilisateurTrouver);
        assertEquals(utilisateurGenerer.getId(),utilisateurTrouver.getId());
    }

    @Test
    public void getByLoginTest_success(){
        Date date = new Date();
        Utilisateur utilisateurGenerer =
                utilisateurRepository.save(new Utilisateur("test-test","test-test","test-test","test-test",date));
        Utilisateur utilisateurTrouver =
                utilisateurRepository.findUtilisateursByLogin(utilisateurGenerer.getLogin());

        assertNotNull(utilisateurTrouver);
        assertEquals("test-test",utilisateurTrouver.getLogin());
    }
}
