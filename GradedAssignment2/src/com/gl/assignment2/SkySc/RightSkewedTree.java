package com.gl.assignment2.SkySc;

public class RightSkewedTree {
	class Node {
		int val;
		Node left, right;

		Node(int item) {
			val = item;
			left = right = null;
		}
	}

	class Convert {
		public static Node node;
		static Node prevNode = null;
		static Node headNode = null;

		static void flattenBST(Node root, int order) {

// Base Case
			if (root == null) {
				return;
			}
			if (order > 0) {
				flattenBST(root.right, order);
			} else {
				flattenBST(root.left, order);
			}
			Node rightNode = root.right;
			Node leftNode = root.left;
			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
			if (order > 0) {
				flattenBST(leftNode, order);
			} else {
				flattenBST(rightNode, order);
			}
		}

		static void traverseRightSkewed(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.val + " ");
			traverseRightSkewed(root.right);
		}

	}

	public static void main(String[] args) {
		
		    Convert tree = new Convert();
	        tree.node = new Node(5);
	        tree.node.left = new Node(3);
	        tree.node.right = new Node(6);
	       
	        int order = 0;
	        flattenBST(node, order);
	        traverseRightSkewed(headNode);

	}

}
