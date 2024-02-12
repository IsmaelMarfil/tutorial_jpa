package org.iesvdm.tutorial.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_categoria")
    private long idCategoria;
    private String nombre;
    @ManyToMany(mappedBy = "categorias")
    @JsonIgnore
    private Set<Pelicula> peliculas = new HashSet<>();
}
