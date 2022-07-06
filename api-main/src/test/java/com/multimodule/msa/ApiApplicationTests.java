package com.multimodule.msa;

import com.multimodule.msa.model.User;
import com.multimodule.msa.repository.UserRepository;
import com.multimodule.msa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApiApplicationTests {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    void 사용자_조회() {
        // given
        User user = User.builder().username("이해진").domain("naver.com").nickname("LHJ").build();
        User givenUser = userRepository.save(user);

        // when
        User whenUser = userService.getUser("이해진");

        // then
        assertThat(givenUser.getId()).isEqualTo(whenUser.getId());
    }

}
