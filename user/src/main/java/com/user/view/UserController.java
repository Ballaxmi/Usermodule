package com.user.view;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.UserModule;
import com.user.service.UserService;
@RestController
public class UserController {
@Autowired
UserService userService;

 @RequestMapping({ "/", "/usermoduleproject" })
public List<UserModule> getSignupData() {
return userService.getSignupData();
}
}