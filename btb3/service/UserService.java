package week_3.service;

import week_3.model.User;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> users;

    public UserService(ArrayList<User> users){
        this.users = users;
    }

    public void getUserById( String userId) {
        int check = 0;
        for (User i : users) {
            if (i.getId().equals(userId)) {
                System.out.println(i);
                check = 1;
                break;
            }
        }
        if(check == 1){
            System.out.println("Khong tim thay tai khoan co ID nay!");
        }
    }

    public void getAllUsers() {
        System.out.println("Danh sach tat ca tai khoan: ");
        for (User i : users)
            System.out.println(i);
    }
}
