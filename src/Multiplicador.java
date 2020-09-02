import javax.swing.*;

public class Multiplicador {
    public static void main(String args[]){
        Mult();
    }
    public static void Mult(){

        double numero1, numero2, total=0;
        String valores="";

        valores = JOptionPane.showInputDialog(null, "primeiro número: ");
        numero1= Double.parseDouble(valores);
        valores = JOptionPane.showInputDialog(null, "segundo número: ");
        numero2 = Double.parseDouble(valores);
        //multiplicação dos valores abaixo
        total = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "produto é: " + total);
    }
}