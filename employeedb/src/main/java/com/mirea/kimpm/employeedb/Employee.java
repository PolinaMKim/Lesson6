package com.mirea.kimpm.employeedb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Employee {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;
    public String power;

    public Employee(long id, String name, String power) {
        this.id = id;
        this.name = name;
        this.power = power;
    }
}
