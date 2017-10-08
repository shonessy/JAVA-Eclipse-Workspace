
public class Node {
	private static final int ORDER=4;
	
	private Employee dataItemsArray[];
	private Node parent;
	private Node childrenArray[];
	private int numDataItemsInNode;
	
//	--------------------------------------------
	//constructor
	public Node() {
		dataItemsArray =new Employee[ORDER-1];
		childrenArray = new Node[ORDER];
		parent=null;
		numDataItemsInNode=0;
	}
//	--------------------------------------------
	//get data item from this Node
	public Employee getDataItem(int index) {
		return dataItemsArray[index];
	}
//	--------------------------------------------
	//get child of this Node
	public Node getChild(int index) {
		return childrenArray[index];
	}
//	--------------------------------------------
	//get parent
	public Node getParent() {
		return parent;
	}
//	--------------------------------------------
	//set parent
	public void setParent(Node parent) {
		this.parent=parent;		
	}
//	--------------------------------------------
	//get number of data items in this node
	public int getNumDataItemsInNode() {
		return numDataItemsInNode;
	}
//	--------------------------------------------
	//is this Node leaf
	public boolean isLeaf() {
		return (childrenArray[0]==null);
	}
//	--------------------------------------------
	//is this Node full
	public boolean isFull() {
		return (numDataItemsInNode == ORDER-1);
	}	
//	--------------------------------------------
	//is empty
	public boolean isEmpty() {
		return (this.dataItemsArray[0] == null);
	}
//	--------------------------------------------
	//get node level
	public int getNodeLevel(Node currentNode){
		if(currentNode.getParent() == null)
			return 0;
		return 1 + getNodeLevel(currentNode.getParent());
	}
//	--------------------------------------------
	//connect child to this node
	public void connectChildToNode(Node childNode, int childIndex) {
		if(childIndex>=childrenArray.length)
			return;									//maybe throw exception
		this.childrenArray[childIndex]=childNode;
		if(childNode != null)
			childNode.setParent(this);
	}
//	--------------------------------------------
	//disconnect child from this node
	public Node disconnectChildFromNode(int childIndex) {
		if(childIndex>=childrenArray.length)
			return null;									//maybe throw exception
		Node temp=childrenArray[childIndex];
		childrenArray[childIndex]=null;
		temp.setParent(null);
		return temp;
	}
//	--------------------------------------------
	//find data item in this Node
	//return its index
	public int findDataItemInNodeBySalary(int salary) {
		for(int i=0; i<ORDER-1; i++){
			if(dataItemsArray[i]==null)
				break;
			else if(dataItemsArray[i].getSalary()==salary)
				return i;
		}
		return -1;
	}
//	--------------------------------------------
	//insert data item this node, returns index of inserted data item
	public int insertDataItemInNode(Employee employee) {
		if(this.isFull())
			return -1;
		
		this.numDataItemsInNode++;
		for(int i=ORDER-2; i>=0; i--){
			if(this.dataItemsArray[i] == null)
				continue;
			else if(employee.getSalary()<this.dataItemsArray[i].getSalary())
				this.dataItemsArray[i+1]=this.dataItemsArray[i];
			else{ 
				this.dataItemsArray[i+1]=employee;		
				return i+1;
			}
		}
		
		//if empty
		this.dataItemsArray[0]=employee;
		return 0;
	}
//	--------------------------------------------
	//delete last data item from node
	public Employee removeLastDataItemFromNode() {
		if(this.isEmpty())
			return null;
		
		Employee temp=dataItemsArray[numDataItemsInNode-1];
		dataItemsArray[numDataItemsInNode-1]=null;
		numDataItemsInNode--;
		return temp;
	}
//	--------------------------------------------
	// to string
	@Override
	public String toString(){
		String ret="Node Level: " + this.getNodeLevel(this) + "\n\t";
		for(Employee x : this.dataItemsArray){
			if(x==null)
				ret+="[null] ";
			else
				ret+=x + " ";
		}
		return ret;
	}
//	--------------------------------------------
	
//	--------------------------------------------
	//main
	/*
	 * public static void main(String args[]){
		Node node0=new Node();
		System.out.println("Is empty: " + node0.isEmpty());
		System.out.println("Is full: " + node0.isFull());
		
		//inserting
		System.out.print("Inserting Uros... ");
		System.out.println("Position: " + node0.insertDataItemInNode(
											new Employee("Uros", 240)));
		System.out.println(node0);
		System.out.println();
		
		System.out.print("Inserting Marko...");
		System.out.println("Position: " + node0.insertDataItemInNode(
											new Employee("Marko", 780)));
		System.out.println(node0);
		System.out.println();
		
		System.out.print("Inserting Jovan...");
		System.out.println("Position: " + node0.insertDataItemInNode(
											new Employee("Jovan", 325)));
		System.out.println(node0);
		System.out.println();
		
		System.out.println("Find 350: " + node0.findDataItemInNodeBySalary(350));
		System.out.println("Find 325: " + node0.findDataItemInNodeBySalary(325));
		System.out.println();
		
		System.out.println("Removing last: " + node0.removeLastDataItemFromNode());
		System.out.println(node0);
		System.out.println();
		
		
		System.out.print("Inserting Blagoje ... ");
		System.out.println("Position: " + node0.insertDataItemInNode(
											new Employee("Blagoje", 150)));
		System.out.println(node0);
		
		System.out.println("*************************************");
		//////////////
		Node node1=new Node();
		System.out.print("Inserting Petar... ");
		System.out.println("Position: " + node1.insertDataItemInNode(
											new Employee("Petar", 441)));
		System.out.println(node1);
		System.out.println();
		
		System.out.print("Inserting Slavko...");
		System.out.println("Position: " + node1.insertDataItemInNode(
											new Employee("Slavko", 680)));
		System.out.println(node1);
		System.out.println();
		
		System.out.println("Connecting node1 as child of node0");
		node0.connectChildToNode(node1, 0);
		System.out.println(node1);
		
		
		System.out.println("*************************************");
		//////////////
		Node node2=new Node();
		System.out.print("Inserting Ana... ");
		System.out.println("Position: " + node2.insertDataItemInNode(
											new Employee("Ana", 470)));
		System.out.println(node2);
		System.out.println();
		
		System.out.print("Inserting Jovana...");
		System.out.println("Position: " + node2.insertDataItemInNode(
											new Employee("Jovana", 900)));
		System.out.println(node2);
		System.out.println();
		
		System.out.println("Connecting node2 as child of node1");
		node1.connectChildToNode(node2, 0);
		System.out.println(node2);
		System.out.println();
		
		System.out.println("Disconecting node2 from node1: ");
		node1.disconnectChildFromNode(0);
		System.out.println(node2);
		System.out.println();
		
		System.out.println("Connecting node2 as child of node0");
		node0.connectChildToNode(node2, 1);
		System.out.println(node2);
		System.out.println();
		tree.insert(new Employee("Petar", 441));
		//tree.insert(new Employee("Blagoje", 150));
		//tree.insert(new Employee("Slavko", 680));
		//tree.insert(new Employee("Ana", 470));
		//tree.insert(new Employee("Jovana", 900));
		
		//insert more
		//tree.insert(new Employee("Teodora", 380));
		//tree.insert(new Employee("Ivana", 350));
		//tree.insert(new Employee("Una", 400));
		//tree.insert(new Employee("Milosav", 1200));
		
		
	}
	 */
//	--------------------------------------------


}
