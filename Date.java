class Date{
	int year;
	int month;
	int date;
	
	public void setDate(int y, int m, int d){
		year=y;
		month=m;
		date=d;
	}
	
	public void printDate(){
		System.out.println(year+"-"+month+"-"+date);
	}
	public void setYear(int y){ 
		year=y;
	}
	
	public void setMonth(int m){ 
		month=m;
	}
	
	public void setDay(int d){ 
		date=d;
	}
	
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return date;
	}
}

