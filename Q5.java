class Box{
	int length=2;
	int width=3;
	int height=4;
	
	void printVolume(){
		int volume;
		volume=height*length*width;
		System.out.println(volume);
	}
}

class Q5{
		public static void main(String args[]){
			Box b1=new Box();
			b1.printVolume();
			System.out.println(b1.length);
			System.out.println(b1.width);
			System.out.println(b1.height);
		}
}
