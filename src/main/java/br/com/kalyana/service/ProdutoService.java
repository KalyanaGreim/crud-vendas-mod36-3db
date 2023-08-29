package br.com.kalyana.service;

import br.com.kalyana.dao.IProdutoDAO;
import br.com.kalyana.domain.Produto;
import br.com.kalyana.service.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
