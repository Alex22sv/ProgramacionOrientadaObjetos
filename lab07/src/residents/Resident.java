package residents;

public class Resident {
    private String names;
    private String lastNames;
    private int apartmentNumber;
    private double debtBalance;
    private String phoneNumber;
    private String email;

    public Resident(String names, String lastNames, int apartmentNumber, double debtBalance, String phoneNumber, String email){
        this.names = names;
        this.lastNames = lastNames;
        this.apartmentNumber = apartmentNumber;
        this.debtBalance = debtBalance;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNames() {return names;}
    public void setNames(String names) {this.names = names;}
    public String getLastNames() {return lastNames;}
    public void setLastNames(String lastNames) {this.lastNames = lastNames;}
    public int getApartmentNumber() {return apartmentNumber;}
    public void setApartmentNumber(int apartmentNumber) {this.apartmentNumber = apartmentNumber;}
    public double getDebtBalance() {return debtBalance;}
    public void setDebtBalance(double debtBalance) {this.debtBalance = debtBalance;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}
