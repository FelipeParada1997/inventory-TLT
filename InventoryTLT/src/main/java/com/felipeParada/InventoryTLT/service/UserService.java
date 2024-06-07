package com.felipeParada.InventoryTLT.service;

import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.felipeParada.InventoryTLT.entity.User;
import com.felipeParada.InventoryTLT.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    
    public long countByUserId(Long userId) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public void deleteByUserId(Long userId) {
        // TODO Auto-generated method stub
        
    }

    
    public void deleteByUserName(String userName) {
        // TODO Auto-generated method stub
        
    }

    
    public List<User> findAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public List<User> findByCreatedUser(String createdUser) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Optional<User> findByUserContactNumber(Long userContactNumber) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    
    public Optional<User> findByUserEmail(String userEmail) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    
    public List<User> findByUserFirstName(String userFirstName) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public List<User> findByUserLastName(String userLastName) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Optional<User> findByUserName(String userName) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

   
    
}
