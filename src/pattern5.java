
public class pattern5 {

	public static void main(String[] args) {
		for ( char  j='a'; j <='e' ;j++)
		{
		  for(int z=1; z<=5; z++)
		  {
			
			 for(int i=1; i<=5-z;i++) 
			 {
				 System.out.print(" ");
			 }
			 for ( char  ch=j; ch>='a' ;ch--)
			 {
				 System.out.print(ch);

			 }
			 System.out.println();

	}}
}}

