package MBGroup.MyBankWeb.Data;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsersInfo {
    private String PESEL;
    private String accountNumber;
    private double balance;
    private String email;
    private String name;
    private String surname;
    private String phone;
}
