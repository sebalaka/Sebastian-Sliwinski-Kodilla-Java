package com.kodilla.testing.shape;

import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.size());
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle(4, 7 , 4);
        shapeCollector.addFigure(shape);
        //When
        Shape gettedShape = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape, gettedShape);
    }

    @Test
    public void testRemoveFigure(){
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //when
        shapeCollector.removeFigure(shape);
        //then
        assertEquals(0,shapeCollector.size());
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        System.out.println(shapeCollector);
        //When
        shapeCollector.showFigures();
        String kkk = shape.getShapeName();
        //Then
        assertEquals(kkk, "Square");

    }
 //showfigures = sout
}
