package tuan3_baitapthem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthService authService = new AuthService();
        UserService userService = new UserService(authService);
        do {
            System.out.println("_____Menu Auth_____");
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.println("3.Exit");
            System.out.println("Please choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // login
                    System.out.println("Nhap username: ");
                    String username = sc.next();
                    System.out.println("Nhap password: ");
                    String password = sc.next();
                    authService.login(username, password);
                    if (authService.flag == true) {
                        do {
                            System.out.println("_____Menu User_____");
                            System.out.println("1.Get User by Id");
                            System.out.println("2.Get All Users");
                            System.out.println("3.Change Password");
                            System.out.println("Please choose an option: ");
                            int userChoice = sc.nextInt();
                            switch (userChoice) {
                                case 1:
                                    System.out.println("Nhap Id user can tim: ");
                                    String userId = sc.next();
                                    userService.getUserbyId(userId);
                                    break;
                                case 2:
                                    userService.getAllUsers();
                                    break;
                                case 3:
                                    System.out.println("Nhap userId can doi password: ");
                                    String uId = sc.next();
                                    System.out.println("Nhap password moi: ");
                                    String newPass = sc.next();
                                    System.out.println("Xac nhan password moi: ");
                                    String confirmPass = sc.next();
                                    authService.changePassword(uId, newPass, confirmPass);
                                    break;
                                default:
                                    System.out.println("Lua chon khong hop le, vui long chon lai!");
                                    break;
                            }
                        } while (true);
                    }
                    break;
                case 2:
                    authService.register();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai!");
                    break;
            }
        } while (true);
    }
}
