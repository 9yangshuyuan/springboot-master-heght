package com.yang.mapper.auth;

import com.yang.mapper.BaseMapper;
import com.yang.model.auth.UserRole;
import org.apache.ibatis.annotations.Mapper;



/** 
 * @Description 用户与角色关系Mapper
 * @author 王鑫 
 * @date Apr 12, 2017 9:13:44 AM  
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<String, UserRole> {

}
