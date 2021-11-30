package com.animee.forecast.juhe;

public class URLUtils {

    public static final  String KEY = "28d780c8198d9e8e62dc8a4b4dc37f10";
    public static String temp_url = "http://apis.juhe.cn/simpleWeather/query";

    public static String index_url = "http://apis.juhe.cn/simpleWeather/life";

    public static String getTemp_url(String city){
        String url = temp_url+"?city="+city+"&key="+KEY;
        return url;
    }

    public static String getIndex_url(String city){
        String url = index_url+"?city="+city+"&key="+KEY;
        return url;
    }
}
