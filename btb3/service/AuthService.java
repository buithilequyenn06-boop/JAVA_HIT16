package week_3.service;

import week_3.model.User;

import java.util.ArrayList;

public class AuthService {
    private ArrayList<User> users;

    public AuthService(ArrayList<User> users){
        this.users = users;
    }

    public boolean login(String username, String password ){
        for(User i : users){
            if(i.getUsername().equals(username) && i.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }

    public void register(String username, String password, String email, String phoneNumber){
        for(User i : users ){
            if(i.getUsername().equals(username) && i.getEmail().equals(email) && i.getPhoneNumber().equals(phoneNumber) ){
                System.out.println("Tai khoan da ton tai!");
                return;
            }
        }
        users.add(new User("U" + (users.size() + 1 ), username, password, email, phoneNumber));
        System.out.println("Dang ki tai khoan thanh cong!");
    }

    public void changePassword(String userId, String newPassword, String confirmNewpassword){
        for (User x : users) {
            if (x.getId().equals(userId)) {
                if (newPassword.equals(confirmNewpassword)) {
                    x.setPassword(newPassword);
                    System.out.println("Thay doi mat khau thanh cong!");
                }
                else {
                    System.out.println("Mat khau xac nhan khong dung!");
                }
            }
        }
        System.out.println("Khong tim thay tai khoan!");
    }
}
