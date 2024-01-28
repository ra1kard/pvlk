package classes.task4;

public class Organisation {
    private PostalAddress postalAddress;
    private PhysicalAddress physicalAddress;
    private String name;
    private String owner;

    Organisation(PostalAddress postalAddress, PhysicalAddress physicalAddress, String name, String owner) {
        this.postalAddress = postalAddress;
        this.physicalAddress = physicalAddress;
        this.name = name;
        this.owner = owner;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }
    public void setPhysicalAddress(PhysicalAddress physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void printOrganisationInfo(Organisation organisation) {
        System.out.println(organisation.getName());
        System.out.println(organisation.getOwner());
        System.out.println(
                "Почтовый адрес: " +
                organisation.getPostalAddress().getCountry() + ", " +
                organisation.getPostalAddress().getCity() + ", " +
                organisation.getPostalAddress().getIndex() + ", " +
                organisation.getPostalAddress().getStreet());
        System.out.println(
                "Физический адрес: " +
                organisation.getPhysicalAddress().getCountry() + ", " +
                organisation.getPhysicalAddress().getCity() + ", " +
                organisation.getPhysicalAddress().getIndex() + ", " +
                organisation.getPhysicalAddress().getStreet());
    }
}
