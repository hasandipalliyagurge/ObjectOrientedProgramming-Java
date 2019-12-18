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
	public Box getCopy(){
		Box box=new Box();
		box.setSize(length,width,height);
		return box;
		
	} 
}
class Ex2{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume();
		
		Box b2;
		b2=b1.getCopy();
		b2.printVolume(); //180
        System.out.println(b1==b2); //true
	}
}
