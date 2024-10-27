package com.halloweenCodeChallenge.ApiMonster.repository;


import com.halloweenCodeChallenge.ApiMonster.model.Monstruo; // Asegúrate de importar la clase correcta
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonstruosRepository extends JpaRepository<Monstruo, Long> {
}
