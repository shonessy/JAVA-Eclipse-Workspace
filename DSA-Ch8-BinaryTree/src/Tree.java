import java.util.*;

import javax.swing.border.EmptyBorder; 

public class Tree {
	private Node root;
	
// 	---------------------------------------------
	//constructor
	public Tree(){
		this.root=null;
	}
// 	---------------------------------------------
	//get root
	public Node getRoot() {
		return this.root;
	}
// 	---------------------------------------------
	//set root
	public void setRoot(Node newRoot) {
		this.root=newRoot;
	}
// 	---------------------------------------------
	//is tree empty
	public boolean isEmpty() {
		return (root==null);
	}
// 	---------------------------------------------
	//find
	public Node findBySalary(int salary){
		if(this.isEmpty())
			return null;
		Node current=root;
		int currentSalary;
		while( (currentSalary=current.getEmployee().getSalary()) != salary){
			current = (salary<currentSalary) ? current.getLeftChild() :
											   current.getRightChild();
			if(current==null)
				return null;
	
		}
		return current;
	}
// 	---------------------------------------------
	//find by name
	//traverse
// 	---------------------------------------------
	//insert
	public void insert(Employee employee) {
		Node newNode = new Node(employee);
		if(this.isEmpty()){
			this.setRoot(newNode);
			return;
		}

		Node current=this.getRoot();
		Node parent;
		while(true){
			parent=current;
			if(employee.getSalary()<current.getEmployee().getSalary()){
				current=current.getLeftChild();
				if(current==null){
					parent.setLeftChild(newNode);
					return;
				}
			}
			else{
				current=current.getRightChild();
				if(current==null){
					parent.setRightChild(newNode);
					return;
				}
			}		 
		}//while
	}
// 	---------------------------------------------
	//delete
	public Node deleteBySalary(int salary) {
		if(this.isEmpty())
			return null;
		Node current=this.getRoot();
		Node parent=this.getRoot();
		int currentSalary;
		while( (currentSalary=current.getEmployee().getSalary()) != salary){
			parent=current;
			if(salary<currentSalary)
				current=current.getLeftChild();
			else
				current=current.getRightChild();
			if(current==null)
				return null;				//didn't find it
		}
		
		//found it - current for deletion
		
		//found - is a leaf
		if(current.getLeftChild()==null && current.getRightChild()==null){
			if(current==this.getRoot())
				this.setRoot(null);
			else if(current==parent.getLeftChild())
				parent.setLeftChild(null);
			else if(current==parent.getRightChild())
				parent.setRightChild(null);
		}
		
		//found - has 1 left child
		else if(current.getRightChild() == null){
			if(current==this.getRoot())
				this.setRoot(current.getLeftChild());
			else if(current==parent.getLeftChild())
				parent.setLeftChild(current.getLeftChild());
			else if(current==parent.getRightChild())
				parent.setRightChild(current.getLeftChild());
		}
		
		//found - has 1 right child
		else if(current.getLeftChild()==null){
			if(current==this.getRoot())
				this.setRoot(current.getRightChild());
			else if(current==parent.getLeftChild())
				parent.setLeftChild(current.getRightChild());
			else if(current==parent.getRightChild())
				parent.setRightChild(current.getRightChild());
		}
		
		//found - has bout children
		else{
			Node successorAndParent[]=this.getSuccessor(current);
			Node successor = successorAndParent[0];
			
			//successor is first right child of current
			//current's right child doesn't have left child 
			//so current's right child is a successor 
			if(successor==current.getRightChild()){
				if(current==this.getRoot())
					this.setRoot(successor);
				else if(current==parent.getRightChild())
						parent.setRightChild(successor);
				else if(current==parent.getLeftChild())
						parent.setLeftChild(successor);
				successor.setLeftChild(current.getLeftChild());
				
			}
			
			//successor is some left child of current's right child 
			//current's right child has left child
			else{
				Node successorParent=successorAndParent[1]; 
				
				successorParent.setLeftChild(successor.getRightChild());
				successor.setRightChild(current.getRightChild());
				successor.setLeftChild(current.getLeftChild());
				
				if(current==this.getRoot())
					this.setRoot(successor);
				else if(current==parent.getLeftChild())
					parent.setLeftChild(successor);
				else if(current==parent.getRightChild())
					parent.setRightChild(successor);
			}
		}
		
		return current;
	}
// 	---------------------------------------------
	//get successor
	public Node[] getSuccessor(Node fromNode) {
		if(this.isEmpty())
			return null;
		else if(fromNode.getRightChild()==null){
			Node ret[]={fromNode,fromNode};
			return ret;
		}

		Node successorParent=fromNode;
		Node successor=fromNode.getRightChild();
		while(successor.getLeftChild() != null){
			successorParent=successor;
			successor=successor.getLeftChild();
		}
		Node ret[]={successor,successorParent};
		return ret;
	}
// 	---------------------------------------------
	//get min by salary
	public Node getMinNodeBySalary() {
		if(this.isEmpty())
			return null;
		Node current = this.getRoot();
		while(current.getLeftChild() != null)
			current=current.getLeftChild();
		return current;
	}
// 	---------------------------------------------
	//get max by salary
	public Node getMaxNodeBySalary() {
		if(this.isEmpty())
			return null;
		Node current=this.getRoot();
		while(current.getRightChild() != null)
			current=current.getRightChild();
		return current;
	}
// 	---------------------------------------------
	//traverse inorder
	public void inOrderTraverse(Node localRoot) {
		if(localRoot != null){
			inOrderTraverse(localRoot.getLeftChild());
			System.out.println("\t" + localRoot.getEmployee());
			inOrderTraverse(localRoot.getRightChild());
		}
	}
// 	---------------------------------------------
	//traverse preorder 
	public void preOrderTraverse(Node localRoot) {
		if(localRoot != null){
			System.out.println("\t" + localRoot.getEmployee());
			preOrderTraverse(localRoot.getLeftChild());
			preOrderTraverse(localRoot.getRightChild());
		}
	}
// 	---------------------------------------------
	//traverse postorder
	public void postOrderTraverse(Node localRoot) {
		if(localRoot != null){
			postOrderTraverse(localRoot.getLeftChild());
			postOrderTraverse(localRoot.getRightChild());
			System.out.println("\t" + localRoot.getEmployee());
		}
	}
	
// 	---------------------------------------------
	//display tree
	public void displayTree()
      {
      Stack<Node> globalStack = new Stack<>();
      globalStack.push(root);
      int nBlanks = 32;
      boolean isRowEmpty = false;
      System.out.println(
      "......................................................");
      while(isRowEmpty==false)
         {
         Stack<Node> localStack = new Stack<>();
         isRowEmpty = true;

         for(int j=0; j<nBlanks; j++)
            System.out.print(' ');

         while(globalStack.isEmpty()==false)
            {
            Node temp = globalStack.pop();
            if(temp != null)
               {
               System.out.print(temp.getEmployee());
               localStack.push(temp.getLeftChild());
               localStack.push(temp.getRightChild());

               if(temp.getLeftChild() != null ||
                                   temp.getRightChild() != null)
                  isRowEmpty = false;
               }
            else
               {
               System.out.print("--");
               localStack.push(null);
               localStack.push(null);
               }
            for(int j=0; j<nBlanks*2-2; j++)
               System.out.print(' ');
            }  // end while globalStack not empty
         System.out.println();
         nBlanks /= 2;
         while(localStack.isEmpty()==false)
            globalStack.push( localStack.pop() );
         }  // end while isRowEmpty is false
      System.out.println(
      "......................................................");
      } 
//	 	---------------------------------------------
	
}
