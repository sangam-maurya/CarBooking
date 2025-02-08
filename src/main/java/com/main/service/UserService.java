package com.main.service;

import com.main.entity.User;
import com.main.payload.UserDto;
import com.main.repositery.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;
    public UserService(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    public UserDto createUser(User user){
        Optional<User> username = userRepository.findByUsername(user.getUsername());
        if (username.isPresent()){
            throw new RuntimeException("username already present");
        }
        Optional<User> email = userRepository.findByEmail(user.getEmail());
        if (email.isPresent()){
            throw new RuntimeException("email is already present");
        }
        User save = userRepository.save(user);
        UserDto map = mapper.map(save, UserDto.class);
        return map;
    }
}
