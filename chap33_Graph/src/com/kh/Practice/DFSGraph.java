package com.kh.Practice;

import java.util.LinkedList;

public class DFSGraph {
	private int V; 
	private LinkedList<Integer>[] adjList; 
	
	public DFSGraph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int des) {
		adjList[source].add(des);
	}
	
	public void DFS(int startNode) {
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
		
	}
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true;
		System.out.print(currentNode + " ");
		for (int neighbor : adjList[currentNode]) {
			if(!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}
}