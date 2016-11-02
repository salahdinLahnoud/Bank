package com.projectBank.Repository;
import com.projectBank.model.Menu;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MenuRepository extends CrudRepository<Menu, Long>{
	
	
	@Query("select m from Menu m where m.description like:x")
	public Page<Menu> findByIdByKeyWoord(@Param("x")String keywoord, Pageable p);
	public List<Menu> findBydescription(String desc);
	public Page<Menu> findById(Long id, Pageable p);
	
}
