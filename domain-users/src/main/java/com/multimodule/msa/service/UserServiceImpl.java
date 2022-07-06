package com.multimodule.msa.service;

import com.multimodule.msa.model.User;
import com.multimodule.msa.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    };

}
