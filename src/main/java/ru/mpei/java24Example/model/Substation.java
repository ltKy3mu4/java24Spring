package ru.mpei.java24Example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "substations")
public class Substation {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column(name = "voltageclass")
    private int voltageClass;

    @OneToMany(mappedBy = "substation")
    private List<Equipment> equipment;

}
