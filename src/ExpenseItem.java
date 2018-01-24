
public class ExpenseItem extends BudgetItem{
    private String type;
    
    public ExpenseItem() {
        super();
    }

    public ExpenseItem(String n, double a, String i, String t) {
        super(n, a ,i);
        type = t;
    }
    public void setType(String t){
        type = t;
    }
    public String getType(){
        return type;
    }
    public String validateData(){
        if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	//check if amount is entered
	if (amount<0) 
    		message += "\nAmount must be a postive number, please re-enter all data";
        //add the type to the validation
        if (type.equals("")){
    		message += "\nType is required\nPlease re-enter all data";
        }
        return message;
    }
}
