package ecommerce.services;
import ecommerce.classemetier.Article;
import ecommerce.dao.PanierDAO;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanierServiceImpl implements PanierService {

    @Autowired
    private PanierDAO panierDAO;

    public PanierServiceImpl() {
    }

  

  

  
    public ArrayList<Article> getPanier(String user) {
       
        return panierDAO.getPanier(user);
    }
   
}

