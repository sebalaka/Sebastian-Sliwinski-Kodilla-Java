package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return shapeCollection.remove(shape);
    }

    public Shape getFigure(int n){
        if(n>0 && n<=shapeCollection.size()){
            return shapeCollection.get(n);
        } else {
            return null;
        }
    }


    public void showFigures(){
        System.out.println(shapeCollection.toString());
    }

    int size() {
        return shapeCollection.size();
    }


}
