package MBGroup.MyBankWeb.Controllers;

import MBGroup.MyBankWeb.Services.UsersInfoService;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersInfoController {
    public UsersInfoService usersInfoService;

    public UsersInfoController(UsersInfoService usersInfoService){
        this.usersInfoService = usersInfoService;
    }
}
