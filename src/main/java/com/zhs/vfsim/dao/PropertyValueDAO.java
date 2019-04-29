
package com.zhs.vfsim.dao;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhs.vfsim.pojo.Product;
import com.zhs.vfsim.pojo.Property;
import com.zhs.vfsim.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}


