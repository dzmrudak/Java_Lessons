package by.rudakd.lesson5.task2;

public class Customer {
    public static int id = 1;
    public int customerId;
    public String surname;
    public String name;
    public String fatherName;
    public String address;
    public int creditCardId;
    public String bankAccountId;

    public Customer(String surname, String name, String fatherName, String address, int creditCardId, String bankAccountId) {
        customerId = id++;
        //amountOfCustomers = customerId;
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.address = address;
        this.creditCardId = creditCardId;
        this.bankAccountId = bankAccountId;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Customer.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardId=" + creditCardId +
                ", bankAccountId=" + bankAccountId +
                "}";
    }
}
