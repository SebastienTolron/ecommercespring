/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerce.services;

import ecommerce.classemetier.Article;
import java.util.ArrayList;

/**
 *
 * @author hackman
 */
public interface PanierService {
    
    
    public ArrayList<Article> getPanier(String user);
    
}
