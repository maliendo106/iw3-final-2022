package org.mugiwaras.backend.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orden")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orden implements Serializable {

    @Id
    private long numeroOrden;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_camion")
    private Camion camion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_chofer")
    private Chofer chofer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_detalle")
    private Detalle detalle;

    //VER FECHAS!!!!


}