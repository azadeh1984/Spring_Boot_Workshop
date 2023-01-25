package se.lexicon.spring_boot_workshop.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false )
    private int appUserId;
    @Column(nullable = false,length = 100)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(name = "reg_date")
    private LocalDate registrationDate;
    private Details details;

    public AppUser(int appUserId, String userName, String password, LocalDate registrationDate, Details details) {
        this.appUserId = appUserId;
        this.userName = userName;
        this.password = password;
        this.registrationDate = registrationDate;
        this.details = details;
    }

    public AppUser() {

    }

    public int getAppUserId() {
        return appUserId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }


    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return appUserId == appUser.appUserId && Objects.equals(userName, appUser.userName) && Objects.equals(password, appUser.password) && Objects.equals(registrationDate, appUser.registrationDate) && Objects.equals(details, appUser.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appUserId, userName, password, registrationDate, details);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "appUserId=" + appUserId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                ", details=" + details +
                '}';
    }
}
