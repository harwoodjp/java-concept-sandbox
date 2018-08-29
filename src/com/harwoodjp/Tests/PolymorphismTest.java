package com.harwoodjp.Tests;

import com.harwoodjp.Classes.Circle;
import com.harwoodjp.Classes.Triangle;
import com.harwoodjp.Interfaces.ShapeInterface;

public class PolymorphismTest {
    public static void run() {
        ShapeInterface shape = new Triangle();
        shape.sayShape();

        ShapeInterface shape2 = new Circle();
        shape2.sayShape();
    }
}
