package com.myself.implementation;

import com.myselfbbs.dao.UserMapper;
import com.myselfbbs.service.IAccountService;
import com.myselfbbs.vo.account.LoginReqData;
import com.myselfbbs.vo.account.RegisterReqModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean doRegist(RegisterReqModel reqData) {
        return true;
    }

    @Override
    public Boolean doLogin(LoginReqData reqData) {
        return true;
    }
}
