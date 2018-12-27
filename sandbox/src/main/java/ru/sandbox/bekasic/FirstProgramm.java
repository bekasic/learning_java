package ru.sandbox.bekasic;

class FirstProgramm {
    public static void main(String[] args) {
//        Square s = new Square(5);
//        Rectangle r = new Rectangle(2, 6);
//
//        System.out.println("Square " + s.l + " has area " + s.area()) ;
//        System.out.println("Rectangle " + r.a + " and " + r.b + " has area " + r.area()) ;

       Point p1 = new Point(6, 4);
       Point p2 = new Point(2, 1);

       System.out.println("Distance between  two point is " +  p1.distance(p1, p2));

    }
}