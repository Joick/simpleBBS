package com.myselfbbs.controller;

import com.myselfbbs.service.IAccountService;
import com.myselfbbs.vo.ServiceResponse;
import com.myselfbbs.vo.account.LoginReqData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;


    @PostMapping("/login")
    public ServiceResponse Login(@RequestBody LoginReqData reqData) {
        ServiceResponse result = new ServiceResponse();

        result.success(reqData);
        return result;
    }

}
