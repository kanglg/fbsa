package org.kanglg.app.auth.web;

import org.kanglg.app.auth.entity.BSysUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆
 * Created by kanglg on 2017/2/23.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    public void login(@RequestBody BSysUser user) {
    }
}
