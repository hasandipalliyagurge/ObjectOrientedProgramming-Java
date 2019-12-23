class Box{
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
	
	public int setLength(int l){
		length=l;
		return length;
	}
	public int setWidth(int w){
		width=w;
		return width;
	}
	public int setHeight(int h){
		height=h;
		return height;
	}
		
	public void printVolume(){
		int volume ;
		volume=length*height*width;
		System.out.println("Volume is : "+volume);		
	}
	public void printArea(){
		int area ;
		area=(2*(length*width)+(2*(height*width))+(2*(height*length)));
		System.out.println("Area is : "+area);		
	}
	
	public int getVolume(int length, int height, int width){
		int volume ;
		volume=length*height*width;
		return volume;
	}
	public  int getArea(int length, int height, int width ){
		int area ;
		area=(2*(length*width)+(2*(height*width))+(2*(height*length)));
		return area;
	}
	
}
