package com.iskj.services;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: skjenco
 * Date: 11/28/13
 * Time: 2:31 AM
 * To change this template use File | Settings | File Templates.
 */

@Service("myTestService")
public class MyTestServiceImpl implements MyTestService {

    public String test(String str){
        return "done";
    }
}
