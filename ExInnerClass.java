interface Arithmetic{
	public int operate(int num1, int num2);
}

class Example{
	public static void main(String args[]){
		
		class Addition implements Arithmetic{
	public int operate(int num1, int num2){
		return num1+num2;
	}
}
class Substraction implements Arithmetic{
	public int operate(int num1, int num2){
		return num1-num2;
	}
}
class Multiplication implements Arithmetic{
	public int operate(int num1, int num2){
		return num1*num2;
	}
}
class Division implements Arithmetic{
	public int operate(int num1, int num2){
		return num1/num2;
	}
}
		
		Arithmetic add=new Addition();
		Arithmetic sub=new Substraction();
		Arithmetic mul=new Multiplication();
		Arithmetic div=new Division();

		
		int x=100,y=50;
		System.out.println(x+" + "+y+" = "+add.operate(x,y));
		System.out.println(x+" - "+y+" = "+sub.operate(x,y));
		System.out.println(x+" * "+y+" = "+mul.operate(x,y));
		System.out.println(x+" / "+y+" = "+div.operate(x,y));
		
		/*int x=100,y=50;
		Arithmetic add=()->{
			System.out.println(x+" / "+y+" = "+div.operate(x,y));
			};
		Arithmetic sub=()->{
			System.out.println(x+" - "+y+" = "+sub.operate(x,y));
			};
		Arithmetic mul=()->{
			System.out.println(x+" - "+y+" = "+sub.operate(x,y));
			};
		Arithmetic div=()->{
			System.out.println(x+" / "+y+" = "+div.operate(x,y));
			};*/
		

		
	}
}
