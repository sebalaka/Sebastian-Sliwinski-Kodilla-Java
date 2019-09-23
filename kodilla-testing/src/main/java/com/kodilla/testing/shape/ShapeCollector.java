package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollection = new ArrayList<Shape>();
    public Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    int addFigure(Shape shape){
        return 1;
    }

    int removeFigure(Shape shape){
        return 0;
    }

    int getFigure(int n){
        return 2;
    }

    int showFigures(){
        return 3;
    }

    int size() {
        return shapeCollection.size();
    }

}
