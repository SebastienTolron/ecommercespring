package ecommerce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;



import ecommerce.classemetier.Client;

@Repository
public class ClientDAO {

    @PersistenceContext(name = "persistenceUnit")
    private EntityManager em;

    public ClientDAO() {
    }

    @SuppressWarnings("unchecked")
    public Client find(String login) {

        Query query = em.createQuery("from Client as u where u.pseudo = :login");
        query.setParameter("login", login);
        List<Client> l = query.getResultList();

        System.out.println("found " + l.size() + " client(s)");

        if (l.isEmpty()) {
         return null;
        }

        return (Client) l.get(0);
    }

    public Client findById(Long id) {
        return em.find(Client.class, id);
    }
    
    public Client save(Client user) {

        Client u = user;
        if (user.getId() == null) {
         em.persist(user);
        } else {
         u = em.merge(user);
        }
        em.flush();

        System.out.println("client : " + u.getPseudo() +" mp :"+u.getMotDePasse()+ " nom : "+u.getNom() + " persisted with id : " + u.getId());
        return u;
    }

}
