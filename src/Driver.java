/* 
 * Worood Fathi Assi;
 * # 1210412;
 * lab_11;
 * 
 */
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		//	Create the arrays of Teachers & Courses 
		Course []C_Arr;
		Teacher []T_Arr;

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number of trachers : "); // ask user to enter a numbers of teachers 
		int T_num=input.nextInt();
		T_Arr = new Teacher[T_num];
		
		for(int i=0;i<T_Arr.length;i++) { // Ask the user to enter the different attributes and fill them for each teacher.  
			System.out.println("Enter teacher’s name, id, basic salary, and extra payment rate : ");
			String Tname=input.next();
			int Tid=input.nextInt();
			double basicSalary=input.nextDouble();
			double extraPaymentRate=input.nextDouble();
			//ask the user to enter the number of courses first and then enter their info
			System.out.println("Enter number of courses taught : ");
			int C_num=input.nextInt();
			System.out.println("Enter Course names and ids : ( the course's name must be four chars )");
			C_Arr=new Course[C_num];
			
            int j=0;
			while(j<C_Arr.length) {
//				String Cname=input.next();
//				int Cid=input.nextInt();
//				C_Arr[j]=new Course(Cname,Cid);
				C_Arr[j]=new Course(input.next(), input.nextInt());
			    j++;
			}
			T_Arr[i]=new Teacher(Tname,Tid,basicSalary,extraPaymentRate,C_Arr);
			
		}
		
		int choice=1;
		while(choice != 5) {
			displayMenu();
		   choice=input.nextInt();
		   switch(choice){
		   case 1: // choose 1 to Print Teacher Information:
			   System.out.println("Enter her/his id : ");
			   int Pid=input.nextInt();
			   for(int i=0;i<T_Arr.length;i++) {
				   if(T_Arr[i].getId()==Pid)
				       T_Arr[i].printInfo();
			   }
			   break;
		   case 2: //choose 2 to Display teachers’ total salaries: 
			   for(int i=0;i<T_Arr.length;i++) 
			      System.out.println("The total salary for "+T_Arr[i].getName()+" is "+((T_Arr[i].calculateExtraPayment(T_Arr[i].getExtraPaymentRate()))+ T_Arr[i].getBasicSalary()));
			   break;
		   case 3: //choose 3 to Change basicSalary for a teacher:
			   System.out.println("Enter a teacher's id : ");
			   int iid=input.nextInt();
			   for(int i=0;i<T_Arr.length;i++) {
				   if(T_Arr[i].getId() == iid) {
					   System.out.println("Enter a new basic salary : ");
					   T_Arr[i].setBasicSalary(input.nextDouble());
				   }	   
			   }
			   break;
		   case 4://choose 4 to Display sum of Total Salaries :
			   double total=0;
			   for(int i=0;i<T_Arr.length;i++)
				   total+=(( T_Arr[i].calculateExtraPayment(T_Arr[i].getExtraPaymentRate()) )+ (T_Arr[i].getBasicSalary()));
			   System.out.println(total);
			   break;
			   
		   }
		   // choose 5 to end the program.
		}
		System.out.println("Done");
	}
	
	public static void displayMenu(){   //to display the menu
		System.out.println("\nEnter your choice of tasks ( 1-5 ):\n"
				+ "1- Print teacher Info\n"
				+ "2- Display all teachers names and total Salaries\n"
				+ "3- Change basic salary for a teacher\n"
				+ "4- Display sum of total salaries for all teachers\n"
				+ "5- Exit\n"
				+ "");
	}
}