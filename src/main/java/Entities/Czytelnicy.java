package Entities;

import jakarta.persistence.*;

@Entity
@Table(name= "czytelnicy")
public class Czytelnicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "imię")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    @Column(name = "PESEL")
    private String pesel;
}
