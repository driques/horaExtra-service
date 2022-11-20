package com.mingeso.horaExtraservice.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "horas_extra")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoraExtraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private int rut;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha;




}
