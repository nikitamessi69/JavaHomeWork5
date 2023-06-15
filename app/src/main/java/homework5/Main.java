package homework5;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Вася", "1234567890");
        phoneBook.addContact("Маша", "2345678901");
        phoneBook.addContact("Вася", "3456789012");
        phoneBook.addContact("Петя", "4567890123");
        phoneBook.addContact("Маша", "5678901234");

        phoneBook.printPhoneBook();
    }
}
