import javax.swing.*;

public class Ch2a_2 {

    public static void main(String[] args) {
        int ticketAmount;
        final float TICKET = 75, FEE = 20;
        final double TAX = 1.07, total;
        String input;

        input = JOptionPane.showInputDialog(null, "Enter number of tickets: ");
        ticketAmount = Integer.parseInt(input);
        total = ((ticketAmount * TICKET) + FEE) * TAX;

        JOptionPane.showMessageDialog(null, String.format("Your total is $%,.2f", total));
    }
}
