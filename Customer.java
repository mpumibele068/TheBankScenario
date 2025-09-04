class Customer {
    private String firstName;
    private String surname;
    private String address;

    public Customer(String firstName, String surname, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + surname + ", Address: " + address;
    }
}
