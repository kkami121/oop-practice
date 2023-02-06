package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class UserTest {

    @DisplayName("패스워드를 초기화 한다.")
    @Test
    void passwordTest() {

        //given
        User user = new User();

        //when
        user.initPassord(new CorrectFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull();
    }
    @DisplayName("패스워드가 초기되지 않는다.")
    @Test
    void passwordTest2() {

        //given
        User user = new User();

        //when
        user.initPassord(new CorrectFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNull();
    }
}