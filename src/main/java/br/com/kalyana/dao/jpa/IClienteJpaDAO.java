package br.com.kalyana.dao.jpa;

import br.com.kalyana.dao.Persistente;
import br.com.kalyana.dao.generic.jpa.IGenericJpaDAO;
import br.com.kalyana.domain.jpa.ClienteJpa;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}
