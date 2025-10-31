// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tuan3_baitapthem;

public class User {

    private String id;
    private String userName;
    private String passWord;
    private String email;
    private String phoneNumber;

    public User() {
    }

    public User(String id, String userName, String passWord, String email, String phoneNumber) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
                + ", phoneNumber=" + phoneNumber + '}';
    }

}
