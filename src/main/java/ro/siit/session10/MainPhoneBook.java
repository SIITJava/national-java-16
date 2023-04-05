package ro.siit.session10;

public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact filip = new Contact("Filip FIAT");
        phoneBook.createContact(filip);
        phoneBook.addPhoneNumber(filip, "0745630370");
        phoneBook.addPhoneNumber(filip, "0712435601");

        Contact filip2 = new Contact("Filip Fiat");
        phoneBook.createContact(filip2);
        phoneBook.addPhoneNumber(filip2, "0745630371");
        phoneBook.addPhoneNumber(filip2, "0712435600");

        Contact john = new Contact("John Doe");
        phoneBook.createContact(john);
        phoneBook.addPhoneNumber(john, "0746437644");
        phoneBook.addPhoneNumber(john, "0356720945");

        phoneBook.addPhoneNumber(filip, "0712434401");

        Contact jane = new Contact("Jane Doe");
        phoneBook.createContact(jane);
        phoneBook.addPhoneNumber(jane, "0245632924");

        phoneBook.printAgenda();
    }
}
