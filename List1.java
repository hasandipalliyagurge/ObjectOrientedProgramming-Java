 class List{
	private int[] dataArray;
	private int nextIndex;

public List(int size){
		dataArray=new int[size];
	}

public int size(){
		return nextIndex;
	}

public int capacity(){
	
}
	
}
class Demo{
	public static void main(String args[]) {
		List list1=new List(10);
		System.out.println("Size of the list : "+list1.size());//0
		System.out.println("Capacity of the list : "+list1.capacity());//10
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.printList(); //[10, 20, 30, 40]
		
		list1.remove(2); //remove(int index)
		list1.printList(); //[10, 20, 40]
		
		list1.add(2,100);
		list1.printList(); //[10, 20, 100, 40]
		
		System.out.println("Size of the list : "+list1.size());//4
		System.out.println("Capacity of the list : "+list1.capacity());//10
		
		list1.add(new int[]{1,2,3,4});
		list1.printList(); //[10, 20, 100, 40, 1, 2, 3, 4]
		
		list1.add(3, new int[]{200,300,400,500});
		list1.printList(); //[10, 20, 100, 200, 300, 4000, 40, 1, 2, 3, 4]
		
		list1.remove(2,5);
		//list1.printList(); //[10, 20, 40, 1, 2, 3, 4]
