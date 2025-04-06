import util.shape.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1.0, 2.0);
        Vector v2 = new Vector(3.0, 4.0);

        Vector sum = v1.add(v2);      // 結果は (4.0, 6.0)
        Vector diff = v1.sub(v2); // 結果は (-2.0, -2.0)
        System.out.println("sum: (" + sum.get(0) + ", " + sum.get(1) + "), should be (4.0, 6.0)");
        System.out.println("diff: (" + diff.get(0) + ", " + diff.get(1) + "), should be (-2.0, -2.0)");

        Vector m = v2.mul(3);
        Vector d = v2.div(3);
        System.out.println("sum: (" + m.get(0) + ", " + m.get(1) + "), should be (9.0, 12.0)");
        System.out.println("diff: (" + d.get(0) + ", " + d.get(1) + "), should be (1.0, 1.333)");

        double i = v1.innerProduct(v2);
        Vector c = v1.crossProduct(v2);
        System.out.println("sum: (" + i + "), should be 11");
        System.out.println("diff: (" + c.get(0) + ", " + c.get(1) + "," + c.get(2) + "), should be (0, 0, -2)");

    }
}
