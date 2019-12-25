class DemoDate{
	public static void main(String args[]){
		Date d1=new Date();
		d1.setDate(2019,12,14);
		d1.printDate(); //2019-12-14
		
		d1.setYear(1999);
		d1.setMonth(1);
		d1.setDay(31); //day of month
		
		d1.printDate(); //1999-1-31
		
		System.out.println("New year   : "+d1.getYear());
		System.out.println("New month  : "+d1.getMonth());
		System.out.println("New Day    : "+d1.getDay());
		
	}
}
