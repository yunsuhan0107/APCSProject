public class TaxicabClient {
    public static void main(String[] args) {
        Taxicab cab1 = new Taxicab();
        Taxicab cab2 = new Taxicab(5, -8);
        cab1.moveX(3);
        cab1.moveY(-4);
        cab1.moveX(-1);
        System.out.println(cab1.getDistanceTraveled());
        cab2.moveY(7);
        System.out.println(cab2.getYCoord());
    }
}
