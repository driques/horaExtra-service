package com.mingeso.horaExtraservice.controllers;


import com.mingeso.horaExtraservice.entities.HoraExtraEntity;
import com.mingeso.horaExtraservice.services.HoraExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hora-extra")
public class HoraExtraController{
    @Autowired
    HoraExtraService horaExtraService;


    @PostMapping("/guardar")
    public ResponseEntity<HoraExtraEntity> guardarHoraExtra(@RequestBody HoraExtraEntity horaExtra){
        System.out.println(horaExtra);
        try{
            return ResponseEntity.ok(horaExtraService.guardarHoraExtra(horaExtra));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }
    @ResponseBody
    @GetMapping("/obtener/{id}")
    public String[] obtenerHorasExtra(@PathVariable int id){
        try{
            String[] dates = horaExtraService.getDatesByRut(id);
            System.out.println("dates: " + dates[0]);
            return dates;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }





}
