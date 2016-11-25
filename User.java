/**
 * Created by VINNI on 25.11.16.
 */
class User {
    long id;
    String name;
    double balance;
    int monthsEmpkoyment;
    String companyName;
    int salary;

    public static void main(String[] args) {
        Bank bank = new Bank(1000);
        System.out.println(bank);

    }

}