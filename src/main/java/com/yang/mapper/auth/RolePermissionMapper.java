package com.yang.mapper.auth;

import com.yang.mapper.BaseMapper;
import com.yang.model.auth.RolePermission;
import org.apache.ibatis.annotations.Mapper;



/** 
 * @Description 角色与菜单关系Mapper
 * @author 王鑫 
 * @date Apr 12, 2017 9:13:04 AM  
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<String, RolePermission> {

    public RolePermission findRolePermission(RolePermission per);

}
