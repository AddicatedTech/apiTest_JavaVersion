package com.addicated.wework;

/**
 * @description:
 * @author: Adi
 * @time: 2020/10/4 19:12
 **/

public class WeworkConfig {
//    agentId:"1000002"
//    secret:"sScHMyPF5VynfvbRwXVYvmOVjyJX4y2dhBZfP8CQWoU"
//    corpId:"ww01499f8ea8a9861f"
//    contactSecret:"2fUo73u09VhsVhxvdb2ffCvWVkggPa52_KKx9cvXDxA"

    public String agentId = "1000002";
    public String secret = "sScHMyPF5VynfvbRwXVYvmOVjyJX4y2dhBZfP8CQWoU";
    public String corpid = "ww01499f8ea8a9861f";
    public String contactSecret = "2fUo73u09VhsVhxvdb2ffCvWVkggPa52_KKx9cvXDxA";

    private static WeworkConfig weworkConfig;

    public static WeworkConfig getInstance() {
        if (weworkConfig == null) {
            weworkConfig = new WeworkConfig();
        }
        return weworkConfig;
    }

    public static void load(String path) {
        //todo: read from yaml or json
    }
}
