package com.zmijewskimaksymilian.social_wall.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surName;

    @Column(name = "birth_date")
    private LocalDate birthDate;
    private String city;
    private String sex;

    @Column(name = "profile_image")
    private String profileImage;
}
