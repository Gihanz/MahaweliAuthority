
package model;

public class UserModel {
    private String userName;
    private String fullName;
    private String email;
    private String address;
    private String gender;
    private String telNo;
    private String password;
    private String typeOfUser;

    public UserModel(String userName, String fullName, String email, String address, String gender, String telNo, String password, String typeOfUser) {
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.telNo = telNo;
        this.password = password;
        this.typeOfUser = typeOfUser;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the typeOfUser
     */
    public String getTypeOfUser() {
        return typeOfUser;
    }

    /**
     * @param typeOfUser the typeOfUser to set
     */
    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }
    
    
}
