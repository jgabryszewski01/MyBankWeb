package MBGroup.MyBankWeb.Controllers;

import MBGroup.MyBankWeb.Services.UsersInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
public class LoginController {

    private UsersInfoService usersInfoService;

    public LoginController(UsersInfoService usersInfoService) {
        this.usersInfoService = usersInfoService;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CompletableFuture<ResponseEntity<String>> login(@RequestParam("email") String email,
                                           @RequestParam("password") String password) {
        return usersInfoService.validateUser(email, password)
                .thenApply(isValid -> {
                    if (isValid) {
                        return ResponseEntity.ok("Log in successful");
                    } else {
                        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed. Incorrect email or password");
                    }
                })
                .exceptionally(ex -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Authentication error"));
    }
}
