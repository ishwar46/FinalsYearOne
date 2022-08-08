package OOPSample.BillCal;

public class CalC {

    private double electricityUnitCharges;
    private double chargePerUnit;
    private double totalCharge;

    public  CalC(double electricityUnitCharges){
        this.electricityUnitCharges=electricityUnitCharges;
    }


    public double getElectricityUnitCharges() {
        return electricityUnitCharges;
    }

    public void setElectricityUnitCharges(double electricityUnitCharges) {
        this.electricityUnitCharges = electricityUnitCharges;
    }

    public double getChargePerUnit() {
        return chargePerUnit;
    }

    public double getTotalCharge() {
        return totalCharge;
    }

    void calculateTotalBill(){
        if(this.electricityUnitCharges<=50){
            this.chargePerUnit=0.50;
        }
        else if(this.electricityUnitCharges<=150){
            this.chargePerUnit=0.75;
        }
        else if(this.electricityUnitCharges<=250){
            this.chargePerUnit=1.20;
        }
        else if(this.electricityUnitCharges>250){
            this.chargePerUnit=1.50;
        }
        this.totalCharge=(this.electricityUnitCharges*this.chargePerUnit)+((this.electricityUnitCharges*this.chargePerUnit)*20/100);
        System.out.println(this.totalCharge);
    }
}