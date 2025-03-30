import util.shape.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(1.0, 2.0);
        Vector v2 = new Vector(3.0, 4.0);
        Vector sum = v1.add(v2);      // 結果は (4.0, 6.0)
        Vector diff = v1.subtract(v2); // 結果は (-2.0, -2.0)
        
        System.out.println("sum: (" + sum.get(0) + ", " + sum.get(1) + ")");
        System.out.println("diff: (" + diff.get(0) + ", " + diff.get(1) + ")");
    }
}
