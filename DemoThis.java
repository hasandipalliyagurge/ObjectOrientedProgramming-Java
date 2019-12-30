class Box{
	int length; //attributes
	int width;
	int height;
	
	public void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	public void printVolume(){
		int volume; //local variable, 
		volume=length*width*height;
		System.out.println("Volume : "+volume);
	}
	public void copyValuesFrom(Box b){
		this.length=b.length;
		this.width=b.width;
		this.height=b.height;
	}
}
class DemoThis{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume();
		
		Box b2=new Box();
		b2.copyValuesFrom(b1);
		b2.printVolume(); //180
	}
}
