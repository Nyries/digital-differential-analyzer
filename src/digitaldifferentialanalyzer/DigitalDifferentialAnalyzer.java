/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitaldifferentialanalyzer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christine
 */
public class DigitalDifferentialAnalyzer {
    public static List<Pair> compute(Pair<Integer, Integer> p0, Pair<Integer, Integer> p1) {
        List<Pair> points = new ArrayList<>();
                
        // Calculate the difference between two end points
        int dx = p1.x - p0.x;
        int dy = p1.y - p0.y;
        
        // Calculate number of steps
        int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
        
        // Calculate increments
        double xIncrement = dx / (float) steps;
        double yIncrement = dy / (float) steps;
        
        // Compute points
        double x = p0.x;
        double y = p0.y;
        points.add(new Pair<>((int) x, (int) y));
        for (int i = 0; i < steps; i++) {
            x += xIncrement;
            y += yIncrement;
            Pair<Integer, Integer> point = new Pair<>((int) Math.round(x),(int) Math.round(y));
            points.add(point);
        }
        
        return points;
    }
}
    