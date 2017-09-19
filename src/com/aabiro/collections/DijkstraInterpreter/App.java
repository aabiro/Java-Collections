package com.aabiro.collections.DijkstraInterpreter;

public class App {

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        algorithm.interpreterExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
        algorithm.interpreterExpression("( ( 1 + 2 ) / ( 2 + 1 ) )");


        algorithm.result();
    }
}
