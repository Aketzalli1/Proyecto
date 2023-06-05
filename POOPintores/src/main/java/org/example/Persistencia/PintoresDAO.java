package org.example.Persistencia;

import org.example.Modelo.Pintores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PintoresDAO implements InterfazDAO {
    private static int uId = 0;

    public PintoresDAO() {
    }

    public static int getuId() {
        return uId;
    }

    public static void setuId(int uId) {
        PintoresDAO.uId = uId;
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO pintores(nombre,nacimiento,lugar,estilo,url) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Pintores) obj).getNombre());
        pstm.setString(2, ((Pintores) obj).getNacimiento());
        pstm.setString(3, ((Pintores) obj).getLugar());
        pstm.setString(4, ((Pintores) obj).getEstilo());
        pstm.setString(5, ((Pintores) obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE pintores SET nombre = ?, nacimiento = ?, lugar = ?, estilo = ?, url = ? WHERE id = ?";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Pintores) obj).getNombre());
        pstm.setString(2, ((Pintores) obj).getNacimiento());
        pstm.setString(3, ((Pintores) obj).getLugar());
        pstm.setString(4, ((Pintores) obj).getEstilo());
        pstm.setString(5, ((Pintores) obj).getUrl());
        pstm.setInt(6, ((Pintores) obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM pintores WHERE id = ?";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList<Pintores> obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM pintores";
        ArrayList<Pintores> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("baseDatos.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            Pintores pintor = new Pintores();
            pintor.setId(rst.getInt("id"));
            pintor.setNombre(rst.getString("nombre"));
            pintor.setNacimiento(rst.getString("nacimiento"));
            pintor.setLugar(rst.getString("lugar"));
            pintor.setEstilo(rst.getString("estilo"));
            pintor.setUrl(rst.getString("url"));
            resultado.add(pintor);
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Audifonos WHERE Id = ?";
        Pintores Pintores = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("baseDatos.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            Pintores = new Pintores(rst.getInt("Id"), rst.getString("Marca"), rst.getString("Tipo"), rst.getString("Color"), rst.getString("Conexion"), rst.getString("UrlFoto"));
        }
        return Pintores;
    }
}

