
public class TestTree {

	
// 	---------------------------------------------
	//refill tree
	public Tree refillTree(){
		Tree tree=new Tree();
		
		tree.insert(new Employee("Uros", 240));
		tree.insert(new Employee("Marko", 780));
		tree.insert(new Employee("Jovan", 325));
		tree.insert(new Employee("Petar", 441));
		tree.insert(new Employee("Blagoje", 150));
		tree.insert(new Employee("Slavko", 680));
		tree.insert(new Employee("Ana", 470));
		tree.insert(new Employee("Jovana", 900));
		
		//insert more
		tree.insert(new Employee("Teodora", 380));
		tree.insert(new Employee("Ivana", 350));
		tree.insert(new Employee("Una", 400));
		tree.insert(new Employee("Milosav", 1200));
		
		return tree;
		
	}
// 	---------------------------------------------
	public static void main(String[] args) {
		
		TestTree test = new TestTree();
		Tree tree = test.refillTree();
		
		tree.displayTree();
		System.out.println("Find 470: " + tree.findBySalary(470));
		System.out.println("Find 690: " + tree.findBySalary(690));
		System.out.println("Find 680: " + tree.findBySalary(680));
		System.out.println("Find 441: " + tree.findBySalary(441));
		
		System.out.println("InOrder Traverse: ");
		tree.inOrderTraverse(tree.getRoot());
		System.out.println();
		
		System.out.println("PreOrder Traverse: ");
		tree.preOrderTraverse(tree.getRoot());
		System.out.println();
		
		System.out.println("PostOrder Traverse: ");
		tree.postOrderTraverse(tree.getRoot());
		System.out.println();
			
		//find min & max
		System.out.println("Min: " + tree.getMinNodeBySalary());
		System.out.println("Max: " + tree.getMaxNodeBySalary());
				
		//successor
		System.out.println("Sucessor of 240: " + 
							tree.getSuccessor(tree.findBySalary(240))[0] );
		System.out.println("Sucessor of 150: " + 
							tree.getSuccessor(tree.findBySalary(150))[0] );
		System.out.println("Sucessor of 325: " + 
				tree.getSuccessor(tree.findBySalary(325))[0] );
		System.out.println();
		
		//delete leaf
		System.out.println("Deleting leafs");
		System.out.println("Delete 331: " + tree.deleteBySalary(331));
		System.out.println("Delete 470: " + tree.deleteBySalary(470).getEmployee());
		tree.displayTree();
		System.out.println("Refilling tree...");
		tree=test.refillTree();
		tree.displayTree();
		
		//deleted had single left child
		System.out.println("Deleted had single left child");
		System.out.println("Delete 680: " + tree.deleteBySalary(680));
		tree.displayTree();
		System.out.println("Refilling tree...");
		tree=test.refillTree();
		tree.displayTree();
		
		//deleted had single right child
		System.out.println("Deleted had single right child");
		System.out.println("Delete 900: " + tree.deleteBySalary(900));
		tree.displayTree();
		System.out.println("Refilling tree...");
		tree=test.refillTree();
		tree.displayTree();
		
		//deleted had both children
		System.out.println("Deleted had both children");
		System.out.println("Delete 441: " + tree.deleteBySalary(441));
		tree.displayTree();
		System.out.println("Refilling tree...");
		tree=test.refillTree();
		tree.displayTree();
		//--
		System.out.println("Deleted had both children");
		System.out.println("Delete 240: " + tree.deleteBySalary(240));
		tree.displayTree();
		System.out.println("Refilling tree...");
		tree=test.refillTree();
		tree.displayTree();

	}

}
