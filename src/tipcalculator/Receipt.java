package tipcalculator;

public class Receipt {
    protected double total;
    protected double rate = 0.20;
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public double calculateTip() {
        return total * rate;
    }
}
