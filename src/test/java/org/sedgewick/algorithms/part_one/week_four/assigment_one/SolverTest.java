package org.sedgewick.algorithms.part_one.week_four.assigment_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolverTest {

    @Test
    void isSolvable() {
        int[][] tiles = {
                {1, 2, 3},
                {4, 5, 0},
                {7, 8, 6},
        };
        Solver solver = new Solver(new Board(tiles));
        assertTrue(solver.isSolvable());
        assertEquals(1, solver.moves());
    }

    @Test
    void isNotSolvable() {
        int[][] tiles = {
                {1, 3, 2},
                {4, 5, 0},
                {7, 8, 6},
        };
        Solver solver = new Solver(new Board(tiles));
        assertFalse(solver.isSolvable());
    }

    @Test
    void solve() {
        int[][] tiles = {
                {0, 1, 3},
                {4, 2, 5},
                {7, 8, 6},
        };
        Solver solver = new Solver(new Board(tiles));
        assertTrue(solver.isSolvable());
        assertEquals(4, solver.moves());
    }

    @Test
    void solve10() {
        int[][] tiles = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 0}
        };
        Solver solver = new Solver(new Board(tiles));
        assertTrue(solver.isSolvable());
        assertEquals(0, solver.moves());
    }
}