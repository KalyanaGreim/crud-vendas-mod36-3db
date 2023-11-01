package br.com.kalyana.dao;

import br.com.kalyana.dao.generic.jpa.GenericJpaDAO;
import br.com.kalyana.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.kalyana.dao.jpa.IVendaJpaDAO;
import br.com.kalyana.domain.jpa.VendaJpa;
import br.com.kalyana.exception.DAOException;
import br.com.kalyana.exception.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}
