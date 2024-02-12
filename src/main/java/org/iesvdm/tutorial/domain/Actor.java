package org.iesvdm.tutorial.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jayway.jsonpath.internal.filter.ValueNodes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="actor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_actor")
    private long idActor;
    private String nombre;
    private String apellidos;
    @ManyToMany(mappedBy = "actores")
    @JsonIgnore
    private Set<Pelicula> peliculas = new HashSet<>();
}
