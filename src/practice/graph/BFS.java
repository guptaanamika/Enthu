package practice.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BFS {

	Map<Integer, Integer> level = new HashMap<Integer, Integer>();
	Map<Integer, Integer> parent = new HashMap<Integer, Integer>();
	Queue<Integer> queue = new LinkedList<Integer>();

	public void traverse(Integer source, Graph graph) {

		queue.add(source);
		level.put(source, 0);
		parent.put(source, null);

		while (!queue.isEmpty()) {
			Integer element = queue.poll();
			System.out.print(element + " ");
			for (Integer v : graph.getAdjacenyList(element)) {
				if (!level.containsKey(v)) {
					level.put(v, level.get(element) + 1);
					parent.put(v, element);
					queue.add(v);
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(4, 5);

		BFS bfs = new BFS();
		bfs.traverse(1, graph);
		System.out.println("Level");
		System.out.println(bfs.level);
		System.out.println("Parent");
		System.out.println(bfs.parent);
	}
}
