package reto5gui.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto5gui.model.vo.ProyectoVo;
import reto5gui.util.JDBCUtilities;

public class ConsultarProyectoDao {

    public List<ProyectoVo> listar(String clasificacion, String... ciudades)throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
    
        List<ProyectoVo> proyectos = new ArrayList<ProyectoVo>();

        con = JDBCUtilities.getConnection();
        String sql_query = "SELECT ID_Proyecto AS id, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion = ?";
    
        if (ciudades.length != 0) {
            sql_query = sql_query.concat(" AND ciudad IN (");
            for (int i=0; i<ciudades.length-1; i++) {
                sql_query = sql_query.concat("'").concat(ciudades[i]).concat("', ");
            }
            sql_query = sql_query.concat("'").concat(ciudades[ciudades.length-1]).concat("')");
        }
        sql_query = sql_query.concat(" ORDER BY ciudad");
    
        stm = con.prepareStatement(sql_query);
        stm.setString(1, clasificacion);
        rs = stm.executeQuery();

        while (rs.next()) {
            ProyectoVo proyecto = new ProyectoVo();
            proyecto.setId(rs.getInt("id"));
            proyecto.setConstructora(rs.getString("Constructora"));
            proyecto.setNumero_habitaciones(rs.getInt("Numero_Habitaciones"));
            proyecto.setCiudad(rs.getString("Ciudad"));
            proyectos.add(proyecto);
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

        return proyectos;

    }
}
