
package com.tarea.tarea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tarea {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_tarea;
    private String titulo;
    private String descripcion;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_creacion;
    @Temporal(TemporalType.DATE)
    private LocalDate fec_estimada_terminacion;
    private boolean finalizada;
    private String estado;

    public Tarea() {
    }

    public Tarea(Long id_tarea, String titulo, String descripcion, LocalDate fecha_creacion, LocalDate fec_estimada_terminacion, boolean finalizada, String estado) {
        this.id_tarea = id_tarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.fec_estimada_terminacion = fec_estimada_terminacion;
        this.finalizada = finalizada;
        this.estado = estado;
    }
    
}
