
public class Node {
	private Employee employee;
	private Node leftChild;
	private Node rightChild;
	
// 	---------------------------------------------
	//constructor
	public Node(Employee employee){
		this.employee=employee;
		leftChild=null;
		rightChild=null;
	}
// 	---------------------------------------------
	//constructor
	public Node(String employeeName, int employeeSalary){
		employee = new Employee(employeeName, employeeSalary);
		leftChild=null;
		rightChild=null;
	}
// 	---------------------------------------------
	//get employee
	public Employee getEmployee() {
		return this.employee;
	}
// 	---------------------------------------------	
	//get left child
	public Node getLeftChild() {
		return this.leftChild;
	}
// 	---------------------------------------------
	//get right childe
	public Node getRightChild() {
		return this.rightChild;
	}
// 	---------------------------------------------
	//set left child
	public void setLeftChild(Node leftChild) {
		this.leftChild=leftChild;
	}
// 	---------------------------------------------
	//set right child
	public void setRightChild(Node rightChild) {
		this.rightChild=rightChild;
	}
// 	---------------------------------------------
	//to string
	@Override
	public String toString(){
		/*String left = (this.leftChild != null) ? 
							this.leftChild.getEmployee().toString() :
							"null";
		String right = (this.rightChild != null) ? 
							this.rightChild.getEmployee().toString() :
							"null";
		return employee + "\n\tLeft Child: " + left + 
						  "\n\tRight Child: " + right + "\n";*/
		return employee.toString();
	}
// 	---------------------------------------------

}
