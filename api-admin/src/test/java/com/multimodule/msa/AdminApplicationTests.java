package com.multimodule.msa;

import com.multimodule.msa.model.User;
import com.multimodule.msa.repository.UserRepository;
import com.multimodule.msa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class AdminApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    void 사용자_조회() {
        // given
        List<User> givenUsers = userRepository.findAll();

        // when
        List<User> whenUsers = userService.getUser();

        // then
        assertThat(givenUsers.size()).isEqualTo(whenUsers.size());
    }

}
