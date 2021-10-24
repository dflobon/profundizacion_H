package com.grupoh.springbootmvc.pagina;

import javax.persistence.*;

@Entity
@Table
public class Pagina {
    @Id
    @SequenceGenerator(
            name = "pagina_sequence",
            sequenceName = "pagina_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String titulo;

    public Pagina() {

    }

    public Pagina(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
