package Entities;

import jakarta.persistence.*;

@Entity
@Table(name= "książki")
public class Ksiazki {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Tytuł")
    private String tytul;

    @Column(name = "Autor")
    private String autor;

    @Column(name = "Gatunek")
    private String gatunek;
}
