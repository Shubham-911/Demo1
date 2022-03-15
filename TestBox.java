import java.util.Scanner;
class TestBox

{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter box dimension: w d h");
		Box b1;//class type ref variable(local variable)
		b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println(b1.getBoxDetails());
		System.out.println(b1.getVolume());
		sc.close();
	}

}