package Inheritance;

public class SingleInheritance {
	
		public void run()
		{
			System.out.print("running");	
			}
	}
	class Deer extends SingleInheritance{
		public void sleep()
		{
			System.out.println("sleeping");
		}
	

	public static void main(String[] args) {
		Deer d=new Deer();
		d.sleep();
		d.run();
		
		

	} 

}
