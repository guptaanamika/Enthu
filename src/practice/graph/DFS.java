package practice.graph;

import java.util.HashMap;
import java.util.Map;

public class DFS {

	Map<Integer, Integer> parent = new HashMap<Integer, Integer>();

	public void traverse(Graph graph) {
		for (Integer u : graph.getVertices()) {
			if (!parent.containsKey(u)) {
				parent.put(u, null);
				visit(u, graph);
			}
		}
	}

	public void visit(Integer source, Graph graph) {
		System.out.println(source + " ");
		for (Integer v : graph.getAdjacenyList(source)) {
			if (!parent.containsKey(v)) {
				parent.put(v, source);
				visit(v, graph);
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(4, 5);

		DFS bfs = new DFS();
		bfs.traverse(graph);
		System.out.println("Parent");
		System.out.println(bfs.parent);
	}
}
