package com.stack;

public class DoubleLink<T> {

	private int size = 0;
	private Node start;
	private Node end;
	
	public void add(T data){
		Node node = new Node(null, null, data);
		if(start == null){
			start  = node;
			end = start;
		}else{
			
			start.next = node;
			node.previous = start;
			node.next = end;
			start = node;
		}
		
	}

	
	public void print(){
		System.out.println(start.data);
		while(start.previous!=null){
			start = start.previous;
			System.out.println(start.data);
		}
		
		
	}
	
	class Node<T>{
		Node previous;
		Node next;
		T data;
		
		Node(Node previous,Node next,T data){
			this.previous = previous;
			this.next =  next;
			this.data=data;
			
		}
		
	}
	
	
	
	public static void main(String...strings){
		DoubleLink<Integer> d = new DoubleLink<>();
	
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		
		d.print();
	}
	
}
