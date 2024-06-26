package it.paleocapa.greco.officina.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.paleocapa.greco.officina.model.Cliente;
 
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    public Cliente findByEmail(String email);
}