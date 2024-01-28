package classes.task3;

public class House {
    private String nameOwner;
    private String address;

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameOwner() {
        return nameOwner;
    }
    public String getAddress() {
        return address;
    }

    House() {
    }

    House(String nameOwner, String address) {
        this.nameOwner = nameOwner;
        this.address = address;
    }
}
