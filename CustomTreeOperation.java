package com.datastructure.classes;

public class CustomTreeOperation 
{
	Node p,root;
	
	public void add(int a) 
	{
	  if(root==null) 
		  root=new Node(a);
	  else{
		  Node p=root;
		  while(true)
		  {
			  if(root.data<a && p.right==null) {
					p=new Node(a);
					break;
				}
				else if(root.data<a && p.right!=null) {
					p=p.right;
				}
				else if(root.data>a && p.left!=null){
					p=p.left;
				}
				else {
					p=new Node(a);
					break;
				}
		  }
	}

	}
	void print(){
		if(root!=null)
			printTree(root);
	}
	//print
	private void printTree(Node p) {
		if(p.right!=null) 
			printTree(p.right);
			System.out.println(p.right+" ");
			if(p.left!=null) 
			printTree(p.left);
		
	}
	//contains
	boolean contains(int a) {
		if(root==null) 
			return false;
		else {
			Node p=root;
			while(true) {
				if(p.data==a)
					return true;
				else if(p.data<a && p.right==null)
					return false;
				else if(p.data<a && p.right!=null)
					p=p.right;
				else if(p.data>a && p.left==null)
					return false;
				else
					p=p.left;
			}
		}
	}
}
