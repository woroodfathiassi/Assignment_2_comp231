/* 
 * Worood Fathi Assi;
 * # 1210412;
 * lab_11;
 * 
 */
public class Course {
	// The attributes for Course class:-
	private String name;
	private int Id;
	public Course(){
		//Default constructor:-

	}
	//non_Default constructor:-
	public Course(String name ,int id) {
		if(name.length()==4)  //check if the name's length is 4;
		   this.name=name;
//		else {
//			this.name=null; 
//			System.out.println("the course's name must be four chars");
//
//		}
//		setName(name);
		this.Id=id;
	}
	//Setter & getter methods:-
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()==4)   //check if the name's length is 4;
		   this.name = name;
//		else {
//			this.name=null; 
//			System.out.println("the course's name must be four chars");
//
//		}
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public void printInfo() {
		System.out.print("\n"+name+""+Id+"  ");
		if(name==null)
			System.out.println("the course's name must be four chars");

		
	}
	

}
