package br.com.kalyana.dao.jpa;

import br.com.kalyana.dao.generic.jpa.GenericJpaDAO;
import br.com.kalyana.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.kalyana.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
