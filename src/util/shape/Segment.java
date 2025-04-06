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
    public void contain(Vector p) {
        Vector direction = this.q.sub(this.p);
        Vector tmp = p.sub(this.p);


    }
    
}
