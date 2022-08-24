package reto5gui;

import java.sql.SQLException;

import reto5gui.view.VistaConsola;
import reto5gui.view.VistaGUI;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws SQLException {
        VistaGUI vista = new VistaGUI();


        //Estas opcines son para mostrar resultados por consola
        //VistaConsola vistaConsola = new VistaConsola();
        //vistaConsola.mostrarLideres();
        //vistaConsola.mostrarProyectos("Casa Campestre", "Barranquilla", "Cartagena", "Santa Marta");
        //vistaConsola.mostrarCompras("Homecenter", "Salento");
    }
}
