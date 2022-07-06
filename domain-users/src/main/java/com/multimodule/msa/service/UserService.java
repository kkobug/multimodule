package com.multimodule.msa.service;

import com.multimodule.msa.model.User;
import com.multimodule.msa.repository.UserRepository;

import java.util.List;

public interface UserService {

    List<User> getUser();

    User getUser(String username);

}
