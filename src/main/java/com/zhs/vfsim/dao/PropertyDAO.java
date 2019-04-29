

package com.zhs.vfsim.dao;
 
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zhs.vfsim.pojo.Category;
import com.zhs.vfsim.pojo.Property;

public interface PropertyDAO extends JpaRepository<Property,Integer>{
	Page<Property> findByCategory(Category category, Pageable pageable);
	List<Property> findByCategory(Category category);

}

