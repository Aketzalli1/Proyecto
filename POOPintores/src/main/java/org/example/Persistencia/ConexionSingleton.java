package org.example.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingleton {
    private String baseDatos;
    private static ConexionSingleton instance;
    private Connection connection;

    private ConexionSingleton(String database) {
        this.baseDatos = database;
        try {
            //Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + this.baseDatos);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ConexionSingleton getInstance(String baseDatos) {
        if (instance == null) {
            instance = new ConexionSingleton(baseDatos);
        } else {
            System.out.println("Ya fue creada.");
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
