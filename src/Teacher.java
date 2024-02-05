/* 
 * Worood Fathi Assi;
 * # 1210412;
 * lab_11;
 * 
 */
public class Teacher {
	// The attributes for Teacher class:-
	private String name;
	private int id;
	private double basicSalary;
	private double extraPaymentRate;
	private Course []coursesTaught ;
	
	public Teacher() {
		//Default constructor:-

	}
	//non_Default constructor:-
	public Teacher(String name ,int id ,double basicSalary ,double extraPaymentRate ,Course [] coursesTaught) {
		this.name=name;
		this.id=id;
		this.basicSalary=basicSalary;
		this.extraPaymentRate=extraPaymentRate;
		this.coursesTaught=coursesTaught;
	}
	//Setter & getter methods:-
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getExtraPaymentRate() {
		return extraPaymentRate;
	}
	public void setExtraPaymentRate(double extraPaymentRate) {
		this.extraPaymentRate = extraPaymentRate;
	}
	public Course[] getCoursesTaught() {
		return coursesTaught;
	}
	public void setCoursesTaught(Course[] coursesTaught) {
		this.coursesTaught = coursesTaught;
	}
	public  void printInfo() {
		System.out.print(""+name+"  "+id+"  "+basicSalary+"  "+extraPaymentRate+" ");
		
		for(int i=0;i<coursesTaught.length;i++) 
			
			coursesTaught[i].printInfo();
			
	}
	
	public double countCourseLevel(int level) {
		 // method to take a level as an argument and returns the number of courses of that level 
		int count=0;
		for(int j=0;j<coursesTaught.length;j++) {
			int dig=0;
			int temp=coursesTaught[j].getId();
			while(temp != 0) {
				temp/=10;
				dig++;
			}
			int temp2=(int)((coursesTaught[j].getId())/(Math.pow(10, (dig-1))));
			if(temp2 == level)
				count++;
		}
		return count;
	}
	public double calculateExtraPayment(double rate) {
		// method to take a rate value as an argument and returns the value of extra payment 
		double extra=0;
		for(int i=1;i<10;i++)
			extra+=((i)*countCourseLevel(i)*rate);		
		return extra;
	}
}
