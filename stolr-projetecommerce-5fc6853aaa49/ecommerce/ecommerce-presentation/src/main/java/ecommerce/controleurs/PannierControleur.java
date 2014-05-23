package ecommerce.controleurs;

import ecommerce.classemetier.Article;
import ecommerce.services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class PannierControleur {
/*
	private static final String SUCCESS = "accueilAmaShirt.jsp";
	private static final String FAIL = "accueilAmaShirt.jsp";
*/
	@Autowired
	private PanierService panierService;

	@RequestMapping(value = "/panier.do")
	public ModelAndView index() {

		
		//ArrayList<Article> ListArticle = panierService.getPanier(login);
                String lol = new String(); 
		return new ModelAndView("panierAmaShirt.jsp", "listArticle", lol);

	}
}
