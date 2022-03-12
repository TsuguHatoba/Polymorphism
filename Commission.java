package Another_Type_of_Employee;

public class Commission extends Hourly {

    double commissionRate;
    double totalSales;

    public Commission(String eName, String eAddress, String ePhone,	String socSecNumber, double rate, double comm) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comm;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    public double pay() {
        double payment = super.pay();
        payment += totalSales * commissionRate;
        totalSales = 0;
        return payment;
    }

}