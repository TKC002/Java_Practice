package util.shape;

public class Vector {
    private double[] e;

    public Vector(double... e){
        if (e == null || e.length == 0) {
            throw new IllegalArgumentException("need more than one element.");
        }
        this.e = e.clone();
    }

    public int getDimension() {
        return e.length;
    }

    public double get(int index) {
        return this.e[index];
    }

    // calculations
    public boolean sameDim(Vector other){
        if (this.getDimension() != other.getDimension()){
            throw new IllegalArgumentException("different dimensions.");
        }else{
            return true;
        }
    }

    public Vector add(Vector other){
        this.sameDim(other);
        double[] res = new double[this.getDimension()];
        for(int i=0; i<this.getDimension(); i++){
            res[i] = this.get(i)+other.get(i);
        }
        return new Vector(res);
    }
    public Vector subtract(Vector other){
        this.sameDim(other);
        double[] res = new double[this.getDimension()];
        for(int i=0; i<this.getDimension(); i++){
            res[i] = this.get(i)-other.get(i);
        }
        return new Vector(res);
    }

    public double distance(Vector other){
        this.sameDim(other);
        double sum = 0;
        for(int i=0; i<this.getDimension(); i++){
            sum +=Math.pow(this.get(i)-other.get(i), 2);
        }
        return Math.sqrt(sum);
    }
    
}
