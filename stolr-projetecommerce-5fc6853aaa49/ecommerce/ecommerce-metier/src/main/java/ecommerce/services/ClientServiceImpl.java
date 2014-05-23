package ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ecommerce.classemetier.Client;
import ecommerce.dao.ClientDAO;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO userDao;

    public ClientServiceImpl() {
    }

    
    @Transactional
    public Client register(String login, String password, String nom, String prenom, String email) {
    	System.out.println("Registering client (client) : " + login);

        if (getUserDao().find(login) != null) {
         throw new IllegalStateException("client already exist");
        }

        return getUserDao().save(new Client(login, password, nom, prenom, email));
    }

   
    public Client find(String login) {
    	System.out.println("Searching for client (login) : " + login);
        return getUserDao().find(login);
    }
    
    public Client find(Long id) {
    	System.out.println("Searching for client (id) : " + id);
        return getUserDao().findById(id);
    }
    

    public List<Client> findAll() {
    	System.out.println("finding all clients");
        throw new UnsupportedOperationException();
    }

    @Transactional
    public void save(Client user) {
    	System.out.println("saving client : " + user.getPseudo());
        getUserDao().save(user);
    }

    public void remove(Client user) {
    	System.out.println("removing client : " + user.getPseudo());
        throw new UnsupportedOperationException();
    }

    /**
     * @return the userDao
     */
    public ClientDAO getUserDao() {
        return userDao;
    }

    /**
     * @param userDao the userDao to set
     */
    public void setUserDao(ClientDAO userDao) {
        this.userDao = userDao;
    }
}