// import static org.junit.Assume.assumeFalse;

import java.util.*;

public class AdjacencyListImplementation {
    public static class graph{
        // ArrayList<Integer> l = new ArrayList<Integer>();
        // Map<Integer, ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
        public Vector<Vector<Integer>> vl = new Vector<>(5);

        public void addEdge(int u, int v, boolean direction){
            // Vector<Integer> al = new Vector<>();
            vl.get(u).add(v);

            if (direction == false){
                vl.get(v).add(u);
            }
        }

        public void printAdj(){
            for(int i= 0;i< vl.size(); i++){
                System.out.print(i + " --> ");
                for(int j = 0; j < vl.elementAt(i).size(); j++){
                    System.out.print(vl.elementAt(i).elementAt(j) + ", ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        graph g = new graph();
        int m = 5;

        for (int i = 0 ; i< m; i++){
            g.vl.add(new Vector<Integer>()); //  this is adding a vector at every index of the adjacency list
        }

        g.addEdge(0, 1, false);
        g.addEdge(0, 2, false);
        g.addEdge(0, 3, false);
        
        g.addEdge(1, 2, false);
        // g.addEdge(0, 1, false);
        

        

        // printing the graph
        g.printAdj();
        
    }
}
