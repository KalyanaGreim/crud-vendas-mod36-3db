package br.com.kalyana.dao.factory;

import br.com.kalyana.domain.Estoque;
import br.com.kalyana.domain.Produto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EstoqueFactory {

    public static Estoque convert(ResultSet rs) throws SQLException {
        Estoque prod = new Estoque();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setQuantidade(rs.getString("QUANTIDADE"));
        return prod;
    }
}
