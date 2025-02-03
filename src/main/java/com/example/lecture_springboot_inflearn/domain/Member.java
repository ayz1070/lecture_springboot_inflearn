package com.example.lecture_springboot_inflearn.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    // 여기서의 member는 Order의 member
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
