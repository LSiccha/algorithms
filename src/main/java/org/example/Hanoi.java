package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Hanoi {
    public static void main(String[] args) {

        HanoiSolver solver = new HanoiSolver();
        solver.solve(3);
    }
}

class HanoiSolver {

    private Deque<Integer> origen = new ArrayDeque<Integer>();
    private Deque<Integer> destino = new ArrayDeque<Integer>();
    private Deque<Integer> auxiliar = new ArrayDeque<Integer>();

    HanoiSolver() {

    }

    public void solve(Integer n) {
        for (int i = 1; i <= n; i++) {
            origen.push(i);
        }
        hanoi(n, origen, destino, auxiliar);
        System.out.println("ORIGEN: " + origen);
        System.out.println("DESTINO: " + destino);
        System.out.println("AUXILIAR: " + auxiliar);
    }

    void auxiliar(Deque destino, Deque auxiliar) {

    }

    boolean hanoi(Integer depth, Deque origen, Deque auxiliar, Deque destino) {
        if (depth > 0) {
            hanoi(depth - 1, origen, destino, auxiliar);
            if (!origen.isEmpty()) {
                Object disc = origen.getLast();
                origen.removeLast();
                System.out.println(disc);
                destino.add(disc);
            }
            hanoi(depth - 1, auxiliar, origen, destino);
            return true;
        }
        return true;
    }

    void log(Integer n, Integer n2){
        System.out.println("[FROM] " + n + " [TO] " + n2);
    }
}