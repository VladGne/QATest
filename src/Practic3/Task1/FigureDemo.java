package Practic3.Task1;

 class FigureDemo{

     public static void main(String args[]){
        Circle circle = new Circle();
        System.out.println(String.format("%sArea - %.2f",circle.toString(), circle.getArea()));

        Cylinder cylinder = new Cylinder();
        System.out.println(String.format("%sArea - %.2f\nVolume - %.2f",cylinder.toString(), cylinder.getArea(), cylinder.getVolume()));
     }
}
