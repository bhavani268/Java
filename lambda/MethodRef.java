interface NumbType{
	public boolean checkNumberType(int number);
}
public class MethodRef {
	public  boolean checkNumberType(int number)
	{
		if(number%2!=0)
		{
			System.out.println(number + "is odd");
			return true;
		}
		else 
		{
			System.out.println(number + "is not odd");
			return false;
		}
		
		
	}


	public static void main(String[] args) {
		//NumberType b=MethodRef::checkNumberType;  ///refernce to the static mathod
		//b.checkNumberType(67);
		MethodRef m=new MethodRef();
		 NumberType n= m ::checkNumberType;
		 n.checkNumberType(56);
		 
	}

}
