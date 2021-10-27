package com.grupoh.springbootmvc.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Pagina")
@Table(
        name = "pagina"
)
public class Pagina {
    @Id
    @SequenceGenerator(
            name = "pagina_sequence",
            sequenceName = "pagina_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pagina_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "tipo",
            updatable = true,
            nullable = false
    )
    private String tipo;

    @Column(
            name = "pag_web",
            updatable = true,
            nullable = false
    )
    private String pagWeb;

    @Column(
            name = "titulo",
            updatable = true,
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String titulo;

    @Column(
            name = "contenido",
            updatable = true,
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String contenido;

    @Column(
            name = "obsoleto",
            updatable = true,
            nullable = false
    )
    private Boolean obsoleto;

    @Column(
            name = "fecha",
            updatable = false,
            nullable = false
    )
    private LocalDate fecha;

    @Column(
            name = "imagen",
            updatable = true,
            nullable = true
    )
    private String imagen;

    public Pagina() {

    }

    public Pagina(String tipo, String pagWeb, String titulo, String contenido, String imagen) {
        this.tipo = tipo;
        this.pagWeb = pagWeb;
        this.titulo = titulo;
        this.contenido = contenido;
        this.imagen = imagen;
        this.obsoleto = false;
        this.fecha = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Boolean getObsoleto() {
        return obsoleto;
    }

    public void setObsoleto(Boolean obsoleto) {
        this.obsoleto = obsoleto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", pagWeb='" + pagWeb + '\'' +
                ", titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", obsoleto=" + obsoleto +
                ", fecha=" + fecha +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}
