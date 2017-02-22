/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitaldifferentialanalyzer;

import java.util.List;

/**
 *
 * @author Christine
 */
public class TestDigitalDifferentialAnalyzer {
    public static void main(String[] args) {
        Pair<Integer, Integer> p0 = new Pair<>(1, 7);
        Pair<Integer, Integer> p1 = new Pair<>(6, 10);
        
        List<Pair> result = DigitalDifferentialAnalyzer.compute(p0, p1);
        for (Pair point: result) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
