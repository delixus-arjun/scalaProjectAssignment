package com.dag.generator


import scala.collection.mutable.ArrayBuffer

/*
    Scala program for
    DAG Generation.

*/
class DAG(var vertices: Int, var list: ArrayBuffer[ArrayBuffer[Int]], var time: Int) {
  def this(vertices: Int) {
    this(vertices, new ArrayBuffer[ArrayBuffer[Int]](vertices), 0);
    var i: Int = 0;
    while (i < this.vertices) {
      this.list += new ArrayBuffer[Int]();
      i += 1;
    }
  }

  // Connect two node with new edge
  def addEdge(u: Int, v: Int): Unit = {
    if (u >= this.vertices || v >= this.vertices || v < 0 || u < 0) {
      //  invalid node
      return;
    }
    // First edge from  (u to v)
    list(u) += v;
    if (u == v) {
      // Self loop
      return;
    }
    // Second edge from  (v to u)
    list(v) += u;
  }

  def min(a: Int, b: Int): Int = {
    if (a < b) {
      return a;
    }
    return b;
  }



  // Display graph nodes and edges
  def printGraph(): Unit = {
    print("\n Generated Graph List ");
    var i: Int = 0;
    while (i < this.vertices) {
      print(" \n [" + i + "] :");
      var j: Int = 0;
      // iterate edges of i node
      while (j < this.list(i).size) {
        print("  " + this.list(i)(j));
        j += 1;
      }
      i += 1;
    }
  }
}