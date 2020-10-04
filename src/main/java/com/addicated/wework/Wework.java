package com.addicated.wework;

import io.restassured.RestAssured;

/**
 * @description:
 * @author: Adi
 * @time: 2020/10/4 19:12
 **/

public class Wework {
    private static String token;

    public static String getWeworkToken() {
        return RestAssured.given().log().all()
                .queryParam("corpid", WeworkConfig.getInstance().corpid)
                .queryParam("corpsecret", WeworkConfig.getInstance().secret)
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then().log().all().statusCode(200)
                .extract().path("access_token");
    }

    public static String getToken() {
        if (token == null) {
            token = getWeworkToken();
        }
        return token;
    }

}
