public class Account {

    String name;
    String tel;
    String email;
    String address;

    public Account(String name,String tel,String email,String address){
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo(){
        String accountInfo = "Name: "  + name + "/";
        accountInfo += "Tel: " + tel + "/";
        accountInfo += "Email: "+ email + "/";
        accountInfo += "Address: "+ address + "/";
        return accountInfo;
    }

}
