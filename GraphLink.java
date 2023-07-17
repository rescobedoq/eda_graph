public class GraphLink <E>{
	protected ListLinked<Vertex<E>> listVertex;
	public GraphLink() {
		this.listVertex = new ListLinked<Vertex<E>>();
	}
	public void insertVertex(E data) {
		Vertex<E> nuevoVertex = new Vertex<E>(data);
		if (listVertex.search(nuevoVertex))
			System.out.println("El vertice se ha insertado anteriormente");
		else
			listVertex.insertFirst(nuevoVertex);
	}
	
	public void insertEdge(E dataOri, E dataDes) {  
		Vertex<E> vertexOri = listVertex.searchNode(new Vertex<E>(dataOri));
		Vertex<E> vertexDes = listVertex.searchNode(new Vertex<E>(dataDes));
		
		if(vertexOri == null || vertexDes == null) {
			System.out.println("Alguno de los vertice no existen...");
			return;
		}
		Edge <E> e = new Edge <E>(vertexDes);
		if (vertexOri.listAdj.search(e) == true) {
			System.out.println("Arista se ha insertado anteriormente...");
			return;
		}
		vertexOri.listAdj.insertFirst(e);
//		vertexDes.listAdj.insertFirst(new Edge<E> (vertexOri));   // si es no dirigido se ejecuta esta linea
	} 
	
	@Override
	public String toString() {
		return this.listVertex.toString();
	}
	
	/*public void removeEdge(E dataOri, E dataDes) {
	
	}
	
	public void removeVertex(E x) {
	
	}

	public boolean searchEdge (E vOri, E vDes) {
	
	}
	
	public boolean searchVertex (E data) {
	
	}
	*/
}
