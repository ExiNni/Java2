package com.kh.Practice;

import com.kh.BFS.Graph;

public class PracticeGraph {
	public static void main(String[] args) {
		int ver = 7; // 그래프 노의 수를 5로 정의
		PracticeGraph ph = new PracticeGraph();
		ph.BFSPracticeMain();
	}

	public void BFSPracticeMain() {
		Graph g = new Graph(6);
		// 간선 추가
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);

		System.out.println("BFS 탐색 결과 : ");
		g.BFS(0);
	}

	public void DFSPracitceMain() {
		Graph g = new Graph(6);
		
		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 3);
		g.addEdge(4, 5);
		
		g.addEdge(2, 5);
		g.addEdge(2, 6);

		
		System.out.println("DFS 탐색 결과: " );
	}
}

/*
 * DFS 탐색을 시작하여 그 결과를 출력 탐색 결과는 시작 노드에서 출발하여 깊이 우선으로 탐색 후 노드를 방문한 순서대로 출력
 */