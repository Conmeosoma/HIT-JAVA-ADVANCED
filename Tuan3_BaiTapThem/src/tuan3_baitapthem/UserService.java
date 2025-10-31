package tuan3_baitapthem;

class UserService {

    private AuthService authService;

    public UserService(AuthService authService) {
        this.authService = authService;
    }

    // ham tim user theo Id
    public void getUserbyId(String userId) {
        for (User user : authService.List) {
            if (user.getId().equals(userId)) {
                System.out.println(user);
                return;
            }
        }
        System.out.println("Khong tim thay user voi id: " + userId);
    }

    public void getAllUsers() {
        for (User user : authService.List) {
            System.out.println(user);
        }
    }
}
