package com.xygg.gmall.user.service.impl;

import com.xygg.gmall.user.bean.UmsMember;
import com.xygg.gmall.user.bean.UmsMemberReceiveAddress;
import com.xygg.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.xygg.gmall.user.mapper.UserMapper;
import com.xygg.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auhor xygg
 * @date 2020/2/29 13:22:51
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAllUser();

        //原版mybatis基本的增删改查语句需要自己写
        //List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddresses;
    }
}
