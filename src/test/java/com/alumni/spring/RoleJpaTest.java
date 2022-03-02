package com.alumni.spring;

import com.alumni.spring.models.Role;
import com.alumni.spring.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class RoleJpaTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void findRoleByNameTest_success () {
        Role roleTrouver = roleRepository.findRoleByName("ROLE_USER");
        assertNotNull(roleTrouver);
        assertEquals("ROLE_USER", roleTrouver.getName());
    }

    @Test
    public void findRoleByNameTest_error () {
        Role roleTrouver = roleRepository.findRoleByName("ROLE_ADMIN");
        assertNotNull(roleTrouver);
        assertNotEquals("ROLE_USER", roleTrouver.getName());
    }
}
