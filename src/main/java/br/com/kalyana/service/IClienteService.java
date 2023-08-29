package br.com.kalyana.service;

import br.com.kalyana.domain.Cliente;
import br.com.kalyana.exception.DAOException;
import br.com.kalyana.exception.TipoChaveNaoEncontradaException;
import br.com.kalyana.service.generics.IGenericService;

import java.io.Serializable;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
