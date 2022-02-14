import java.util.ArrayList;
import java.util.Scanner;

public class fixingBugs 
	{
		
		private static ArrayList<Integer> expenses = new ArrayList<Integer>();

	    public static void main(String[] args) 
	    {
	        System.out.println("\tHello! Welcome to the Fixing Bug Algorithm  \n");
	        System.out.println("\tPlease choose one of the below options to continue \n");
	        expenses.add(1000);
	        expenses.add(2300);
	        expenses.add(45000);
	        expenses.add(32000);
	        expenses.add(110);
	        optionsSelection();
	    }
	    private static void optionsSelection() {
	        String[] arr = {"1. To review expenditure",
	                "2. To add expenditure",
	                "3. To delete the expenditure",
	                "4. To sort the expenditures",
	                "5. To search for a particular expenditure",
	                "6. Exit"
	        };
	        for(int i=0; i<6;i++){
	            System.out.println(arr[i]);
	        }
	        System.out.println("\nEnter your choice:\t");
	        Scanner sc = new Scanner(System.in);
	        int  options =  sc.nextInt();
	        
	        for(int j=1;j<=6;j++){
	            if(options==j){
	                switch (options){
	                    case 1:
	                        System.out.println("Saved expenses are listed below: \n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection();
	                        break;
	                    case 2:
	                        System.out.println("Enter the expenditures to add them in the list: \n");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Entered value is updated in the list\n");
	                        System.out.println(expenses+"\n");
	                        optionsSelection();
	                        break;
	                    case 3:
	                        System.out.println("You are about the delete data in the list! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==options){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("The list is cleared!\n");
	                        } else {
	                            System.out.println("ERROR! Please chose the correct option again");
	                        }
	                        optionsSelection();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        optionsSelection();
	                        break;
	                    case 5:
	                        searchExpenses(expenses, sc);
	                        optionsSelection();
	                        break;
	                    case 6:
	                        closeApp();
	                        break;
	                    default:
	                        System.out.println("ERROR! Please chose the correct option again");
	                        break;
	                }
	            }
	        }
	    }
	    private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	    private static void searchExpenses(ArrayList<Integer> arrayList, Scanner sc) {
	        int leng = arrayList.size();
	        int i = 0;
	        int search;
	        boolean found = false;
	        System.out.println("Enter the expense you need to search:\t");
	        search = sc.nextInt();
	        while(i < leng) {
	        	if (arrayList.get(i) == search) {
	        		System.out.println("Expense found at index " + i);
	        		System.out.println();
	        		i = leng;
	        	}
	        	else {
	        		i++;
	        	}
	        }
	        if(found == false)
	        	System.out.println("Expense not found");
	    }
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	        System.out.println("Sorting the expense in list now...");
	        
	        mergeSort(arrayList);
	        
	        System.out.println("Expense list is sorted now.");
	        System.out.println(expenses+"\n");
	        System.out.println();
	    }
	    private static void mergeSort(ArrayList<Integer> a) {
	    	if (a.size()<=1) 
	    		return; 
	        int mid = a.size()/2; 
	        ArrayList<Integer> left = new ArrayList<Integer>(); 
	        ArrayList<Integer> right = new ArrayList<Integer>();
	        for(int i = 0; i < mid; i++) 
	        	left.add(a.remove(0)); 
	        while (a.size()!=0) 
	        	right.add(a.remove(0));
	        mergeSort(left);  
	        mergeSort(right);
	        while (left.size()!=0 && right.size()!=0) {
	          if (left.get(0) < right.get(0)) 
	        	  a.add(left.remove(0));
	          else                                       
	        	  a.add(right.remove(0));
	        }
	        while(left.size()!=0)  
	        	a.add(left.remove(0));
	        while(right.size()!=0) 
	        	a.add(right.remove(0));
	    }
	}