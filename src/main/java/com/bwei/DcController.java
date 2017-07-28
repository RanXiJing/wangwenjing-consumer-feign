package com.bwei;

import com.bwei.microservice.User;
import com.bwei.microservice.UserFeignClient;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by 染熙 on 2017/7/24.
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/consumer")
    public String dc(){
        return dcClient.consumer();
    }

    @GetMapping("/userFeign")
    @ResponseBody
    public User user(User user){
        User user1 = userFeignClient.post(user);
        return user1;
    }

    @GetMapping("/consumeruser")
    @ResponseBody
    public User getuser(Long id, String username) {

        return userFeignClient.get(id, username);
    }

    @GetMapping("/consumerbymap")
    @ResponseBody
    public User getbymap() {
        HashMap<String, Object> map = Maps.newHashMap();
        map.put("id", "1");
        map.put("username", "张三");
        return userFeignClient.getbymap(map);
    }

}
