// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan3_baitapthem;

import java.util.ArrayList;
import java.util.Scanner;


public class AuthService {

    Scanner sc = new Scanner(System.in);
    ArrayList<User> List = new ArrayList<>();
    boolean flag = false;

    // ham them user
    public void register() {
        System.out.println("Nhap so luong user ma ban muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin user thu " + (i + 1) + ": ");
            System.out.println("Nhap Id: ");
            String Id = sc.nextLine();
            System.out.println("Nhap username: ");
            String username = sc.nextLine();
            String password;
            while (true) {
                System.out.println("Nhap password: ");
                password = sc.nextLine();
                if (validPassword(password)) {
                    break;
                } else {
                    System.out.println("Password phai co Chu hoa, Chu thuong, Ki tu, Chu so, Ki tu dac biet");
                }
            }
            String email;
            while (true) {
                System.out.println("Nhap email: ");
                email = sc.nextLine();
                if (validEmail(email)) {
                    break;
                } else {
                    System.out.println("Email phai co duoi @gmail.com");
                }
            }
            String phoneNumber;
            while (true) {
                System.out.println("Nhap phone number: ");
                phoneNumber = sc.nextLine();
                if (validPhoneNumber(phoneNumber)) {
                    break;
                } else {
                    System.out.println("Phone number phai co 10 chu so");
                }
            }
            User user = new User(Id, username, password, email, phoneNumber);
            List.add(user);
        }
    }

    private boolean validPassword(String passWord) {
        if (passWord.length() < 5) {
            return false;
        }
        // regex kiem tra mat khau co it nhat 1 chu cai in hoa, 1 chu cai in thuong, 1
        // chu so, 1 ky tu dac biet
        // cach 1
        // thank a Hieu Lop c# chi em nhe:)
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{5,}$";
        if (!passWord.matches(regex)) {
            return false;
        }
        return true;
        // cach 2 chuyen day ve char array roi kiem tra tung dieu kien
        // char[] passwordChars = passWord.toCharArray();
        // boolean hasUpperCase = false;
        // boolean hasLowerCase = false;
        // boolean hasDigit = false;
        // boolean hasSpecialChar = false;
        // for (char c : passwordChars) {
        // if (Character.isUpperCase(c)) {
        // hasUpperCase = true;
        // } else if (Character.isLowerCase(c)) {
        // hasLowerCase = true;
        // } else if (Character.isDigit(c)) {
        // hasDigit = true;
        // } else if ("@$!%*?&".indexOf(c) != -1) {
        // hasSpecialChar = true;
        // }
        // }
        // return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    private boolean validEmail(String email) {
        // email phai co dinh dang @gmail.com
        String regex = "^[A-Za-z0-9+_.-]+@gmail\\.com$";
        if (!email.matches(regex)) {
            return false;
        }
        return true;
    }

    private boolean validPhoneNumber(String phoneNumber) {
        // phone number phai bat dau bang 0 va co 10 chu so
        String regex = "^0\\d{9}$";
        if (!phoneNumber.matches(regex)) {
            return false;
        }
        return true;
    }

    // ham login vao service
    public void login(String userName, String passWord) {
        flag = false;
        for (User user : List) {
            if (user.getUserName().equals(userName) && user.getPassWord().equals(passWord)) {
                System.out.println("Login thanh cong");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Login khong thanh cong,Tai khoan hoac Mat khau khong chinh xac");
        }
    }

    // ham doi password
    public void changePassword(String userId, String newPassword, String comfirmNewPassword) {

        for (User user : List) {
            if (user.getId().equals(userId)) {
                if (newPassword.equals(comfirmNewPassword)) {
                    user.setPassWord(newPassword);
                    System.out.println("Doi mat khau thanh cong");
                } else {
                    System.out.println("Mat khau moi khong khop");
                }
                return;
            }
        }
        System.out.println("Khong tim thay user de doi mat khau");
    }
}
