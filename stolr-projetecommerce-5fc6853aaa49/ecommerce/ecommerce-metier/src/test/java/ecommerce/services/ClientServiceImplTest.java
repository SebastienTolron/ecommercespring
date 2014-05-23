
package ecommerce.services;

import ecommerce.classemetier.Client;
import ecommerce.dao.ClientDAO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author root
 */
public class ClientServiceImplTest {
    
    public Client clientTest;
    public ClientDAO clientDao;
    
    public ClientServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String login = "titi";
        String password = "titi";
        String nom = "Chantrel";
        String prenom = "Thierry";
        String email = "thierry.chantrel@etu.univ-savoie.fr";
        this.clientTest = new Client(login, password, nom, prenom, email);
        
        this.clientDao = mock(ClientDAO.class);
        
        when(clientDao.save(any(Client.class))).thenReturn(clientTest);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Nominal Case for registering a client
     * Method used : ClientServiceImpl.register()
     */
    @org.junit.Test
    public void testRegisterAClient() {
        String login = this.clientTest.getPseudo();
        String password = this.clientTest.getMotDePasse();
        String nom = this.clientTest.getNom();
        String prenom = this.clientTest.getPrenom();
        String email = this.clientTest.getEmail();
        ClientServiceImpl instance = new ClientServiceImpl();
        instance.setUserDao(clientDao);
        
        Client expexctedResult = this.clientTest;
        
        Client result = instance.register(login, password, nom, prenom, email);
        
        assertEquals(expexctedResult, result);
    }
    
    /**
     * Error Case for registering a client : the client already exists
     * Method used : ClientServiceImpl.register()
     */
    @org.junit.Test(expected = java.lang.IllegalStateException.class)
    public void testRegisterAClientAlreadyExisting() {
        String login = this.clientTest.getPseudo();
        String password = this.clientTest.getMotDePasse();
        String nom = this.clientTest.getNom();
        String prenom = this.clientTest.getPrenom();
        String email = this.clientTest.getEmail();
        ClientServiceImpl instance = new ClientServiceImpl();
        instance.setUserDao(clientDao);
        
        when(clientDao.find(clientTest.getPseudo())).thenReturn(clientTest);
        
        Client alreadyExistingClient = instance.register(login, password, nom, prenom, email);
        
    }
    
    /**
     * Error Case for finding all clients
     * Method used : ClientServiceImpl.findAll()
     */
    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void testFindAll(){
        ClientServiceImpl instance = new ClientServiceImpl();
        instance.setUserDao(clientDao);
        
        instance.findAll();
    }
    
    /**
     * Error Case for removing a client
     * Method used : ClientServiceImpl.remove()
     */
    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void testRemove(){
        ClientServiceImpl instance = new ClientServiceImpl();
        instance.setUserDao(clientDao);
        
        instance.remove(clientTest);
    }
}
