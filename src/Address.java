public class Address {
    String street;
    String number;
    String city;
    String country;
    public Address(String street, String number, String city, String country)
    {
        this.street=street;
        this.number=number;
        this.city=city;
        this.country=country;
    }
    @Override
    public String toString() {
        return "Street: " + street + "\n"
                + "Number: " + number + "\n"
                + "City: " + city + "\n"
                + "Country: " + country + "\n";
    }
}
