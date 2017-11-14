package com.iskj.global.beans;

/**
 * Created with IntelliJ IDEA.
 * User: skjenco
 * Date: 11/28/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class GlobalCache {

    private String test;


    public String getTest() {
        if(test==null){
            test = "Something";
        }
        return test;
    }
}
