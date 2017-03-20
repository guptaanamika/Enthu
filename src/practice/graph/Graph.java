package practice.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {

	private Map<Integer, List<Integer>> adjacenyList;

	public Graph() {
		adjacenyList = new HashMap<Integer, List<Integer>>();
	}

	public void addEdge(Integer u, Integer v) {
		if (!adjacenyList.containsKey(u))
			adjacenyList.put(u, new ArrayList<Integer>());
		adjacenyList.get(u).add(v);
	}

	public Integer getSize() {
		if (null != adjacenyList) {
			return adjacenyList.size();
		}
		return 0;
	}

	public List<Integer> getAdjacenyList(Integer u) {
		if (adjacenyList.containsKey(u))
			return adjacenyList.get(u);
		return new ArrayList<Integer>();
	}

	public Set<Integer> getVertices() {
		return adjacenyList.keySet();
	}
}
