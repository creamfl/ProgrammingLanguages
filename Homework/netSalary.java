
public class netSalary {
  public static void main(String[] args){
    String employee = "Peter Medison";
    int grossSalary = 20000;
    float netSalary;

    float stateTaxes = (grossSalary*(28.4f/100.0f));

    float personalTax;

    if((grossSalary - stateTaxes - 7000) > 0)
      personalTax = (grossSalary - stateTaxes - 7000)*(10.0f/100.0f);
    else
      personalTax = 0;
    
    netSalary = grossSalary - stateTaxes - personalTax;

    stateTaxes = Math.round(stateTaxes);
    personalTax = Math.round(personalTax);
    netSalary = Math.round(netSalary);

    System.out.println("The employee " + employee + " with gross salary of: " + grossSalary + " MKD. will get NET salary: " + netSalary + " MKD.");
    System.out.println("State taxes are: " + stateTaxes + " MKD.");
    System.out.println("Personal tax is: " + personalTax + " MKD.");

  }
}
