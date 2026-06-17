package com.mycompany.conexionbd;

import java.awt.*;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class EmpleadoVista extends JFrame {

    private JTextField txtId, txtNombre;
    private JComboBox<Departamento> cmbDepartamento;
    private JButton btnModificar, btnEliminar, btnInsertar, btnBuscarFoto;
    private JLabel lblFoto;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private EmpleadoDAO dao;
    private String rutaFoto = "";

    public EmpleadoVista() {
        Connection con = Conexion.getConexion();
        dao = new EmpleadoDAO(con);

        setTitle("Gestión de Empleados");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // == PANEL IZQUIERDO ==
        JPanel panelForm = new JPanel(new GridLayout(9, 2, 5, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        txtId = new JTextField();
        txtId.setEditable(false);
        txtNombre = new JTextField();
        cmbDepartamento = new JComboBox<>();
        btnInsertar = new JButton("Insertar");
        btnModificar = new JButton("Modificar");
        btnEliminar = new JButton("Eliminar");
        btnBuscarFoto = new JButton("Buscar Foto");
        lblFoto = new JLabel("Sin foto", SwingConstants.CENTER);
        lblFoto.setPreferredSize(new Dimension(150, 150));
        lblFoto.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        panelForm.add(new JLabel("ID:"));
        panelForm.add(txtId);
        panelForm.add(new JLabel("Nombre:"));
        panelForm.add(txtNombre);
        panelForm.add(new JLabel("Departamento:"));
        panelForm.add(cmbDepartamento);
        panelForm.add(new JLabel("Foto:"));
        panelForm.add(btnBuscarFoto);
        panelForm.add(new JLabel(""));
        panelForm.add(lblFoto);
        panelForm.add(btnInsertar);
        panelForm.add(new JLabel(""));
        panelForm.add(btnModificar);
        panelForm.add(btnEliminar);

        // == PANEL DERECHO (tabla) ==
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Nombre", "Departamento", "Foto"}, 0);
        tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);

        add(panelForm, BorderLayout.WEST);
        add(scroll, BorderLayout.CENTER);

        // == CARGAR DEPARTAMENTOS EN COMBOBOX ==
        cargarDepartamentos();

        // == CARGAR TABLA ==
        cargarTabla();

        // == MOUSE LISTENER ==
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int fila = tabla.getSelectedRow();
                txtId.setText(modeloTabla.getValueAt(fila, 0).toString());
                txtNombre.setText(modeloTabla.getValueAt(fila, 1).toString());
                String nombreDepto = modeloTabla.getValueAt(fila, 2).toString();

                // Seleccionar el departamento en el ComboBox
                for (int i = 0; i < cmbDepartamento.getItemCount(); i++) {
                    if (cmbDepartamento.getItemAt(i).getNombreDepto().equals(nombreDepto)) {
                        cmbDepartamento.setSelectedIndex(i);
                        break;
                    }
                }

                // Mostrar foto si existe
                rutaFoto = modeloTabla.getValueAt(fila, 3) != null ? modeloTabla.getValueAt(fila, 3).toString() : "";
                if (!rutaFoto.isEmpty()) {
                    ImageIcon icon = new ImageIcon(new ImageIcon(rutaFoto)
                        .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                    lblFoto.setIcon(icon);
                    lblFoto.setText("");
                } else {
                    lblFoto.setIcon(null);
                    lblFoto.setText("Sin foto");
                }
            }
        });

        // == BOTON BUSCAR FOTO ==
        btnBuscarFoto.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Imágenes", "jpg", "jpeg", "png", "gif"));
            int resultado = fileChooser.showOpenDialog(this);
            if (resultado == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();
                rutaFoto = archivo.getAbsolutePath();
                ImageIcon icon = new ImageIcon(new ImageIcon(rutaFoto)
                    .getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                lblFoto.setIcon(icon);
                lblFoto.setText("");
            }
        });

        // == BOTON INSERTAR ==
        btnInsertar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            Departamento depto = (Departamento) cmbDepartamento.getSelectedItem();
            Empleado emp = new Empleado(0, nombre, depto.getIdDepto(), rutaFoto);
            dao.insertar(emp);
            cargarTabla();
            limpiarCampos();
        });

        // == BOTON MODIFICAR ==
        btnModificar.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            Departamento depto = (Departamento) cmbDepartamento.getSelectedItem();
            Empleado emp = new Empleado(id, nombre, depto.getIdDepto(), rutaFoto);
            dao.actualizar(emp);
            cargarTabla();
            limpiarCampos();
        });

        // == BOTON ELIMINAR ==
        btnEliminar.addActionListener(e -> {
            int id = Integer.parseInt(txtId.getText());
            dao.borrar(id);
            cargarTabla();
            limpiarCampos();
        });

        setVisible(true);
    }

    private void cargarDepartamentos() {
        cmbDepartamento.removeAllItems();
        ArrayList<Departamento> deptos = dao.consultarDepartamentos();
        for (Departamento d : deptos) {
            cmbDepartamento.addItem(d);
        }
    }

    private void cargarTabla() {
        modeloTabla.setRowCount(0);
        ArrayList<Empleado> lista = dao.consultarTodos();
        for (Empleado emp : lista) {
            // Buscar nombre del departamento
            String nombreDepto = "";
            for (int i = 0; i < cmbDepartamento.getItemCount(); i++) {
                if (cmbDepartamento.getItemAt(i).getIdDepto() == emp.getIdDepto()) {
                    nombreDepto = cmbDepartamento.getItemAt(i).getNombreDepto();
                    break;
                }
            }
            modeloTabla.addRow(new Object[]{emp.getId(), emp.getNombre(), nombreDepto, emp.getFoto()});
        }
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        cmbDepartamento.setSelectedIndex(0);
        lblFoto.setIcon(null);
        lblFoto.setText("Sin foto");
        rutaFoto = "";
    }
}