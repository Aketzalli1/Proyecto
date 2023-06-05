package org.example.Vista;

import org.example.Controlador.ControladorPintores;

public class Main {
    public static void main(String[] args) {

        VentanaPintores view = new VentanaPintores("Pintores Mexicanos");
        ControladorPintores controll = new ControladorPintores(view);
    }
}