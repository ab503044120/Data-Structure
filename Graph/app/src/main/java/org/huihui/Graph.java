package org.huihui;

/**
 * User: huihui
 * Date: 2016-10-16 {HOUR}:44
 */
public class Graph {
    /**
     * 定点数
     */
    private int vertexSize;
    /**
     * 顶点数组
     */
    private int[] vertexs;
    /**
     * 矩阵
     */
    private int[][] matrix;

    private boolean[] isVisited;

    private static final int MAX_WEIGHT = 1000;

    public Graph(int vertextSize) {
        this.vertexSize = vertextSize;
        matrix = new int[vertextSize][vertextSize];
        vertexs = new int[vertextSize];
        for (int i = 0; i < vertextSize; i++) {
            vertexs[i] = i;
        }
        isVisited = new boolean[vertextSize];
    }

    public void Create() {
        int[] a1 = new int[]{0, 10, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 11, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT};
        int[] a2 = new int[]{10, 0, 18, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 16, MAX_WEIGHT, 12};
        int[] a3 = new int[]{MAX_WEIGHT, MAX_WEIGHT, 0, 22, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 8};
        int[] a4 = new int[]{MAX_WEIGHT, MAX_WEIGHT, 22, 0, 20, MAX_WEIGHT, MAX_WEIGHT, 16, 21};
        int[] a5 = new int[]{MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 20, 0, 26, MAX_WEIGHT, 7, MAX_WEIGHT};
        int[] a6 = new int[]{11, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 26, 0, 17, MAX_WEIGHT, MAX_WEIGHT};
        int[] a7 = new int[]{MAX_WEIGHT, 16, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 17, 0, 19, MAX_WEIGHT};
        int[] a8 = new int[]{MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 16, 7, MAX_WEIGHT, 19, 0, MAX_WEIGHT};
        int[] a9 = new int[]{MAX_WEIGHT, 12, 8, 21, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 0};
        matrix[0] = a1;
        matrix[1] = a2;
        matrix[2] = a3;
        matrix[3] = a4;
        matrix[4] = a5;
        matrix[5] = a6;
        matrix[6] = a7;
        matrix[7] = a8;
        matrix[8] = a9;
    }

    /**
     * 获取某个顶点的出度
     *
     * @return
     */
    public int getOutDegree(int index) {
        int degree = 0;
        for (int i = 0; i < vertexSize; i++) {
            if (matrix[index][i] > 0 && matrix[index][i] < MAX_WEIGHT) {
                degree++;
            }
        }
        return degree;
    }
    /**
     * 获取某个顶点的入度
     *
     * @return
     */
    public int getInDegree(int index) {
        int degree = 0;
        for (int i = 0; i < vertexSize; i++) {
            if (matrix[i][index] > 0 && matrix[i][index] < MAX_WEIGHT) {
                degree++;
            }
        }
        return degree;
    }

    /**
     * 广度优先遍历
     */
    public void depthFirstSearch(){

    }

    public static void main(String[] Args) {
        Graph graph = new Graph(9);
        graph.Create();
        System.out.println("点0出度: " + graph.getOutDegree(0));
        System.out.println("点0入度: " + graph.getInDegree(0));
    }

}  