package br.com.kalyana.domain;

import br.com.kalyana.anotacao.ColunaTabela;
import br.com.kalyana.anotacao.Tabela;
import br.com.kalyana.anotacao.TipoChave;
import br.com.kalyana.dao.Persistente;

@Tabela("TB_ESTOQUE")
public class Estoque implements Persistente {

    @ColunaTabela(dbName = "id_produto", setJavaName = "setId")
    private Long id;

    @ColunaTabela(dbName = "quantidade", setJavaName = "setCodigo")
    private String quantidade;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
