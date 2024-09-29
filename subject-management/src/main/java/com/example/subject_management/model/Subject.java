package com.example.subject_management.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsubject")
    private int idSubject;

    @Column(name = "subject", length = 45, nullable = false)
    private String subject;

    @Column(name = "credits", length = 45, nullable = false)
    private String credits;


}
