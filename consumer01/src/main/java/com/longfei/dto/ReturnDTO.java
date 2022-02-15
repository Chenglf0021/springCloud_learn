package com.longfei.dto;

import java.util.HashMap;
import java.util.Map;

public class ReturnDTO extends HashMap<String, Object> {
    public static ReturnDTO create() {
        return new ReturnDTO();
    }

    public static ReturnDTO create(String key, Object object) {
        ReturnDTO re = new ReturnDTO();
        re.put(key, object);
        return re;
    }

    public static ReturnDTO create(Map<String,Object> map) {
        ReturnDTO re = new ReturnDTO();
        re.putAll(map);
        return re;
    }
    public static ReturnDTO create(int retCode) {
        ReturnDTO re = new ReturnDTO();
        re.put("retCode", retCode);
        return re;
    }
    public static ReturnDTO create(String retCode) {
        ReturnDTO re = new ReturnDTO();
        re.put("retCode", retCode);
        return re;
    }
    public static ReturnDTO create(String code,Object object,String msg) {
        ReturnDTO re = new ReturnDTO();
        re.put("code", "200");
        re.put("msg", msg);
        re.put("data", object);
        re.put("result",object);
        return re;
    }

}
