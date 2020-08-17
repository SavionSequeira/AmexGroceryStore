package carrus;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
//import carrus.SqlFunctions;
class ShortestPath { 
    // A utility function to find the vertex with minimum distance value, 
    // from the set of vertices not yet included in shortest path tree 
    static final int V = 8; 

    static int index;
    public static String final_text;
    public ArrayList<Integer> shopId= new ArrayList<>();
     HashMap<Integer, Integer> hm = new HashMap<>();
    int minDistance(int dist[], Boolean sptSet[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < V; v++) 
            if (sptSet[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  
    // A utility function to print the constructed distance array 
    void printSolution(int dist[]) 
    { 
     //   System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < V; i++) 
        {
            for(int j=0;j<shopId.size();j++)
            {
                if(i==shopId.get(j))
                {
                    generateHaspMap(i,dist[i]);
                }
            }
        }
    } 

    void dijkstra(int graph[][], int src) 
    { 
        int dist[] = new int[V]; 
        Boolean sptSet[] = new Boolean[V]; 
        for (int i = 0; i < V; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 
        dist[src] = 0; 
        for (int count = 0; count < V - 1; count++) { 
            int u = minDistance(dist, sptSet); 
            sptSet[u] = true; 
            for (int v = 0; v < V; v++) 
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
                    dist[v] = dist[u] + graph[u][v]; 
        } 
        printSolution(dist); 
    } 
    void getArrayList()
    {
        SqlFunctions shopIdExtractor = new SqlFunctions();   
        shopId = shopIdExtractor.itemSearch(final_text);
    }
    void generateHaspMap(int pos,int dist)
    {
        hm.put(pos, dist);
    }
    void printHashMap()
    {
        System.out.println(hm);
    }
   
    void setString(String text){
        final_text = text;
    }
    void setIndex(int value)
    {
        index=value;
    }
    void runFunctions()
    {
        
        SqlFunctions shopNameExtractor = new SqlFunctions();
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, };
        ShortestPath t = new ShortestPath(); 
        t.getArrayList();
        t.dijkstra(graph, index); 
        shopNameExtractor.shopDisplay(t.hm);
    }
  
} 