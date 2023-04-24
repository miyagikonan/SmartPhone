public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone", "Android");
        smartPhone.displayDeviceInfo();

        Account account = new Account("miyagi", "01011112222", "j@email", "abcd");
        System.out.println(account.getAccountInfo());

        AddressBook addressBook = new  AddressBook("gg","123445678","t@email");
        System.out.println(addressBook.name + " " +  addressBook.tel + " " + addressBook.email);
        smartPhone.addAddressBook(addressBook);
    }
}