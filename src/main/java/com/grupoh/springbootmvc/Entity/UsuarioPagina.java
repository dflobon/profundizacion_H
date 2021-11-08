package com.grupoh.springbootmvc.Entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "UsuarioPagina")
@Table(name = "usuariopagina")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UsuarioPagina {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private Usuario user_id;

    @OneToOne
    private Pagina pagina_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioPagina that = (UsuarioPagina) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
