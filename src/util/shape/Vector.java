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

    public Vector mul(double a){
        double[] res = new double[this.getDimension()];
        for(int i=0; i<this.getDimension(); i++){
            res[i] = this.get(i)*a;
        }
        return new Vector(res);
    }
    public Vector div(double a){
        double[] res = new double[this.getDimension()];
        for(int i=0; i<this.getDimension(); i++){
            res[i] = this.get(i)/a;
        }
        return new Vector(res);
    }

    public double innerProduct(Vector other){
        this.sameDim(other);
        double res = 0;
        for(int i=0; i<this.getDimension(); i++){
            res +=this.get(i)*other.get(i);
        }
        return res;
    }
    
    public Vector crossProduct(Vector other){
        this.sameDim(other);
        if (this.getDimension()==2){
            return this.crossProduct2D(other);
        }else if(this.getDimension()==3){
            return this.crossProduct3D(other);
        }else{
            throw new IllegalArgumentException(String.format("invalid dimension %d. dimension must be 2 or 3.", this.getDimension()));
        }
    }
    private Vector crossProduct2D(Vector other) {
        return new Vector(0, 0, this.get(0)*other.get(1)-this.get(1)*other.get(0));
    }
    private Vector crossProduct3D(Vector other){
        double e0 = this.get(1)*other.get(2)-this.get(2)*other.get(1);
        double e1 = this.get(2)*other.get(0)-this.get(0)*other.get(2);
        double e2 = this.get(0)*other.get(1)-this.get(1)*other.get(0);
        return new Vector(e0, e1, e2);
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
