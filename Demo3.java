class Demo3{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume(); //180
		b1.printArea(); //Area of the box : 222
		
		b1.setLength(120);
		b1.setWidth(50);
		b1.setHeight(30);
		
		int vol=b1.getVolume();
		int area=b1.getArea();
		System.out.println("New volume of the box : "+vol);
		System.out.println("New area of the box : "+area);
	}
}
