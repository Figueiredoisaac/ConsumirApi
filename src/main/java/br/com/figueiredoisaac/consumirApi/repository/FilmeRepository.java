package br.com.figueiredoisaac.consumirApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.figueiredoisaac.consumirApi.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

	List<Filme> findByRank(int rank);
}
