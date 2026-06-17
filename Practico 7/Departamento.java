package com.mycompany.conexionbd;

public class Departamento {
    private int idDepto;
    private String nombreDepto;

    public Departamento(int idDepto, String nombreDepto) {
        this.idDepto = idDepto;
        this.nombreDepto = nombreDepto;
    }

    public int getIdDepto() { return idDepto; }
    public String getNombreDepto() { return nombreDepto; }

    @Override
    public String toString() {
        return nombreDepto; // Para que el JComboBox muestre solo el nombre
    }
}