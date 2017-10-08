
public class Tree234 {
	
	private Node root;
	
//	--------------------------------------------
	//constructor
	public Tree234() {
		this.root=new Node();
	}
//	--------------------------------------------
	public Node getRoot() {
		return this.root;
	}
//	--------------------------------------------
	//set root
	public void setRoor(Node root) {
		this.root=root;
	}
//	--------------------------------------------
	//get next child
	public Node getNextChild(Node currentNode, int keySalary) {
		if(currentNode.isLeaf())
			return null;
		int n=currentNode.getNumDataItemsInNode();
		for(int i=0; i<n; i++)
			if(keySalary<currentNode.getDataItem(i).getSalary())
				return currentNode.getChild(i);
		return null;							//if some kind of error
	}	
//	--------------------------------------------
	//find 
	public Employee find(int keySalary) {
		Node current=this.getRoot();
		int index;
		while(true){
			if((index=current.findDataItemInNodeBySalary(keySalary)) != -1)
				return current.getDataItem(index);
			else if(current.isLeaf())
				return null;
			else
				current=this.getNextChild(current, keySalary);
		}
	}
	
//	--------------------------------------------
	//insert
	public void insert(Employee employee){
		Node current=this.getRoot();
		while(true){
			if(current.isFull()){
				this.split(current);
			}
		}
	}
	
//	--------------------------------------------
	// display tree 
	public void displayTree(){
		 recDisplayTree(root, 0, 0);
     }
//	--------------------------------------------
	//recursive function to display tree
	 private void recDisplayTree(Node thisNode, int level,
             int childNumber){

		 System.out.print("level="+level+" child="+childNumber+" ");

		 System.out.println(thisNode);              // display this node


		 // call ourselves for each child of this node
		 int numItems = thisNode.getNumDataItemsInNode();
		 for(int j=0; j<numItems+1; j++){
			 Node nextNode = thisNode.getChild(j);
			 if(nextNode != null)
				 recDisplayTree(nextNode, level+1, j);
			 else
				 return;
		 }
}  // end recDisplayTree()
//	--------------------------------------------
	
	
	/*******************************************************/
	public static void main(String args[]) {
		Tree234 tree= new Tree234();
		
		Node node0=new Node();
		node0.insertDataItemInNode(new Employee("Uros", 240));
		node0.insertDataItemInNode(new Employee("Marko", 780));
		tree.setRoor(node0);
		
		System.out.println("Find 54: " + tree.find(54) );
		System.out.println("Find 780: " + tree.find(780) );
		System.out.println();
		
		System.out.println("Displaying tree ...");
		tree.displayTree();
		
	}
	
	
	
	
	
}
