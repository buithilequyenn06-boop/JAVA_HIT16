package week_3;

import week_3.model.User;
import week_3.service.AuthService;
import week_3.service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        String userId;
        String username;
        String password;
        String email;
        String phoneNumber;
        users.add(new User("U" + (users.size() + 1 ), "LeQuyen", "Q123", "Quyen@gmail.com", "0137479470"));
        users.add(new User("U" + (users.size() + 1 ),"TienDung", "D456", "Dung@gmail.com", "0264825473"));
        users.add(new User("U" + (users.size() + 1 ) , "KhanhToan", "T789", "Toan@gmail.com", "0303123453"));
        users.add(new User("U" + (users.size() + 1 ), "ThienBao", "B987", "Bao@gmail.com", "0842975908"));
        users.add(new User("U" + (users.size() + 1 ) , "Quynhf", "F998", "Quynh@gmail.com", "093142797"));

        AuthService authService = new AuthService(users);
        UserService userService = new UserService(users);

        int choice;
        while (true){
            System.out.println("----Menu Auth----");
            System.out.println("1. Login       ");
            System.out.println("2. Register    ");
            System.out.println("3.Exit         ");
            System.out.print("Lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Username: ");
                    username = sc.nextLine();
                    System.out.print("Password: ");
                    password = sc.nextLine();
                    boolean login = authService.login(username, password);
                    if (login) {
                        System.out.println("Dang nhap thanh cong!");
                        int option;
                        System.out.println("\n--- MENU USER  ---");
                        System.out.println("1. Get user by is");
                        System.out.println("2. get all user");
                        System.out.println("3. Change password");
                        System.out.print("Lua chon: ");
                        option = Integer.parseInt(sc.nextLine());

                        switch (option) {
                            case 1:
                                System.out.print("Nhap ID can tim: ");
                                String id = sc.nextLine();
                                userService.getUserById(id);
                                break;
                            case 2:
                                userService.getAllUsers();
                                break;
                            case 3:
                                System.out.print("User ID: ");
                                userId = sc.nextLine();
                                System.out.print("New password: ");
                                String newPassword = sc.nextLine();
                                System.out.print("Confirm new password: ");
                                String confirmNewpassword = sc.nextLine();
                                authService.changePassword(userId, newPassword, confirmNewpassword);
                                break;
                            default:
                                System.out.println("Thoat chuong trinh!");
                        }
                    }
                    else
                        System.out.println("Sai tai khaon hoac mat khau!");
                    break;
                case 2:
                    System.out.print("Username: ");
                    username = sc.nextLine();
                    System.out.print("Password: ");
                    password = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    System.out.print("PhoneNumber: ");
                    phoneNumber = sc.nextLine();
                    authService.register(username, password, email, phoneNumber);
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}