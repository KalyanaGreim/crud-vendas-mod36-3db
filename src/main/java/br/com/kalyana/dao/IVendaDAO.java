package br.com.kalyana.dao;

import br.com.kalyana.dao.generic.IGenericDAO;
import br.com.kalyana.domain.Venda;
import br.com.kalyana.exception.DAOException;
import br.com.kalyana.exception.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
