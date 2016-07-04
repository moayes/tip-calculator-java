package tipcalculator;

public class TipCalculator {

     public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.total = 100.0;
        double tip = receipt.calculateTip();
        System.out.println(tip);
    }
    
}
