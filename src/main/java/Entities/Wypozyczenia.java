package Entities;


import jakarta.persistence.*;

@Entity
@Table(name= "wypożyczenia")
public class Wypozyczenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_wypożyczenia")
    private String tytul;

    @Column(name = "termin_dni")
    private String terminDni;

    @Column(name = "id_książka")
    private String idKsiazki;

    @Column(name = "id_czytelnik")
    private String idCzytelnik;
}
