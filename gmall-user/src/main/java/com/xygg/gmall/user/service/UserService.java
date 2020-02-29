package com.xygg.gmall.user.service;

import com.xygg.gmall.user.bean.UmsMember;
import com.xygg.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @auhor xygg
 * @date 2020/2/29 13:20:15
 * @desc
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
