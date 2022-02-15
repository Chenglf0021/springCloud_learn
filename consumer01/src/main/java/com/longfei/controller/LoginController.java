package com.longfei.controller;


import com.longfei.dto.ReturnDTO;
import com.longfei.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoginController {
    @PostMapping(value = "/system/login")
    public ReturnDTO login(User user) {
        Map map = new HashMap<>();
        map.put("userId", 1);
        map.put("roleId", 1);
        List<Map> roles = new ArrayList<>();

        Map roleMap = new HashMap<>();
        roleMap.put("roleCode", "ROLE_admin");
        roleMap.put("roleId", 1);
        roleMap.put("roleName", "超级管理员");
        roles.add(roleMap);
        map.put("roles", roles);
        map.put("token",randomString());
        return ReturnDTO.create("0", map, "登录成功");
    }

    /**
     *
     * @return
     */
    @PostMapping(value = "/system/findMenuByUserOid")
    public ReturnDTO  findMenuByUserOid(){
        List<Map> list=new ArrayList<>();
        Map map = new HashMap<>();
        map.put("menuCode","systemMgt");
        map.put("menuIcon","SettingIcon");
        map.put("menuName","系统管理");
        map.put("menuOid","1");
        map.put("menuOrder","1");
        map.put("menuType","2");
        map.put("menuUrl","/systemMgt");
        map.put("parentOid",0);
        map.put("perms"," ");
        map.put("roleOid",3);
        map.put("userPid",3);
        map.put("versionNo",0);
        List<Map> childList=new ArrayList<>();
       Map childMap=new HashMap();

        childMap.put("menuCode","DepartmentList");
        childMap.put("menuIcon","SettingIcon");
        childMap.put("menuName","部门管理");
        childMap.put("menuOid","3");
        childMap.put("menuOrder","3");
        childMap.put("menuType","1");
        childMap.put("menuUrl","/systemMgt/DepartmentList");
        childMap.put("parentOid",1);
        childMap.put("perms","11");
        childMap.put("roleOid",3);
        childMap.put("userPid",3);
        childMap.put("versionNo",0);

        Map childMap1=new HashMap();

        childMap1.put("menuCode","MenuLis");
        childMap1.put("menuIcon","Menu");
        childMap1.put("menuName","菜单管理");
        childMap1.put("menuOid","151");
        childMap1.put("menuOrder","5");
        childMap1.put("menuType","1");
        childMap1.put("menuUrl","/systemMgt/MenuList");
        childMap1.put("parentOid",1);
        childMap1.put("perms","menu:view");
        childMap1.put("roleOid",3);
        childMap1.put("userPid",3);
        childMap1.put("versionNo",0);

        Map childMap2=new HashMap();

        childMap2.put("menuCode","UserList");
        childMap2.put("menuIcon","SettingIcon");
        childMap2.put("menuName","用户管理");
        childMap2.put("menuOid","152");
        childMap2.put("menuOrder","6");
        childMap2.put("menuType","1");
        childMap2.put("menuUrl","/systemMgt/UserList");
        childMap2.put("parentOid",1);
        childMap2.put("roleOid",3);
        childMap2.put("userPid",3);
        childMap2.put("versionNo",0);

        Map childMap3=new HashMap();

        childMap3.put("menuCode","UserRoleList");
        childMap3.put("menuIcon","SettingIcon");
        childMap3.put("menuName","用户角色管理");
        childMap3.put("menuOid","153");
        childMap3.put("menuOrder","7");
        childMap3.put("menuType","1");
        childMap3.put("menuUrl","/systemMgt/UserRoleList");
        childMap3.put("parentOid",1);
        childMap3.put("roleOid",3);
        childMap3.put("userPid",3);
        childMap3.put("versionNo",0);

        Map childMap4=new HashMap();

        childMap4.put("menuCode","RoleList");
        childMap4.put("menuIcon","SettingIcon");
        childMap4.put("menuName","角色管理");
        childMap4.put("menuOid","159");
        childMap4.put("menuOrder","8");
        childMap4.put("menuType","1");
        childMap4.put("menuUrl","/systemMgt/RoleList");
        childMap4.put("parentOid","1");
        childMap4.put("roleOid",3);
        childMap4.put("userPid",3);
        childMap4.put("versionNo",0);



        childList.add(childMap);
        childList.add(childMap1);
        childList.add(childMap2);
        childList.add(childMap3);
        childList.add(childMap4);
        childList.add(map);
//        map.put("children",childList);
//        list.add(map);
        return ReturnDTO.create("0", childList, "登录成功");
    }
    /**
     *
     * @return
     */
    @PostMapping(value = "/system/findUserAccessFunction")
    public ReturnDTO  findUserAccessFunction(){
        List<Map> list=new ArrayList<>();
        Map map = new HashMap<>();
        map.put("menuUrl","/system");
        map.put("menuName","系统管理");
        map.put("icon","SettingIcon");
        map.put("tip","new");
        map.put("parentPath","");
        List<Map> childList=new ArrayList<>();
        Map childMap=new HashMap();

        childMap.put("menuUrl","/system/department");
        childMap.put("menuName","部门管理");
        childMap.put("icon","SettingIcon");
        childMap.put("tip","new");
        childMap.put("parentPath","/system");
        childMap.put("cacheable","true");
        childList.add(childMap);
        map.put("children",childList);
        list.add(map);
        return ReturnDTO.create("0", map, "登录成功");
    }
    private String randomString() {
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        for (int i = 100; i > 0; --i) {
            result += str;
        }
        return result;
    }
}
