import java.util.*;

class Splitter{
	public void split(int waterLevel){
		System.out.println(waterLevel>=75 ? "Splitter ON":"Splitter OFF"); 
	}
}
class Alarm{
	public void operateAlarm(int waterLevel){
		System.out.println(waterLevel>=50 ? "ON":"OFF"); 
	}
}
class Display{
	public void display(int waterLevel){
		System.out.println("waterLevel : "+waterLevel);
	}
}

class SMSSender{
	public void sendSMS(int waterLevel){
		System.out.println("Sending SMS : "+waterLevel);
	}
}
class ControlRoom{
	Alarm alarm;
	Display display;
	SMSSender smsSender;
	int waterLevel ;
	
	public void add
	public void addAlarm(Alarm alarm){this.alarm=alarm;}
	public void addDisplay(Display display){this.display=display;}
	public void addSMSSender(SMSSender smsSender){this.smsSender=smsSender;}
	
	public void notifyAllObjects(){
		alarm.operateAlarm(waterLevel);
		display.display(waterLevel);
		smsSender.sendSMS(waterLevel);
	}
	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyAllObjects();
		}
	}
}
class Demo{
	public static void main(String args[]) {
		ControlRoom c1=new ControlRoom();
		c1.addAlarm(new Alarm());
		c1.addDisplay(new Display());
		c1.addSMSSender(new SMSSender());
		
		Random r=new Random();
		while(true){
			int waterLevel=r.nextInt(101);
			c1.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){};	
		}
	}
}
