package br.com.kalyana;

import br.com.kalyana.dao.ClienteDAOTest;
import br.com.kalyana.dao.ProdutoDAOTest;
import br.com.kalyana.dao.VendaDAOTest;
import br.com.kalyana.service.ClienteServiceTest;
import br.com.kalyana.service.ProdutoServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
