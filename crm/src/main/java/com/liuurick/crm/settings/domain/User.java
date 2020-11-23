package com.liuurick.crm.settings.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liubin ON 2020/11/20 19:38
 * @param: 
 * @return
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /*
        关于字符串中表现的日期及时间
        我们在市场上常用的有两种方式
        日期：年月日
              yyyy-MM-dd 10位字符串

        日期+时间：年月日时分秒 19位字符串
              yyyy-MM-dd HH:mm:ss
     */

    /*
        关于登录
            验证账号和密码
            User user = 执行sql语句select * from tbl_user where loginAct=? and loginPwd=?

            user对象为null，说明账号密码错误

            如果user对象不为null，说明账号密码正确

            需要继续向下验证其他的字段信息

            从user中get到

            expireTime 验证失效时间
            lockState 验证锁定状态
            allowIps 验证浏览器端的ip地址是否有效
     */

    private String id;  //编号 主键
    private String loginAct;    //登录账号
    private String name;    //用户的真实姓名
    private String loginPwd;    //登录密码
    private String email;   //邮箱
    private String expireTime;  //失效时间 19
    private String lockState;   //锁定状态 0：锁定   1：启用
    private String deptno;  //部门编号
    private String allowIps;    //允许访问的ip地址
    private String createTime;  //创建时间 19
    private String createBy;    //创建人
    private String editTime;    //修改时间 19
    private String editBy;  //修改人

}
