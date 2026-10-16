package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Member {
    @Id
    private int id;
    private String name;
    private String email;
    private int age;

}
