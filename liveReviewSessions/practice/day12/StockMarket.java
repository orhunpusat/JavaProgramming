package practice.day12;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many total shares do you have already?");
        int totalShares = scan.nextInt();

        String result = "Invalid numbers of shares";

        if (totalShares > 0) {
            System.out.println("how much is your total value in the stock market?");
            double totalValue = scan.nextDouble();
            scan.nextLine();
            System.out.println("enter the name of the company you have the most shares");
            String companyName = scan.nextLine();



            result = "Your total stock market holding is $"+totalValue+" which is made up of "+totalShares+
                    ". "+companyName+" is your company holdings";
        }
        System.out.println(result);
        scan.close();

    }
}
/*
StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition
            should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in
        (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares.
            Apple INC is your company holdings"

 */