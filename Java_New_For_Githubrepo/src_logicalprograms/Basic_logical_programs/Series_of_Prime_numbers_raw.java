package Basic_logical_programs;
public class Series_of_Prime_numbers_raw {

	public static void main(String[] args) {
		
		int i,num;
		
		System.out.println("Prime Numbers till 100 : ");
		
		for(i=2;i<=100;i++)
		{
			int counter=0;
			
			for(num=1;num<=i;num++)
			{
				
				if(i%num==0)
				{
				counter++;
				}
			}
			
			if(counter==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
