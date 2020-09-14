package cc.sitec.example.request;

import sitec.cc.example.common.request.CommonRequest;

import java.time.LocalDateTime;

public class UserUpdateRequest extends CommonRequest {
    /**
     * 用户账户
     */
    private String account;

    /**
     * 用户名称
     */
    private Integer userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
