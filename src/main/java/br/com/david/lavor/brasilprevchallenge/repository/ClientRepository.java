package br.com.david.lavor.brasilprevchallenge.repository;

import java.util.List;

import br.com.david.lavor.brasilprevchallenge.dto.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByName(String Name);
}
