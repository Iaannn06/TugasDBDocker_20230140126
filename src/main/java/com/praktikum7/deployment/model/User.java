package com.praktikum7.deployment.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name="20230140126_users")
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    private String id;
    @Column(nullable = false)
    private String name;

}
