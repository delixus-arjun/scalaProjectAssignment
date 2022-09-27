package com.dag.generator



object DagGateway {
  def main(args: Array[String]): Unit = {
    var g: DAG = new DAG(10);
    // Connect node with edges
    g.addEdge(0, 1);
    g.addEdge(0, 3);
    g.addEdge(0, 7);
    g.addEdge(1, 2);
    g.addEdge(1, 5);
    g.addEdge(2, 3);
    g.addEdge(2, 4);
    g.addEdge(3, 8);
    g.addEdge(4, 5);
    g.addEdge(4, 6);
    g.addEdge(7, 9);
    // Display graph
    g.printGraph();

  }
}
