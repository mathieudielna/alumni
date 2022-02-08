package com.alumni.spring.repository;

import com.alumni.spring.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

    List<Evenement> findByNomEvent(String nomEvent);
    List<Evenement> findByDateEvent(Date Date);
}
