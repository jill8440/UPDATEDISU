
public abstract class BudgetItem {

    protected String name;
    protected double amount;
    protected String message;
    protected String inputdate;
    
    private static final double BASE_EXPENSE = 150.00;
    
    public BudgetItem(){
        name = "";
        amount = 0;
        inputdate= "";
        System.out.println("Hi");
    }
    public BudgetItem(String n, double a, String i){
        name = n;
        amount = a;
        inputdate = i;
    }
    final public String getInputDate(){
        return inputdate;
    }
    final public String getName(){
        return name;
    }
    public double getAmount(){
        return amount;
    }
    public static double getExpense(){
        return BASE_EXPENSE;
    }
    public String toString(){
        return inputdate + "\t" + name + ": $" + amount;
    }
    //validate data can be changed in child classes
    abstract public String validateData();
    
}
