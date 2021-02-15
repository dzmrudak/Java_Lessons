package by.rudakd.lesson5.task2;
/*2.Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
        Создать массив объектов. Вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

import java.util.Arrays;

public class Customer {
    public static int id = 1;
    public int customerId;
    public String surname;
    public String name;
    public String fatherName;
    public String address;
    public int creditCardId;
    public int bankAccountId;

    public Customer(String surname, String name, String fatherName, String address, int creditCardId, int bankAccountId) {
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
