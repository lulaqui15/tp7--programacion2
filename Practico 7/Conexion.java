package com.mycompany.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/empresa_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root123";

    public static Connection getConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa!\n");
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}
