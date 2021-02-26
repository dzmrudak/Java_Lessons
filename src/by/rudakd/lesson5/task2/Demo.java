package by.rudakd.lesson5.task2;
/*2.Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
        Создать массив объектов. Вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.*/

public class Demo {
    // При создании нового объекта Customer, введите
    // Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        Customer customer1 = new Customer("Rudak", "Dzmitry", "Valer'evich", "Belarus", 160, "60");
        Customer customer2 = new Customer("Ivanov", "Ivan", "Ivanovich", "Poland", 130, "30");
        Customer customer3 = new Customer("Petrov", "Petr", "Petrovich", "Germany", 110, "10");
        Customer customer4 = new Customer("Sidorov", "Sidr", "Sidorovich", "France", 150, "50");
        customers[0] = customer1;
        customers[1] = customer2;
        customers[2] = customer3;
        customers[3] = customer4;

        System.out.println("Cписок покупателей в алфавитном порядке");
        CustomerListInInterval.printSortedArrayOfCustomers(customers);
        System.out.println();

        System.out.println("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial value of the Interval: ");
        int startOfInterval = sc.nextInt();
        System.out.print("Enter the end value of the Interval: ");
        int endOfInterval = sc.nextInt();

        while (endOfInterval < startOfInterval) {
            System.out.println();
            System.out.println("The endOfInterval should be >= the startOfInterval");
            System.out.print("Enter the end value of the Interval: ");
            endOfInterval = sc.nextInt();
        }

        CustomerListInInterval.printArrayInInterval(startOfInterval, endOfInterval, customers);
    }
