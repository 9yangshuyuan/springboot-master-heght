package com.yang.config.shiro.vo;

import com.yang.model.auth.Permission;

import java.util.List;


public class PermissionVo extends Permission {

    private static final long serialVersionUID = -2051933842290600230L;

    private List<PermissionVo> children;

    public List<PermissionVo> getChildren() {
        return children;
    }

    public void setChildren(List<PermissionVo> children) {
        this.children = children;
    }

}
