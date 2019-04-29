
package com.zhs.vfsim.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.zhs.vfsim.pojo.Product;

public interface ProductESDAO extends ElasticsearchRepository<Product,Integer>{

}

