package com.mycompany.conexionbd;

public class Empleado {
    private int id;
    private String nombre;
    private int idDepto;
    private String foto;

    public Empleado(int id, String nombre, int idDepto, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.idDepto = idDepto;
        this.foto = foto;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getIdDepto() { return idDepto; }
    public String getFoto() { return foto; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setIdDepto(int idDepto) { this.idDepto = idDepto; }
    public void setFoto(String foto) { this.foto = foto; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Depto ID: " + idDepto;
    }
}