public class dijistra {
    public static void main(String args[]){
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0 },
                                      { 4, 0, 1, 0, 0, 0 },
                                      { 0, 1, 0, 2, 0, 0 },
                                      { 0, 0, 2, 0, 3, 0 },
                                      { 0, 0, 0, 3, 0, 6 },
                                      { 0, 0, 0, 0, 6, 0 } };
        dijistra t = new dijistra();
        t.dijkstra(graph, 0);
    }
    static class dijistra
}
