import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //5-12 declares all the variables that are going to be used to either print or do math
        int tip;
        int people;
        double bill;
        double totalTipAmount;
        double billAndTip;
        double tipPerPerson;
        double totalPerPerson;

        System.out.print("Bill: $"); // 14-16 gets the bill and turns it into a double
        String tempBill = s.nextLine();
        bill = Double.parseDouble(tempBill);
        System.out.print("Tip (as whole number): "); // 17-19 gets the tip percent as a whole number and turns it into int
        String tempTip = s.nextLine();
        tip = Integer.parseInt(tempTip);
        System.out.print("Number of people: "); // 20-22 gets the amount of people and turns it into an int
        String tempPeople = s.nextLine();
        people = Integer.parseInt(tempPeople);

        totalTipAmount = Math.round((bill * ((double) tip / 100)) * 100.00) / 100.00;
        billAndTip = Math.round((bill + totalTipAmount) * 100.00) / 100.00;
        tipPerPerson = Math.round((totalTipAmount / people) * 100.00) / 100.00;
        totalPerPerson = Math.round((billAndTip / people) * 100.00) / 100.00;

        System.out.println("The total tip amount is $" + totalTipAmount);
        System.out.println("The bill including tip is $" + billAndTip);
        System.out.println("The tip per person is $" + tipPerPerson);
        System.out.println("The total per person is $" + totalPerPerson);





    }
}