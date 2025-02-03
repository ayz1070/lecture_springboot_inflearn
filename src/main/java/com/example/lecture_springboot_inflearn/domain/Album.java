package com.example.lecture_springboot_inflearn.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Album extends Item{

    private String artist;
    private String etc;
}
