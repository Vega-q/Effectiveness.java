package practice;

public class SaveMoney {
    public static void main(String args[]) {
        int amount = 8000;
       CommercialBank bank=new CommercialBank();
       bank.savedMoney=amount;
       bank.year=8.236;
       bank.setInterestRate(0.035);
       double interest= bank.computerInterest();
    }
}
