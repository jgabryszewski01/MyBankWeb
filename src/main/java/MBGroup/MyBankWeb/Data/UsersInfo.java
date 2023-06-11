package MBGroup.MyBankWeb.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;



@Setter
@Getter
public class UsersInfo {

    @NotNull(message = "PESEL cannot be missing or empty")
    @Size(min = 11,max = 11, message = "PESEL must have 11 characters")
    private String PESEL;
    private String accountNumber;
    private double balance;
    @Email(message = "Enter valid email")
    private String email;
    @NotNull(message="First name cannot be missing or empty")
    @Size(min=2, message="First name must not be less than 2 characters")
    private String name;
    @NotNull(message="Surname cannot be missing or empty")
    @Size(min=2, message="Surname must not be less than 2 characters")
    private String surname;
    @NumberFormat
    @Size(min=9, message="Enter valid phone number")
    private String phone;

    public UsersInfo(String PESEL, String accountNumber, double balance, String email, String name, String surname, String phone) {
        this.PESEL = PESEL;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
