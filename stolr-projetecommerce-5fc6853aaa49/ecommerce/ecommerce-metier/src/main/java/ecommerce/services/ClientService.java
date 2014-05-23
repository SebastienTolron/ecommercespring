package ecommerce.services;
import java.util.List;

import org.springframework.stereotype.Repository;

import ecommerce.classemetier.Client;

public interface ClientService {

    Client register(String login, String password, String nom, String prenom, String email);

    Client find(String login);

    Client find(Long id);

    List<Client> findAll();

    void save(Client user);

    void remove(Client user);

}

