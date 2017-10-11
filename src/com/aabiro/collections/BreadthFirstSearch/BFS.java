package com.aabiro.collections.BreadthFirstSearch;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    //O(V+E)
    public void bfs(Vertex root){

        //Need FIFO structure, QUEUE in BFS
        Queue<Vertex> queue = new LinkedList<>(); //LinkedList implements the Queue interface
        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()){
            Vertex actualVertex = queue.remove(); //FIFO
            System.out.println(actualVertex+"  ");

            //visit neighbours
            for (Vertex v : actualVertex.getNeighbourList()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }

        }


    }
}
