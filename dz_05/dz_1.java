//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package dz_05;

public class dz_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Юра", "9842312434");
        phoneBook.add("Алексей", "98321321245");
        phoneBook.add("Алексей", "9464363123");
        phoneBook.add("Алена", "9426564245");
        phoneBook.add("Юра", "921356451415");
        phoneBook.add("Алексей", "9876155245");
        phoneBook.show();
        phoneBook.findNoteByNumber("89442245");
        phoneBook.removeNumber("15666442245");
        phoneBook.showNote("Алексей");
        phoneBook.removeNote("Алена");
        phoneBook.show();

    }
}