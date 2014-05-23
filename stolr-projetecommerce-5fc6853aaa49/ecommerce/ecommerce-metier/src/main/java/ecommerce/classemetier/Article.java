package ecommerce.classemetier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





        
@Entity        
public class Article {
    
    public Article(String art)
    {
        this.nom=art;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

	
	@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
	protected String nom;
	protected double prix;
	//protected Photo photo;
	
	

	public Article() {
	
	}

}
