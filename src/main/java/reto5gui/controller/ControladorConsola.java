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

public class ControladorConsola {

    private ConsultarLiderDao consultarLiderDao;
    private ConsultarProyectoDao consultarProyectoDao;
    private ConsultarCompraDao consultarCompraDao;
    private ConsultarClasificacionesProyectosDao consultarClasificacionesProyectosDao;
    private ConsultarCiudadesDao consultarCiudadesDao;
    private ConsultarProveedoresDao consultarProveedoresDao;

    public ControladorConsola() {
        this.consultarLiderDao = new ConsultarLiderDao();
        this.consultarProyectoDao = new ConsultarProyectoDao();
        this.consultarCompraDao = new ConsultarCompraDao();
        this.consultarClasificacionesProyectosDao = new ConsultarClasificacionesProyectosDao();
        this.consultarCiudadesDao = new ConsultarCiudadesDao();
        this.consultarProveedoresDao = new ConsultarProveedoresDao();
    }
    
    public List<LiderVo> listarLideres() throws SQLException{
        return this.consultarLiderDao.listar();
    }
    
    public List<ProyectoVo> listarProyectos(String clasificacion, String... ciudades) throws SQLException{
        return this.consultarProyectoDao.listar(clasificacion, ciudades);
    }

    public List<CompraVo> listarCompras(String proveedor, String ciudad) throws SQLException{
        return this.consultarCompraDao.listar(proveedor, ciudad);
    }

    public List<String> listarClasificaciones() throws SQLException{
        return this.consultarClasificacionesProyectosDao.listar();
    }

    public List<String> listarCiudades() throws SQLException{
        return this.consultarCiudadesDao.listar();
    }

    public List<String> listarProveedores() throws SQLException{
        return this.consultarProveedoresDao.listar();
    }
}
