package com.example.restspring.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="user")
public class Student {

    @Id
    @GeneratedValue
    private int id;
//    @Column(name="")
    private String studentName;
    private String studentAddress;
    private String studentPassword;
}
