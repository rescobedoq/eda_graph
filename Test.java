public class Test {

	public static void main(String[] args) throws ExceptionIsEmpty {
		
		System.out.println("Insertando vertices \n");
		GraphLink<String> g1 = new GraphLink<String>();

		g1.insertVertex("Lima");
		g1.insertVertex("Arequipa");
		g1.insertVertex("Cuzco");
		g1.insertVertex("Tacna");
		g1.insertVertex("Moquegua");
		g1.insertVertex("Puno");

		g1.insertVertex("Puno");

		System.out.println(g1+ "\n");
		System.out.println("Insertando aristas \n");
		g1.insertEdge("Lima", "Cuzco");
		g1.insertEdge("Arequipa", "Tacna");
		g1.insertEdge("Tacna", "Lima");
		g1.insertEdge("Cuzco", "Arequipa");
		g1.insertEdge("Lima", "Arequipa");
		g1.insertEdge("Lima", "Moquegua");
		g1.insertEdge("Arequipa", "Puno");
		g1.insertEdge("Puno", "Cuzco");
		System.out.println(g1+ "\n");
	}

}
