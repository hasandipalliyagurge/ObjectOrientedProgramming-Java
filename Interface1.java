import java.util.*;
interface WaterLevelObserver{
	public void update(int waterLevel);
}
class Splitter implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println(waterLevel>=50 ? "Splitter ON":"Splitter OFF"); 
	}
}
class Alarm implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println(waterLevel>=50 ? "ON":"OFF"); 
	}
}
class Display implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("waterLevel : "+waterLevel);
	}
}
class SMSSender implements WaterLevelObserver{
	public void update(int waterLevel){
		System.out.println("Sending SMS : "+waterLevel);
	}
}
class ControlRoom{
	private WaterLevelObserver[] observerArray =new WaterLevelObserver[50];
	private int nextIndex=0;
	private int waterLevel ;
	
	public void addWaterLevelObservers(WaterLevelObserver ob){
		observerArray[nextIndex++]=ob;
	}
	public void notifyObservers(){
		for(int i=0; i<nextIndex; i++){
			observerArray[i].update(waterLevel);
		}
	}
	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyObservers();
		}
	}
}
class Interface1{
	public static void main(String args[]) {
		ControlRoom c1=new ControlRoom();
		c1.addWaterLevelObservers(new Alarm());
		c1.addWaterLevelObservers(new Display());
		c1.addWaterLevelObservers(new SMSSender());
		c1.addWaterLevelObservers(new Splitter());
		Random r=new Random();
		while(true){
			int waterLevel=r.nextInt(101);
			c1.setWaterLevel(waterLevel);
			try{Thread.sleep(1000);}catch(Exception ex){};	
		}
	}
}
