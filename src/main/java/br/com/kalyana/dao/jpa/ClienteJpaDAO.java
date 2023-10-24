package br.com.kalyana.dao.jpa;

import br.com.kalyana.dao.generic.jpa.GenericJpaDAO;
import br.com.kalyana.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
