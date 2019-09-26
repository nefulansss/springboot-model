package com.nefu.test01.Controller;

import com.nefu.test01.Service.UserService;
import com.nefu.test01.pojo.User;
import org.omg.CORBA.MARSHAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public Map<String,Object> insertUser(@RequestBody User user){
        boolean b = userService.insertUser(user);
        Map<String,Object> map = new HashMap<>();

        if(b){

            map.put("success",1);
            map.put("errMsg","");

        }else{
            map.put("error",0);
            map.put("errMsg","错误！");
        }


        return map;
    }


    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(String userName,String password){
       //int i=1/0;
        Map<String,Object> map = new HashMap<>();

        if("root".equals(userName)&&"123".equals(password)){
            map.put("success",1);
            map.put("errMsg","");

        }else{
            map.put("error",0);
            map.put("errMsg","用户名或密码错误！");
        }


        return map;
    }



    @RequestMapping("/test")
    //@RequestBody
    @Transactional   //事务
    public Map<String,Object> getTest(){

        System.out.println("哈哈哈哈哈哈哈哈！");
        //int i = 1/0;
        System.out.println("啊啊啊啊啊啊啊啊！");

        return null;
    }


}
