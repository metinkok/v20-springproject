package com.example.v20.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.v20.entities.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer>{
 
    @Query(value = "SELECT * FROM USERS WHERE ID = :id", nativeQuery = true)
    Users getById(@Param("id") int id);

    @Query(value = "SELECT * FROM USERS WHERE STORYTELLER > 0", nativeQuery = true)
    List<Users> findStoryTeller();

    @Query(value = "SELECT * FROM USERS WHERE ADMN = :admin", nativeQuery = true)
    List<Users> getAdmin(@Param("admin") int admin);

    @Query(value = "SELECT * FROM USERS WHERE NAME LIKE %:name% ORDER BY NAME DESC", nativeQuery = true)
    List<Users> searchLike(@Param("name") String name);

    @Query(value = "SELECT * FROM USERS WHERE E_MAIL = :e_mail", nativeQuery = true)
    Users getByMail(@Param("e_mail") String e_mail);

    @Transactional@Modifying
    @Query(value = "INSERT INTO USERS (name, e_mail, password, admn, STORYTELLER) VALUES (:name, :e_mail, :password, 0, 0)", nativeQuery = true)
    void insertUser(@Param("name") String name, @Param("e_mail") String e_mail, @Param("password") String password);

    @Transactional@Modifying
    @Query(value = "UPDATE USERS SET PASSWORD = :password WHERE ID = :id", nativeQuery = true)
    void changePassword(@Param("password") String password, @Param("id") int id);

    @Transactional@Modifying
    @Query(value = "UPDATE USERS SET ADMN = :admin WHERE ID = :id", nativeQuery = true)
    void updateAdmin(@Param("admin") int admin, @Param("id") int id);

    @Transactional@Modifying
    @Query(value = "UPDATE USERS SET STORYTELLER = :storyteller WHERE ID= :id", nativeQuery = true)
    void updateStoryteller(@Param("id") int id, @Param("storyteller") int storyteller);
}
