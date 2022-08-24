package reto5gui.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import reto5gui.util.JDBCUtilities;
import reto5gui.model.vo.*;

public class ConsultarCompraDao {
    
    public List<CompraVo> listar(String proveedor, String ciudad) throws SQLException{

        List<CompraVo> lista_compras = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        String sql_query = "SELECT c.ID_Compra AS id, p.Constructora, p.Banco_Vinculado FROM Compra c INNER JOIN Proyecto p ON (c.ID_Proyecto=p.ID_Proyecto) WHERE p.Ciudad = ? AND c.Proveedor = ?";

        con = JDBCUtilities.getConnection();
        stm = con.prepareStatement(sql_query);
        stm.setString(1, ciudad);
        stm.setString(2, proveedor);
        rs = stm.executeQuery();

        while (rs.next()) {
            CompraVo compra = new CompraVo();
            compra.setId(rs.getInt("id"));
            compra.setConstructora(rs.getString("constructora"));
            compra.setBanco_vinculado(rs.getString("banco_vinculado"));
            lista_compras.add(compra);
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

        return lista_compras;
    }
}
