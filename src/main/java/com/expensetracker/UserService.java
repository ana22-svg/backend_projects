package com.expensetracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    // connection purposes with the repo layer

    public List <User> getUser(){
        return userRepository.findAll();
    }
    public User createUser(User user){
        return userRepository.save(user);

    }
    public User updateUser(Long id, User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
