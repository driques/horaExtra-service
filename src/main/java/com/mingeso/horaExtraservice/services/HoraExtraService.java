package com.mingeso.horaExtraservice.services;


import com.mingeso.horaExtraservice.entities.HoraExtraEntity;
import com.mingeso.horaExtraservice.repositories.HoraExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoraExtraService {
    @Autowired
    HoraExtraRepository horasExtraRepository;

    public List<HoraExtraEntity> obtenerHorasExtra() {
        return (List<HoraExtraEntity>) horasExtraRepository.findAll();
    }

    public HoraExtraEntity guardarHoraExtra(HoraExtraEntity horasExtra) {
        return horasExtraRepository.save(horasExtra);
    }

    public int findMaxId() {
        try {
            int maxId = horasExtraRepository.findMaxId();
            return maxId + 1;

        } catch (Exception e) {
            return 1;
        }

    }
    public String[] getDatesByRut(int rut){
        return horasExtraRepository.getDateByRut(rut);
    }

    public Optional<HoraExtraEntity> obtenerPorId(int id) {
        return horasExtraRepository.findById(id);
    }

}
