package InheritanceMultilevel;





public class Cat extends Dog{
	void Cat()
	{
	System.out.println(" cat is meowing"); 
	}

    public static void main(String[] args) {

        Cat d = new Cat();

        d.run(); 
        d.Cat();
        d.bark();
         

    }
}