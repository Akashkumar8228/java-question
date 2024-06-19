import java.util.Scanner;
class NthArmsCountFromMtoN
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int no=sc.nextInt();
		System.out.println("Enter second number");
		int no2=sc.nextInt();
		System.out.println("Enter nth number");
		int no3 = sc.nextInt();
		
		for(int i = no;  i<=no2;  i++)
		{
		
		int leng=0;
		int temp1=i;
		while(temp1!=0)
		{
			leng++;
			temp1=temp1/10;
		}
		int temp2=i;
		int total=0;
		int rem;
		while(temp2!=0){ 
			rem=temp2%10;
			int mult=1;
			for(int j=1; j<=leng; j++){
				mult=mult*rem;
			}  
			total=total+mult;
			temp2=temp2/10;
		}
		if(total==i)
		{
				
		}
		}
		
	}
}