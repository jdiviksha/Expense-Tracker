public class Userdetails{
    private Long userId;
    private String name;
    private String email;
    private String password;
    private Address address;
    private Long phoneNumber;
    private Long paymentDetails;

    public Userdetails(){
    public Userdetails(Long userId,String name,String email,String password,Address address,Long phoneNumber,Long paymentDetails){
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.paymentDetails = paymentDetails;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(Long paymentDetails) {
        this.paymentDetails = paymentDetails;
    }



    