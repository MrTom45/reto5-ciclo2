/*Esta clase es una GUI en consola sin embargo no funciona ya que hice varios cambios al controlador para adaptarlo */

package reto5gui.view;

import java.sql.SQLException;
import java.util.List;

import reto5gui.controller.ControladorConsola;
import reto5gui.model.vo.*;


public class VistaConsola {

    private static ControladorConsola controlador;

    public VistaConsola(){
        VistaConsola.controlador = new ControladorConsola();
    }

    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
            respuesta += caracter;
        }
        return respuesta;
    }


    public void mostrarLideres() {
        System.out.println(repitaCaracter('=', 30)+" LISTADO DE LIDERES "+ repitaCaracter('=', 30));
        System.out.println(String.format("%7s %-30s %-20s", "ID", "NOMBRE", "CIUDAD"));
        System.out.println(repitaCaracter('=', 80));

        try {
            List<LiderVo> listado_lideres;
            listado_lideres = VistaConsola.controlador.listarLideres();
            for (LiderVo lider : listado_lideres) {
                String nombre_lider = lider.getNombre() + " " + lider.getPrimer_apellido();
                System.out.println(String.format("%7s %-30s %-20s", lider.getId(), nombre_lider, lider.getCiudad()));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void mostrarProyectos(String clasificacion, String... ciudades) {
        System.out.println(repitaCaracter('=', 30)+" LISTADO DE PROYECTOS "+ repitaCaracter('=', 30));
        System.out.println(String.format("%7s %-30s %-15s %-20s", "ID", "CONSTRUCTORA", "N° HABITACIONES", "CIUDAD"));
        System.out.println(repitaCaracter('=', 82));

        try {
            List<ProyectoVo> listado_proyectos;
            listado_proyectos = VistaConsola.controlador.listarProyectos(clasificacion, ciudades);
            for (ProyectoVo proyecto : listado_proyectos) {
                System.out.println(String.format("%7s %-30s %-15s %-20s", proyecto.getId(), proyecto.getConstructora(), proyecto.getNumero_habitaciones(), proyecto.getCiudad()));
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

    }

    public void mostrarCompras(String proveedor, String ciudad) {
        System.out.println(repitaCaracter('=', 30)+" LISTADO DE COMPRAS "+ repitaCaracter('=', 30));
        System.out.println(String.format("%7s %-30s %-20s", "ID", "CONSTRUCTORA", "BANCO VINCULADO"));
        System.out.println(repitaCaracter('=', 80));


        try {
            List<CompraVo> listado_compras;
            listado_compras = VistaConsola.controlador.listarCompras(proveedor, ciudad);
            for (CompraVo compra : listado_compras) {
                System.out.println(String.format("%7s %-30s %-20s", compra.getId(), compra.getConstructora(), compra.getBanco_vinculado()));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
