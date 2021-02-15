package by.rudakd.lesson5.task2;

import java.util.Arrays;

public class Demo {
    // При создании нового объекта Customer, введите
    // Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        Customer customer1 = new Customer("Rudak", "Dzmitry", "Valer'evich", "Belarus", 160, 60);
        Customer customer2 = new Customer("Ivanov", "Ivan", "Ivanovich", "Poland", 130, 30);
        Customer customer3 = new Customer("Petrov", "Petr", "Petrovich", "Germany", 110, 10);
        Customer customer4 = new Customer("Sidorov", "Sidr", "Sidorovich", "France", 150, 50);
        customers[0] = customer1;
        customers[1] = customer2;
        customers[2] = customer3;
        customers[3] = customer4;

        printSortedArray.shuttleSorting(customers);
        System.out.println();
        CustomerListInInterval.customerListInInterval(customers);
    }
}
