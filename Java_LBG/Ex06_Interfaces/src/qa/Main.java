package qa;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("rectnagle1","red", 5, 7, 25, 10);
        Rectangle rec2 = new Rectangle("rectnagle2","blue", 6, 8, 17, 5);
        Circle cir1 = new Circle ("circle1", "brown", 5 , 10, 25);
        Circle cir2 = new Circle ("circle1", "brown", 5 , 10, 10);

        System.out.println(rec1.getCentrePoint());
        System.out.println(rec2);

        System.out.println(cir1);
        System.out.println(cir2.getCurrentLocation());

    }
}
