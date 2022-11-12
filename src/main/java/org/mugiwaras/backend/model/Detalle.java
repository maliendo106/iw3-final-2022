package org.mugiwaras.backend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "detalle")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Detalle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_orden")
    @JsonIgnore
    private Orden orden;

    @Column(name = "masa")
    private float masa;

    @Column(name = "densidad")
    private float densidad;

    @Column(name = "temperatura")
    private float temperatura;

    @Column(name = "caudal")
    private float caudal;

    @Column(name="fecha_detalle")
    private OffsetDateTime fechaDetalle;

}
