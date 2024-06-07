package com.felipeParada.InventoryTLT.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.felipeParada.InventoryTLT.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    //metodo para traer todos los usuarios
    List<User> findAllUsers();

    //metodo para traer usuario por el nombre de usuario
    Optional<User> findByUserName(String userName);

    //metodo para traer usuario por el primero nombre registrado en la aplicacion
    List<User> findByUserFirstName(String userFirstName);

    //metodo para traer usuario por el apellido del usuario registrado en la aplicacion
    List<User> findByUserLastName(String userLastName);

    //metodo para traer usuario por email registrado en la app
    Optional<User> findByUserEmail(String userEmail);

    //metodo para crear usuario
    List<User> findByCreatedUser(String createdUser);

    //metodo para traer usuario usando el numero de contato registrado en la app
    Optional<User> findByUserContactNumber(Long userContactNumber);

    //metodo para eliminar usuario utilizando el ID
    void deleteByUserId(Long userId);

    //metodo para eliminar usuario utilizando su nombre de usuario
    void deleteByUserName(String userName);

    //metodo para contar los usuarios registrados usando su Id
    long countByUserId(Long userId);
}
