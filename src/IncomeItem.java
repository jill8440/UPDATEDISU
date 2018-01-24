
public class IncomeItem extends BudgetItem {

    private String frequency;
    private static int numitems=0;

    public IncomeItem() {
        
        super();
        numitems++;
        System.out.println("" + numitems);
    }

    public static int getCount(){
        return numitems;
    }
    
    public IncomeItem(String n, double a, String i, String f) {
        super(n, a, i);
        frequency = f;
    }
    public double getAmount(){
        super.getAmount();
        return amount;
    }
    public void setFrequency(String f){
        frequency = f;
    }
    public String getFrequency(){
        return frequency;
    }
    public String validateData(){
        if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	//check if amount is entered
	if (amount<0) 
    		message += "\nAmount must be a postive number, please re-enter all data";
        //add the frequency to the validation
        if (frequency.equals("")){
    		message += "\nFrequency is required\nPlease re-enter all data";
        }
        return message;
    }
    
}
