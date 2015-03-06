	import java.util.Scanner;
	
public class Tarea3 
{

	public static void main(String[] args) 
	{	int n=0;
		Scanner S = new Scanner(System.in);
		
		System.out.println ("Ingrese un número");
		n= S.nextInt();
		
		if (n % 2 ==0)
			{
			System.out.println("El número es par");
			} 
		else 
			{
			System.out.println("El número es impar");
			}
	}
}		
	

