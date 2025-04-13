package util.shape;

import java.lang.Math;

public class Polygon extends Shape {
    private Vector[] p;
    private int n; 

    public Polygon(Vector... p){
        this.p = p.clone();
        this.n = p.length;
    }

    @Override
    public double area() {
        double res = 0;
        int next;
       for(int i=0; i<this.n; i++){
        next = (i+1) % n;
        res += this.p[i].get(0)*this.p[next].get(i)-this.p[next].get(0)*this.p[i].get(1);
       }
       res = Math.abs(res) / 2;
       return res;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public void move(Vector p) {
        for (int i=0; i<this.n; i++){
            this.p[i] = this.p[i].add(p);
        }
    }

    @Override
    public boolean contain(Vector p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contain'");
    }
    
}
