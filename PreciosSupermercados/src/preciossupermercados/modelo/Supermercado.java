/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preciossupermercados.modelo;

/**
 *
 * @author IVAN
 */
public class Supermercado {

    // ATRIBUTOS
    private int id;
    private String nombre;
    private String localidad;
    private String zona;

    //CONSTRUCTOR
    public Supermercado(String nombre, String localidad, String zona) {

        setNombre(nombre);
        setLocalidad(localidad);
        setZona(zona);
    }

    //GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Nombre obligatorio");
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre Obligatorio");
        }
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        if (localidad == null || localidad.trim().isEmpty()) {
            throw new IllegalArgumentException("Localidad Obligatoria");
        }
        this.localidad = localidad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return id + " " + nombre + " " + localidad + " " + zona;
    }
}
