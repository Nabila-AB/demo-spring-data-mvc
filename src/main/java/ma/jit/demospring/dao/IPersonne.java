package ma.jit.demospring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.demospring.entities.Personne;

public interface IPersonne extends JpaRepository<Personne, Long> {

}
