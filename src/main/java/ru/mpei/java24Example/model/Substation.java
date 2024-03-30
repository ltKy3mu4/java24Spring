package ru.mpei.java24Example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "substations")
public class Substation {

    @Id
    @Column(name = "substid")
    private long id;
    @Column
    private String name;
    @Column(name = "voltageclass")
    private int voltageClass;

}
