package reto5gui.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import reto5gui.util.JDBCUtilities;

// ConsultarClasificacionesProyectosVo, ConsultarCiudadesVo y ConsultarProveedoresVo no existen porque no las considere necesarias ya que los resultados para estas consultas son listas de Strings sencillas, por lo que no requieren de un modeloVo. Remitirse a la carpeta Dao (ConsultarClasificacionesProyectosDao, ConsultarCiudadesDao, ConsultarProveedoresDao)

public class ConsultarProveedoresDao {

    private List<String> listado_proveedores;

    public ConsultarProveedoresDao(){
        this.listado_proveedores = new ArrayList<>();
    }

    public List<String> listar() throws SQLException{
        String sql_query = "SELECT DISTINCT Proveedor FROM Compra ORDER BY Proveedor";
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        con = JDBCUtilities.getConnection();
        stm = con.createStatement();
        rs = stm.executeQuery(sql_query);

        while (rs.next()) {
            listado_proveedores.add(rs.getString("Proveedor"));
        }
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }

        return listado_proveedores;
    }
}
