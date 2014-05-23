package ecommerce.dao;

import ecommerce.classemetier.Article;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;



import ecommerce.classemetier.Client;
import java.util.ArrayList;

@Repository
public class PanierDAO {

    @PersistenceContext(name = "persistenceUnit")
    private EntityManager em;

    public PanierDAO() {
    }

   

    public ArrayList<Article> getPanier(String user) {
        ArrayList<Article> listArt = new ArrayList<Article>();
        listArt.add(new Article("article1"));
        listArt.add(new Article("article2"));
                
                return listArt;
        //return em.find(Client.class, id);
    }
    
   

}
