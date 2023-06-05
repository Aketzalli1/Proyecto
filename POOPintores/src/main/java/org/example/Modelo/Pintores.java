package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Pintores {
    private int id;
    private String nombre;
    private String nacimiento;
    private String lugar;
    private String estilo;
    private String url;

    public Pintores() {
    }

    public Pintores(String nombre, String nacimiento, String lugar, String estilo, String url) {
    }

    public Pintores(int id, String nombre, String nacimiento, String lugar, String estilo, String url) {
        this.id = id;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.lugar = lugar;
        this.estilo = estilo;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pintores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", lugar='" + lugar + '\'' +
                ", estilo='" + estilo + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon getImagenPintor() throws MalformedURLException {
        URL urlImagen = new URL(url);
        return new ImageIcon(urlImagen);
    }
}
