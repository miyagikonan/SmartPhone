public class SmartPhone {
    String model;
    String os;
    Account account;
    AddressBook[] addressBooks;
    String[] apps;

    public SmartPhone(String model, String os) {
        this.model = model;
        this.os = os;

        addressBooks = new AddressBook[10];
        apps = new String[10];
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void displayDeviceInfo() {
        System.out.println(model + " " + os);
    }

    public void displayMyAccount() {
        System.out.println(account.getAccountInfo());
    }

    public boolean addAddressBook(AddressBook addressBooks) {
        for (int i = 0; i < this.addressBooks.length; i++) {
            if (this.addressBooks[i] == null) {
                this.addressBooks[i] = addressBooks;
                return true;
            }
        }
        return false;
    }

    public void displayAppList(){
        for (var i = 0; i < apps.length; i++){
            System.out.println(apps[i]);
        }
    }
}
