package com.example.gestion_rh.repository;

import com.example.gestion_rh.model.fanaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface fanaRepository extends JpaRepository<fanaModel,Integer> {
}
