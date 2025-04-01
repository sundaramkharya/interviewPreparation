package com.sundaram.myProject;

public class DFS {
    public static void main(String[] args) {//direction --> up,down,left, right, diagonal
        int[][] array= {{1, 1, 0, 0, 0},// right[-1,-1,-1,0,0,0,1,1,1]
                {0, 1, 0, 0, 1},//left[-1,0,1,-1,1,-1,]
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 0}};
        int row=array.length;
        int col=array[0].length;
        boolean[][] visited=new boolean[row][col];

    }
    int neihgbour(int [][]array,boolean[][]visited, int r,int c ){
        int [] right={-1,-1,-1,0,0,0,1,1,1};

    }


}
