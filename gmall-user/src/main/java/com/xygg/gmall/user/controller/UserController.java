package com.xygg.gmall.user.controller;

import com.xygg.gmall.user.bean.UmsMember;
import com.xygg.gmall.user.bean.UmsMemberReceiveAddress;
import com.xygg.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auhor xygg
 * @date 2020/2/29 13:18:17
 * @desc
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    //根据ID查用户收货地址
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }


    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index()
    {
        return "hello user";
    }
}
