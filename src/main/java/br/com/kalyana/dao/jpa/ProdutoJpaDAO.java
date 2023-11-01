package br.com.kalyana.dao.jpa;

import br.com.kalyana.dao.generic.jpa.GenericJpaDAO;
import br.com.kalyana.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.kalyana.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
