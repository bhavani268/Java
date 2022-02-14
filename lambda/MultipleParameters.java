interface Addition{
	public int add(int a,int b);
}
public class MultipleParameters {
	
	public static void main(String[] args) {
		Addition x=(a,b)->(a+b);
				System.out.println( x.add(4,5));
		}
	}
	
