package com.aurionpro.model;

import java.util.*;

public class LinkedList {
	private Node head;

	public LinkedList() {
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void insertAt(int index, int data) {
		Node nodeToBeInserted = new Node(data);
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.getNextNode();
		}
		nodeToBeInserted.setNextNode(node.getNextNode());
		node.setNextNode(nodeToBeInserted);
	}

	public void remove(int key) {

		Node currNode = head;
		Node prev = null;

		if (currNode != null && currNode.getData() == key) {
			head = currNode.getNextNode();

			System.out.println(key + " found and deleted");
		}
		while (currNode != null && currNode.getData() != key) {

			prev = currNode;
			currNode = currNode.getNextNode();
		}

		if (currNode != null) {

			prev.setNextNode(currNode.getNextNode());
			System.out.println(key + " found and deleted");
		}
		if (currNode == null) {

			System.out.println(key + " not found");
		}
	}

	public void deleteNodeAt(int index) {
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			node = node.getNextNode();
		}
		node.setNextNode(node.getNextNode().getNextNode());
	}

	public void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNextNode();
			}
			System.out.println(currentNode.getData());
		}
	}

	public Iterator<Integer> iterator() {
		return new ListIterator();
	}

	public class ListIterator implements Iterator<Integer> {
		Node current = head;

		public boolean hasNext() {
			return current != null;
		}

		public Integer next() {
			if (hasNext()) {
				int data = (int) current.getData();
				current = current.getNextNode();
				return data;
			}
			return null;
		}

	}

}