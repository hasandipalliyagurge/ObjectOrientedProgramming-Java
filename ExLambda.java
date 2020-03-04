
interface Arithmetic{
	public int operate(int num1, int num2);
}

class Demo{
	public static void main(String args[]){
		
	Arithmetic add=new Addition(){
	public int operate(int num1, int num2){
		return num1+num2;
	}
};

	Arithmetic sub=new Substraction(){
	public int operate(int num1, int num2){
		return num1-num2;
	}
};

	Arithmetic mul=new Multiplication(){
	public int operate(int num1, int num2){
		return num1*num2;
	}
};

	Arithmetic div=new Division(){
	public int operate(int num1, int num2){
		return num1/num2;
	}
};
	
		
		
		int x=100,y=50;
		System.out.println(x+" + "+y+" = "+add.operate(x,y));
		System.out.println(x+" - "+y+" = "+sub.operate(x,y));
		System.out.println(x+" * "+y+" = "+mul.operate(x,y));
		System.out.println(x+" / "+y+" = "+div.operate(x,y));
	}
}
