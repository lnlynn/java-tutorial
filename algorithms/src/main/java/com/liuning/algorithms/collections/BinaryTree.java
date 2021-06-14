package com.liuning.algorithms.collections;

import java.util.LinkedList;
import java.util.Queue;



public class BinaryTree {

	class TreeNode{
		public int data;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(){}
		public TreeNode(int data){
			this.data  = data;
			this.left  = null;
			this.right = null;
		}
	}

	private TreeNode root;
	public BinaryTree(){
		root = null;
	}
	
	//将data插入到排序二叉树中
	public void insert(int data){
		TreeNode newNode = new TreeNode(data);
		if(root == null){
			root = newNode;
		}else{
			TreeNode current = root;
			TreeNode parent;
			while(true){
				parent = current;
				if(data < current.data){
					current = current.left;
					if(current == null){
						parent.left = newNode;
						return;
					}
				}else{
					current = current.right;
					if(current == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	//将数值输入构建二叉树
	public void buildTree(int[] data){
		for (int datum : data) {
			insert(datum);
		}
	}
	
	//中序遍历方法递归实现
	public void inOrder(TreeNode localRoot){
		if(localRoot != null){
			inOrder(localRoot.left);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.right);
		}
	}
	public void inOrder(){
		this.inOrder(this.root);
	}
	
	//先序遍历方法递归实现
	public void preOrder(TreeNode localRoot){
		if(localRoot != null){
			System.out.print(localRoot.data + " ");
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
	public void preOrder(){
		this.preOrder(this.root);
	}
	
	//后序遍历方法递归实现
	public void postOrder(TreeNode localRoot){
		if(localRoot != null){
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.print(localRoot.data + " ");
		}
	}
	public void postOrder(){
		this.postOrder(this.root);
	}
	
	//层次遍历
	public void layerTranverse(){
		
		if(this.root == null){
			return;
		}
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(this.root);
		while(!q.isEmpty()){
			TreeNode n = q.poll();
			System.out.print(n.data + " ");
			if(n.left != null) q.add(n.left);
			if(n.right!= null) q.add(n.right);
		}
	}
	
	public static void main(String[] args){
		BinaryTree biTree = new BinaryTree();
		
		int[] data = {2,8,7,4,9,3,1,6,10,5};
		biTree.buildTree(data);
		
		System.out.print("二叉树的中序遍历:");
		biTree.inOrder();
		System.out.println();
		
		System.out.print("二叉树的先序遍历:");
		biTree.preOrder();
		System.out.println();
		
		System.out.print("二叉树的后序遍历:");
		biTree.postOrder();
		System.out.println();
		
		System.out.print("二叉树的层次遍历:");
		biTree.layerTranverse();
	}
}

