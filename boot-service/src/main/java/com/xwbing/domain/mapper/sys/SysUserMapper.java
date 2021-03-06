package com.xwbing.domain.mapper.sys;

import com.xwbing.domain.entity.sys.SysUser;
import com.xwbing.domain.mapper.BaseMapper;

/**
 * 项目名称: boot-module-demo
 * 创建时间: 2018/6/1 21:50
 * 作者: xiangwb
 * 说明:
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    SysUser findByUserName(String userName);
}
