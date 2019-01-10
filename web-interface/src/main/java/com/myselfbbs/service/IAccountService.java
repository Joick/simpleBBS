package com.myselfbbs.service;

import com.myselfbbs.vo.account.LoginReqData;
import com.myselfbbs.vo.account.RegisterReqModel;

/**
 * 账户相关接口
 */
public interface IAccountService {

    /**
     * 注册
     *
     * @param reqData
     * @return
     */
    Boolean doRegist(RegisterReqModel reqData);

    /**
     * 登录
     *
     * @param reqData
     * @return
     */
    Boolean doLogin(LoginReqData reqData);
}
