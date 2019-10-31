public class BoxClient {
    public static void main(String[] args) {
        Box box1 = new Box(2.0, 7.0, 5.0);
        Box box2 = new Box();
        double volume1 = box1.calcVolume();
        double surfaceArea1 = box1.calcSurfaceArea();
        double volume2 = box2.calcVolume();
        double surfaceArea2 = box2.calcSurfaceArea();

        System.out.println("volume1 = " + volume1);
        System.out.println("surfaceArea1 = " + surfaceArea1);
        System.out.println("volume2 = " + volume2);
        System.out.println("surfaceArea2 = " + surfaceArea2);

    }
}
