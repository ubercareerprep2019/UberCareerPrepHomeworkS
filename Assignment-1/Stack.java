package part3;

import java.util.ArrayList;

public class Stack {
	private ArrayList array = new ArrayList();
	private double lastElement;
	private double input;
	
	//setters
	public void setArray(ArrayList array) {
		this.array = array;
	}
	
	public void setLast(double lastElement) {
		this.lastElement = lastElement;
	}
	public void setInput(double input) {
		this.input=input;
	}
	
	//constructor
	public void Stack(ArrayList array, double length, double lastElement, double input) {
		setArray(array);
		setLast(lastElement);
		setInput(input);
	}
	//getters
	public ArrayList getArray() {
		return array;
	}
	
	public double getLast() {
		return lastElement;
	}
	public double getInput() {
		return input;
	}
	
	//stack functions
	public void push(double input, ArrayList<Double>array) {
		array.add(input);
	}
	
	public double pop(ArrayList<Double>array) {
		if (array.size()!=0) {
			array.remove(array(array.size()-1)));
		}
		return array(array.size()-1);
	}
	
	public double top(ArrayList<Double>array) {
		if (array.size()==0) {
			System.out.println("Empty Stack");
		}
		else{
			return array(array.size()-1);
		}
	}
	
	public Boolean isEmpty(ArrayList<Double> array) {
		if (array.size() == 0) {
			return true;
		}
		else{
			return false;
		}
	}
	
	public double size(ArrayList<Double> array) {
		return array.size();
	}
	
	public static void main(String[] args) {
		Stack myStack = new Stack();
		myStack.push(42);
		System.out.println(myStack.top());
		System.out.println(myStack.size());		
	}

}
