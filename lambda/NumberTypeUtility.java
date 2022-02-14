interface NumberType
{
	public boolean checkNumberType(int number);
}
public class NumberTypeUtility {
	public static boolean checkNumberType(int number)
	{
		if(number%2!=0)
		{
			System.out.println(number +"is odd");
			return true;
		}
		else 
		{
			System.out.println(number +"is not odd");
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		NumberType n=(number) -> {
			System.out.println(checkNumberType(number));
			return true;
		};
		 n.checkNumberType(10);	
		
	}
	}


