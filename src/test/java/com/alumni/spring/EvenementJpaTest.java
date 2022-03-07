package com.alumni.spring;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.repository.EvenementRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.sql.Time;
import java.util.Date;
import java.util.List;


import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class EvenementJpaTest {

    @Autowired
    private EvenementRepository evenementRepository;

    @Test
    public void enregistrerEvenementTest_success()
    {
        Date date = new Date();
        long now = System.currentTimeMillis();
        Time sqlTime = new Time(now);
        Evenement evenementGenerer =
                evenementRepository.save(new Evenement(date,"test-event",sqlTime,"test-event-lieu",90));
        Evenement evenementTrouver =
                evenementRepository.findEvenementByIdEvent(evenementGenerer.getIdEvent());

        assertNotNull(evenementTrouver);
        assertEquals(evenementTrouver.getIdEvent(),evenementGenerer.getIdEvent());
    }

    @Test
    public void findByNomEventTest_success()
    {
        Date date = new Date();
        long now = System.currentTimeMillis();
        Time sqlTime = new Time(now);
        Evenement evenementGenerer =
                evenementRepository.save(new Evenement(date,"test-event",sqlTime,"test-event-lieu",90));
        Evenement evenementTrouver =
                evenementRepository.findByNomEvent(evenementGenerer.getNomEvent());

        assertNotNull(evenementTrouver);
        assertEquals("test-event",evenementTrouver.getNomEvent());
    }

    @Test
    public void deleteEventTest_success()
    {
        Date date = new Date();
        long now = System.currentTimeMillis();
        Time sqlTime = new Time(now);
        Evenement evenementGenerer =
                evenementRepository.save(new Evenement(date,"test-event",sqlTime,"test-event-lieu",90));
       evenementRepository.delete(evenementGenerer);

       assertNull(evenementRepository.findEvenementByIdEvent(evenementGenerer.getIdEvent()));
    }
}
