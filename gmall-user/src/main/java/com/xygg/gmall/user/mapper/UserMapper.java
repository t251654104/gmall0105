package com.xygg.gmall.user.mapper;

import com.xygg.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @auhor xygg
 * @date 2020/2/29 13:25:12
 * @desc
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
