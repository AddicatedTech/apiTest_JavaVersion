package com.addicated.wework.contact;

import com.addicated.wework.Wework;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * @description:
 * @author: Adi
 * @time: 2020/10/4 19:12
 **/

public class Department {

    public Response list(String id){
        return  given().log().all()
                .param("access_token", Wework.getToken())
                .param("id",id)
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/department/list")
                .then().log().all().statusCode(200).extract().response();
    }
}


