package org.sedgewick.algorithms.search;

import edu.princeton.cs.algs4.FlowEdge;
import edu.princeton.cs.algs4.FlowNetwork;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordFulkersonMaximumFlowSearchTest {
    /*
       1 -> 3 ->
      / \ \  \   \
    0 - >2 -> 4 -> 5
     */
    private static FlowNetwork flowNetwork;

    @Test
    void test(){
        FordFulkersonMaximumFlowSearch ffs = new FordFulkersonMaximumFlowSearch(flowNetwork, 0, 5);
        assertEquals(15, ffs.value());
    }

    @BeforeAll
    static void setUp() {
        flowNetwork = new FlowNetwork(6);
        flowNetwork.addEdge(new FlowEdge(0, 1, 10));
        flowNetwork.addEdge(new FlowEdge(0, 2, 5));
        flowNetwork.addEdge(new FlowEdge(1, 3, 9));
        flowNetwork.addEdge(new FlowEdge(1, 4, 4));
        flowNetwork.addEdge(new FlowEdge(2, 1, 4));
        flowNetwork.addEdge(new FlowEdge(2, 4, 8));
        flowNetwork.addEdge(new FlowEdge(3, 5, 10));
        flowNetwork.addEdge(new FlowEdge(3, 4, 15));
        flowNetwork.addEdge(new FlowEdge(4, 5, 10));
    }
}