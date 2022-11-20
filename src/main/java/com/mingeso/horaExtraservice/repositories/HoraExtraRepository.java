package com.mingeso.horaExtraservice.repositories;

import com.mingeso.horaExtraservice.entities.HoraExtraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface HoraExtraRepository extends JpaRepository<HoraExtraEntity, Integer> {
    @Query(value = "SELECT MAX(id) FROM horas_extra", nativeQuery = true)
    int findMaxId();

    @Query(value = "SELECT fecha FROM horas_extra WHERE rut = ?1", nativeQuery = true)
    String[] getDateByRut(int rut);

}
