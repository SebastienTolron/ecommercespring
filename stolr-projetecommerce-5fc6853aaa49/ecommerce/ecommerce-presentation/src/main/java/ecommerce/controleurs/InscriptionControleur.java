package ecommerce.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ecommerce.classemetier.Client;
import ecommerce.services.ClientService;

@Controller
public class InscriptionControleur {

	private static final String SUCCESS = "accueilAmaShirt.jsp";
	private static final String FAIL = "index.jsp";

	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "/sinscrire.do", method = RequestMethod.POST)
	public ModelAndView ajouterUtilisateur(@RequestParam String login,
			@RequestParam String mp, @RequestParam String nom,
			@RequestParam String prenom, @RequestParam String email) {

		if (clientService.find(login) != null) {
			return new ModelAndView(FAIL, "login", login);
		}

		Client client = clientService.register(login, mp, nom, prenom, email);

		return new ModelAndView(SUCCESS, "client", client);

	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam String login, @RequestParam String password) {

        Client user = clientService.find(login);
        if (user != null && user.getMotDePasse().equals(password)) {
         return new ModelAndView(SUCCESS, "client", user);
        }

        return new ModelAndView(FAIL, "login", login);
    }
}
