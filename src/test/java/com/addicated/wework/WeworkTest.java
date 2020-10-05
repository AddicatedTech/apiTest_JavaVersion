package com.addicated.wework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;


class WeworkTest {

    @Test
    void getWeworkToken() {
        Wework wework = new Wework();
        String weworkToken = wework.getWeworkToken(WeworkConfig.getInstance().secret);
        assertThat(weworkToken,not(equalTo(null)));
    }
}