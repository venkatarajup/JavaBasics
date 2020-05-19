package java_Learning;

public class Cal{

	public static void add(int a, int b)

	{

		System.out.println(a + b);
	}

	// public void sub(int a,int b)
	// {
	// System.out.println(a-b);
	// }

	public static void main(String[] args) {
		// Calculator basicCal = new Calculator();
		// basicCal.add(1, 2);// object basicCal is calling/invoking the method
		// add()
		// basicCal.sub(40,30);
		add(90,20);
		//System.out.println();

	}

}

// Calculator is a container/storage area class which has diff methods
// no need to have main method if u are not executing/calling the methods in the same class
// we can use those methods by creating an obj of that class and use those
// methods in diff class or packages(by import)