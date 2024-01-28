package classes.task4;

public class PostalAddress {
    private String country;
    private String city;
    private String index;
    private String street;

    PostalAddress(String country, String city, String index, String street) {
        this.country = country;
        this.city = city;
        this.index = index;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getIndex() {
        return index;
    }
    public void setIndex(String index) {
        this.index = index;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

}
