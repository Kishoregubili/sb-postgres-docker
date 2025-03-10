package org.kishore.sbpostgresdocker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    private int id;
    private String name;
    private double balance;
}
