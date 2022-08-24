package reto5gui.controller;

import java.sql.SQLException;
import java.util.List;

import reto5gui.model.dao.ConsultarCiudadesDao;
import reto5gui.model.dao.ConsultarClasificacionesProyectosDao;
import reto5gui.model.dao.ConsultarCompraDao;
import reto5gui.model.dao.ConsultarLiderDao;
import reto5gui.model.dao.ConsultarProveedoresDao;
import reto5gui.model.dao.ConsultarProyectoDao;
import reto5gui.model.vo.CompraVo;
import reto5gui.model.vo.LiderVo;
import reto5gui.model.vo.ProyectoVo;

public class ControladorGUI {

    private ConsultarLiderDao consultarLiderDao;
    private ConsultarProyectoDao consultarProyectoDao;
    private ConsultarCompraDao consultarCompraDao;
    private ConsultarClasificacionesProyectosDao consultarClasificacionesProyectosDao;
    private ConsultarCiudadesDao consultarCiudadesDao;
    private ConsultarProveedoresDao consultarProveedoresDao;

    public ControladorGUI() {
        this.consultarLiderDao = new ConsultarLiderDao();
        this.consultarProyectoDao = new ConsultarProyectoDao();
        this.consultarCompraDao = new ConsultarCompraDao();
        this.consultarClasificacionesProyectosDao = new ConsultarClasificacionesProyectosDao();
        this.consultarCiudadesDao = new ConsultarCiudadesDao();
        this.consultarProveedoresDao = new ConsultarProveedoresDao();
    }
    public String[][] listarLideres() throws SQLException{
    
        List<LiderVo> lista_lideres = this.consultarLiderDao.listar();
        int filas = lista_lideres.size();
        int columnas = 3; // id, nombre, primer_apellido, ciudad
        String[][] tabla_lideres = new String[filas][columnas];
        for(int i=0; i<filas; i++){
            LiderVo lider = lista_lideres.get(i);
            tabla_lideres[i][0] = String.valueOf(lider.getId()); // convierte int a String
            tabla_lideres[i][1] = lider.getNombre()+' '+lider.getPrimer_apellido(); // concatena nombre y apellido
            tabla_lideres[i][2] = lider.getCiudad();
        }
        
        return tabla_lideres;
    }

    // public List<LiderVo> listarLideres() throws SQLException{
    //     return this.consultarLiderDao.listar();
    // }
    

    
    public String[][] listarProyectos(String clasificacion, String... ciudades) throws SQLException{
        List<ProyectoVo> lista_proyectos = this.consultarProyectoDao.listar(clasificacion, ciudades);
        int filas = lista_proyectos.size();
        int columnas = 4; // id, Constructora, N° habitaciones, ciudad
        String[][] tabla_proyectos = new String[filas][columnas];
        for(int i=0; i<filas; i++){
            ProyectoVo proyecto = lista_proyectos.get(i);
            tabla_proyectos[i][0] = String.valueOf(proyecto.getId()); // convierte int a String
            tabla_proyectos[i][1] = proyecto.getConstructora();
            tabla_proyectos[i][2] = String.valueOf(proyecto.getNumero_habitaciones());
            tabla_proyectos[i][3] = proyecto.getCiudad();
        }
        
        return tabla_proyectos;
    }
    
    public String[][] listarCompras(String proveedor, String ciudad) throws SQLException{
        List<CompraVo> compras = this.consultarCompraDao.listar(proveedor, ciudad);
        int filas = compras.size();
        int columnas = 3; // id, constructora, banco vinculado
        String[][]  tabla_compras = new String[filas][columnas];
        for (int i = 0; i < filas; i++) {
            CompraVo compra = compras.get(i);
            tabla_compras[i][0] = String.valueOf(compra.getId());
            tabla_compras[i][1] = String.valueOf(compra.getConstructora());
            tabla_compras[i][2] = String.valueOf(compra.getBanco_vinculado());
        }
        return tabla_compras;
    }
    

    public String[] listarClasificaciones() throws SQLException{
        List<String> clasificacion = this.consultarClasificacionesProyectosDao.listar();
        int total_clasificaciones = clasificacion.size();
        String[]  clasificaciones = new String[total_clasificaciones];
        for (int i = 0; i < clasificaciones.length; i++) {
            clasificaciones[i] = clasificacion.get(i);
        }
        return clasificaciones;
    }

    public String[] listarCiudades() throws SQLException {
        List<String> lista_ciudades = this.consultarCiudadesDao.listar();
        int total_ciudades = lista_ciudades.size();
        String[]  ciudades = new String[total_ciudades];
        for (int i = 0; i < ciudades.length; i++) {
            ciudades[i] = lista_ciudades.get(i);
        }
        return ciudades;
    }

    public String[] listarProveedores() throws SQLException {
        List<String> lista_proveedores = this.consultarProveedoresDao.listar();
        int total_proveedores = lista_proveedores.size();
        String[]  proveedores = new String[total_proveedores];
        for (int i = 0; i < proveedores.length; i++) {
            proveedores[i] = lista_proveedores.get(i);
        }
        return proveedores;
    }
}
