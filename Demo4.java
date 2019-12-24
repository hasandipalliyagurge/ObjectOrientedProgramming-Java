class Box{
	int length; //attributes
	int width;
	int height;
	
	public void setSize(int length, int width, int height){ //create local variables in the stack
		this.length=length; //assign to the attributes in object becuase of the key word this
		this.width=width;
		this.height=height;
	}
	
	public void printVolume(){
		int volume; //local variable, 
		volume=length*width*height;
		System.out.println("Volume : "+volume);
	}
}
class Demo4{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume();
		System.out.println("length : "+b1.length);
		System.out.println("width  : "+b1.width);
		System.out.println("height : "+b1.height);
	}
}
