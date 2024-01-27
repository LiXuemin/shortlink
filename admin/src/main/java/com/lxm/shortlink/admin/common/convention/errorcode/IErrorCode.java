package com.lxm.shortlink.admin.common.convention.errorcode;

/**
 * @author lixuemin
 * @description: 异常码定义
 * @date 2024-01-27
 */
/**
 * 平台错误码
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
