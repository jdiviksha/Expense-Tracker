public class Address {
    private Long doorNum;
    private String streetName;
    private String city;
    private String landmark;
    private String state;
    private Long pincode;

    public Address() {}

    public Address(Long doorNum, String streetName, String city, String landmark, String state, Long pincode) {
        this.doorNum = doorNum;
        this.streetName = streetName;
        this.city = city;
        this.landmark = landmark;
        this.state = state;
        this.pincode = pincode;
    }

    public Long getDoorNum() {
        return doorNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getState() {
        return state;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setDoorNum(Long doorNum) {
        this.doorNum = doorNum;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }
}
