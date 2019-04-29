

package com.zhs.vfsim.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhs.vfsim.pojo.Product;
import com.zhs.vfsim.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}

