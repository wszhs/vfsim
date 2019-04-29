
package com.zhs.vfsim.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhs.vfsim.pojo.User;

public interface UserDAO extends JpaRepository<User,Integer>{

    User findByName(String name);

    User getByNameAndPassword(String name, String password);

}
