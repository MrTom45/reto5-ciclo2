package reto5gui.model.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto5gui.model.vo.LiderVo;
import reto5gui.util.JDBCUtilities;

public class ConsultarLiderDao {
    
    public  List<LiderVo> listar() throws SQLException {
        List<LiderVo> lideres = new ArrayList<>();

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql_query = "SELECT ID_Lider AS id, Nombre, Primer_Apellido, Ciudad_Residencia AS ciudad FROM Lider ORDER BY ciudad ASC";

        con = JDBCUtilities.getConnection();
        stm = con.createStatement();
        rs = stm.executeQuery(sql_query);

        while (rs.next()) {
            LiderVo lider = new LiderVo();
            lider.setId(rs.getInt("id"));
            lider.setNombre(rs.getString("Nombre"));
            lider.setCiudad(rs.getString("ciudad"));
            lider.setPrimer_apellido(rs.getString("Primer_Apellido"));
            lideres.add(lider);
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

        return lideres;        
    }
}
