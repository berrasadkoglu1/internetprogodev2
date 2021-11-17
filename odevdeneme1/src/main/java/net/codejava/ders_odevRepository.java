package net.codejava;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 
public interface ders_odevRepository extends JpaRepository<Ders_odev , Long> {

	
	@Query("SELECT u FROM Ders_odev u WHERE u.key1 LIKE ?1")
	public List<Ders_odev > search(String keyword);
	

	
}