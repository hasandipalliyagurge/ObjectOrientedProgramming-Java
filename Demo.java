class Demo{
	public static void main(String args[]){
		/*int length;
		int width;
		int height;*/
		Box b1=new Box();
		
		/*
		length=12;
		width=5;
		height=3;
		*/
		b1.setSize(12,5,3);
		
		/*
		int volume ;
		volume=length*height*width;
		System.out.println("Volume is : "+volume);
		*/
		b1.printVolume();
	}
}
