package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.utng.practice.model.CampGeneral;


public interface CampGeneralRepository extends JpaRepository<CampGeneral, Long> {
	@Query("Select campGeneral from CampGeneral campGeneral")
	public List<CampGeneral> finAll();
}
