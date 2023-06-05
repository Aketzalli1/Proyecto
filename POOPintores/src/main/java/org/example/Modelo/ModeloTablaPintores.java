package org.example.Modelo;

import org.example.Persistencia.PintoresDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaPintores implements TableModel {

    private ArrayList<Pintores> datos;
    public static final int COLS = 6;
    private PintoresDAO pintoresDAO;

    public ModeloTablaPintores() {
        datos = new ArrayList<>();
        pintoresDAO = new PintoresDAO();
    }

    public ModeloTablaPintores(ArrayList<Pintores> datos) {
        this.datos = datos;
        pintoresDAO = new PintoresDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Id";

            case 1:
                return "Nombre";

            case 2:
                return "F.nac";

            case 3:
                return "L.nac";

            case 4:
                return "Estilo";

            case 5:
                return "Url Foto";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pintores pintor = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return pintor.getId();
            case 1:
                return pintor.getNombre();
            case 2:
                return pintor.getNacimiento();
            case 3:
                return pintor.getLugar();
            case 4:
                return pintor.getEstilo();
            case 5:
                return pintor.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 1:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setNacimiento((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setLugar((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setEstilo((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public ArrayList<Pintores> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Pintores> datos) {
        this.datos = datos;
    }

    public PintoresDAO getPintoresDAO() {
        return pintoresDAO;
    }

    public void setPintoresDAO(PintoresDAO pintoresDAO) {
        this.pintoresDAO = pintoresDAO;
    }

    public void cargarTablas() {
        try {
            datos = pintoresDAO.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println("Error");
        }
    }
    public boolean agregarPintor(Pintores pintor) {
        boolean resultado = false;
        try {
            int ultimoId = 0;
            if (!datos.isEmpty()) {
                Pintores ultimoPintor = datos.get(datos.size() - 1);
                ultimoId = ultimoPintor.getId();
            }
            int nuevoId = ultimoId + 1;
            pintor.setId(nuevoId);
            if (pintoresDAO.insertar(pintor)) {
                datos.add(pintor);
                resultado = true;
            }
        } catch (SQLException sqle) {
            System.out.println("Error: " + sqle.getMessage());
        }
        return resultado;
    }
    public boolean modificarPintor(Pintores pintores){
        boolean resultado = true;
        try {
            if (pintoresDAO.update(pintores)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean eliminarPintor(String id) {
        boolean resultado = false;
        try {
            if (pintoresDAO.delete(id)) {
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public Pintores getPintoresAtIndex(int index) {
        if (index >= 0 && index < datos.size()) {
            return datos.get(index);
        } else {
            return null;
        }
    }

    }
