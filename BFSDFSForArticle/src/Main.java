
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//Lets create nodes as given as an example in the article
		Node n1=new Node('1');
		Node n2=new Node('2');
		Node n3=new Node('3');
		Node n4=new Node('4');
		Node n5=new Node('5');
		Node n6=new Node('6');
		Node n7=new Node('7');
		Node n8=new Node('8');

		//Create the graph, add nodes, create edges between nodes
		Graph g=new Graph();
		g.addNode(n1);
		g.addNode(n2);
		g.addNode(n3);
		g.addNode(n4);
		g.addNode(n5);
		g.addNode(n6);
		g.addNode(n7);
		g.addNode(n8);
		g.setRootNode(n1);
		
		g.connectNode(n1,n2);
		g.connectNode(n1,n3);
		
		g.connectNode(n2,n1);
		g.connectNode(n2,n3);
		g.connectNode(n2,n4);
		g.connectNode(n2,n5);
		
		g.connectNode(n3,n1);
		g.connectNode(n3,n5);
		g.connectNode(n3,n7);
		g.connectNode(n3,n8);
		
		g.connectNode(n4,n2);
		g.connectNode(n4,n5);
		
		g.connectNode(n5,n2);
		g.connectNode(n5,n3);
		g.connectNode(n5,n4);
		g.connectNode(n5,n6);
		
		g.connectNode(n6,n5);
		
		g.connectNode(n7,n3);
		g.connectNode(n7,n8);
		
		g.connectNode(n8,n3);
		g.connectNode(n8,n7);
		
		System.out.println("BFS Tree Traversal: ");
		g.bfs();
		
		
		
		
	}

}
