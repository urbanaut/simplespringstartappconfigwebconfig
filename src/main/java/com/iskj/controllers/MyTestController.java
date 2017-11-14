package com.iskj.controllers;

import com.iskj.services.MyTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

/**
 * Created with IntelliJ IDEA.
 * User: skjenco
 * Date: 11/28/13
 * Time: 1:15 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class MyTestController {

    private View jsonView = new MappingJacksonJsonView();


    @Autowired MyTestService myTestService;



    @RequestMapping("main.json")
    public @ResponseBody String main(){
        try{
            myTestService.test("Some Call to a Service");
            return "{\"Stephen\" : \"44\", \"Karen\" : \"41\" }";
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            return "error";
        }
    }


}
