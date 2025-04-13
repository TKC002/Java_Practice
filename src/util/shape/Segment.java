package util.shape;

public class Segment extends Shape{
    private Vector p;
    private Vector q;

    public Segment(Vector p, Vector q){
        this.p = p;
        this.q = q;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public void move(Vector p) {
        this.p = this.p.add(p);
        this.q = this.q.add(p);
    }

    @Override
    public boolean contain(Vector p) {
        Vector direction = this.q.sub(this.p);
        Vector tmp = p.sub(this.p);

        double[] para = direction.parallel(tmp);
        if(para[0]==1 && para[1]>=0 && para[1]<=1){
            return true;
        }else{
            return false;
        }
    }

    public boolean cross(Segment other){
        // it is for only 2D 
        Vector ab = this.q.sub(this.p);
        Vector ac = other.p.sub(this.p);
        Vector ad = other.q.sub(this.p);
        return ab.crossProduct(ac).get(2)*ab.crossProduct(ad).get(2) < 0;
    }
    
}
