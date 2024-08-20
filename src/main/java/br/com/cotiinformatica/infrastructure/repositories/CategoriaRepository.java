package br.com.cotiinformatica.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotiinformatica.domain.categorias.models.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
