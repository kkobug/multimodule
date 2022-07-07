package com.multimodule.msa;

import com.multimodule.msa.api.user.request.UserReq;
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

    @Test
    void 사용자_생성() {
        // given
        UserReq userReq = UserReq.builder().username("김범수").domain("daum.net").nickname("KBS").build();
        User givenUser = User.builder()
                .username(userReq.getUsername())
                .domain(userReq.getDomain())
                .nickname(userReq.getNickname())
                .build();

        // when
        Long whenUserId = userService.createUser(givenUser);

        //then
        assertThat(userReq.getNickname()).isEqualTo(userRepository.findById(whenUserId).get().getNickname());
    }

}
