package com.myselfbbs.controller;

import com.myselfbbs.vo.account.LoginReqData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myselfbbs.vo.ServiceResponse;

@RestController
@RequestMapping("/api/account")
public class AccountController {


    @PostMapping("/login")
    public ServiceResponse Login(@RequestBody LoginReqData reqData){
        return new ServiceResponse();
    }

}
