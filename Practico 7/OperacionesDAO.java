package com.mycompany.conexionbd;

import java.util.ArrayList;

public interface OperacionesDAO {
    void insertar(Empleado empleado);
    void actualizar(Empleado empleado);
    void borrar(int id);
    ArrayList<Empleado> consultarTodos();
}
