package Lesson_04_Aggregation_composition.Ex_4;

// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
// счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
// всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class MainBank {

    public static void main(String[] args) {


        Bank priorbank = new Bank("Priorbank" );


        Client yakushev = new Client("Ivan", "Yakushev", "ENB7654_76");
        Client shulc = new Client("Egor", "Shulc", "ENB7644_89");

        priorbank.addNewClient(yakushev);
        priorbank.addNewClient(shulc);

        yakushev.openAccount(new Account(105.25));
        yakushev.openAccount(new Account(301.15));
        yakushev.openAccount(new Account(40.85));
        yakushev.openAccount(new Account(76.33));


        shulc.openAccount(new Account(33.44));
        shulc.openAccount(new Account(44.12));
        shulc.openAccount(new Account(56.78));
        shulc.openAccount(new Account(44.55));



//        lock check
        System.out.println(priorbank.getClient("ENB7654_76").getAccount(1).getStatus());
        priorbank.getClient("ENB7654_76").blockAccaunt(1);
        System.out.println(priorbank.getClient("ENB7654_76").getAccount(1).getStatus() + "\n");
//
//        //sorting check
        System.out.println(priorbank.getClient("ENB7654_76").getInformation());
        priorbank.getClient("ENB7654_76").sortByBalance();
        System.out.println(priorbank.getClient("ENB7654_76").getInformation());
        priorbank.getClient("ENB7644_89").sortByBalance();
        System.out.println(priorbank.getClient("ENB7644_89").getInformation());

        //print the total balance
        System.out.println(yakushev.toString() + ", total balance: " + yakushev.getBalance());
        System.out.println(shulc.toString() + ", total balance: " + shulc.getBalance());

        //print balance of positive accounts
        System.out.println();
        System.out.println(yakushev.toString() + ", positive balance: " + yakushev.getBalancePositiveAccounts());
        System.out.println(shulc.toString() + ", positive balance: " + shulc.getBalancePositiveAccounts());

        //print balance of negative accounts
        System.out.println();
        System.out.println(yakushev.toString() + ", negative balance: " + yakushev.getBalanceNegativeAccounts());
        System.out.println(shulc.toString() + ", negative balance: " + shulc.getBalanceNegativeAccounts());
    }
}


