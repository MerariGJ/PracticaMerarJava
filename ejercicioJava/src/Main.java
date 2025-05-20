import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static int x3;

    public static void main (String[] args) throws Exception {
        //scoppe

        //System.out.println(1);
        //System.out.println("Hola");
        //System.out.println("4.0");

        String x1 = JOptionPane.showInputDialog("Dame un numero");
        String x2 = JOptionPane.showInputDialog("Dame otro numero");
        String x3 = JOptionPane.showInputDialog("Dame el ultimo numero");

        System.out.println((Integer.parseInt(x1) + Integer.parseInt(x2) + Integer.parseInt(x3)) /3);



    }
}

