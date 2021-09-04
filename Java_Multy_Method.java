import java.util.*;
public class Java_Multy_Method {

	void peronal_dt()
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter your details :");
	  String name = s.nextLine();
	  String fname = s.nextLine();
	  System.out.println("Name =                  "+name );
	  System.out.println("Father name =           "+fname);
	
  }
  void qualification() 
  {
	  Scanner sc = new Scanner(System.in) ;
	  double per_10 = sc.nextDouble();
	  double per_12 = sc.nextDouble();
	  double per_eng = sc.nextDouble();
	  System.out.println("10th percentage =       " +per_10);
	  System.out.println("12th Percentage =       " +per_12);
	  System.out.println("Engneering persentage = " +per_eng);
	  sc.close();
  }
	public static void main(String[] args) 
	{
		Multy_Method obj = new Multy_Method();
		obj.peronal_dt();
		Multy_Method obj2 = new Multy_Method();
		obj2.qualification(); 


	}

}
