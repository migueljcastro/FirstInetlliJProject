package javaclass13;

public class BankApplication {
    public static void main(String[] args) {
        javaclass13.Account burjusAccount=new javaclass13.Account();
        burjusAccount.accountId="123";
        burjusAccount.userName="Burju";
        burjusAccount.password="pass123";
        burjusAccount.balance=1000000;
        burjusAccount.typeOfAccount="checking";
        burjusAccount.limit=125;

        boolean isLoggedIn=burjusAccount.login("Burju", "pass123");
        if(isLoggedIn){
            System.out.println("Welcome to Syntax bank");
        }else {
            System.out.println("Invalid user name or password");
        }

        double amountToTransfer=burjusAccount.amountTransfer(100);
        if(amountToTransfer==0){
            System.out.println("Insufficient balance");
        }else {
            System.out.println(amountToTransfer+" Transferred");
        }


        javaclass13.Account eliassAcount=new javaclass13.Account();
        eliassAcount.accountId="125";
        eliassAcount.userName="Elias";
        eliassAcount.password="pass123";
        eliassAcount.balance=15000;
        eliassAcount.typeOfAccount="saving";
        eliassAcount.limit=100;




    }

}