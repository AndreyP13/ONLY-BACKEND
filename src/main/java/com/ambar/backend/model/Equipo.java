package com.ambar.backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;               // 👈 Nombre del equipo
    private int proyectosEquipo;         // Proyectos del equipo
    private int proyectosPersonales;     // Proyectos personales
    private int ocupacion;               // Ocupación %

    // ====== Getters y Setters ======
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getProyectosEquipo() { return proyectosEquipo; }
    public void setProyectosEquipo(int proyectosEquipo) { this.proyectosEquipo = proyectosEquipo; }

    public int getProyectosPersonales() { return proyectosPersonales; }
    public void setProyectosPersonales(int proyectosPersonales) { this.proyectosPersonales = proyectosPersonales; }

    public int getOcupacion() { return ocupacion; }
    public void setOcupacion(int ocupacion) { this.ocupacion = ocupacion; }
}
