package com.mycompany.conexionbd;

import java.sql.*;
import java.util.ArrayList;

public class EmpleadoDAO implements OperacionesDAO {

    private Connection con;

    public EmpleadoDAO(Connection con) {
        this.con = con;
    }

    @Override
    public void insertar(Empleado empleado) {
        String sql = "INSERT INTO empleados (nombre, id_depto, foto) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setInt(2, empleado.getIdDepto());
            pstmt.setString(3, empleado.getFoto());
            pstmt.executeUpdate();
            System.out.println("Empleado insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(Empleado empleado) {
        String sql = "UPDATE empleados SET nombre = ?, id_depto = ?, foto = ? WHERE id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, empleado.getNombre());
            pstmt.setInt(2, empleado.getIdDepto());
            pstmt.setString(3, empleado.getFoto());
            pstmt.setInt(4, empleado.getId());
            int filas = pstmt.executeUpdate();
            if (filas > 0) {
                System.out.println("Empleado actualizado correctamente.");
            } else {
                System.out.println("No se encontró el empleado con ID: " + empleado.getId());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    @Override
    public void borrar(int id) {
        String sql = "DELETE FROM empleados WHERE id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int filas = pstmt.executeUpdate();
            if (filas > 0) {
                System.out.println("Empleado borrado correctamente.");
            } else {
                System.out.println("No se encontró el empleado con ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al borrar: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Empleado> consultarTodos() {
        ArrayList<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        try (PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Empleado emp = new Empleado(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("id_depto"),
                    rs.getString("foto")
                );
                lista.add(emp);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar: " + e.getMessage());
        }
        return lista;
    }

    public ArrayList<Departamento> consultarDepartamentos() {
        ArrayList<Departamento> lista = new ArrayList<>();
        String sql = "SELECT * FROM departamentos";
        try (PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                lista.add(new Departamento(rs.getInt("id_depto"), rs.getString("nombre_depto")));
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar departamentos: " + e.getMessage());
        }
        return lista;
    }
}