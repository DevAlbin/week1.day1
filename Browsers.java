package week1.day2;

public class Browsers {
 public String Name = "List of Broswers";
 
 public void Chrome(){
	 int version = 2021;
	 float Speed = 12345.6f;
	 Boolean nonetwork = true;
	 System.out.println(version);
	 System.out.println("works with no network = "+nonetwork);
	 System.out.println(version + Speed);
	 
 }
 
 public void Edge(){
	 int version = 2022;
	 float Speed = 1235.3f;
	 char internet = 'Y';
	 System.out.println(version);
	 System.out.println(Speed);
	 System.out.println("work wo network = " + internet);
	 System.out.println(version + Speed);
 }

 
 public void Firefox(){
	 int version = 2015;
	 float Speed = 1000.2f;
	 System.out.println(version);
	 System.out.println(Speed);
	 System.out.println(version + Speed);
 }
 
 
 public static void main(String[] args) {
	 Browsers network = new Browsers();
System.out.println(network.Name);
network.Chrome();
network.Edge();
network.Firefox();
		
	}


}



