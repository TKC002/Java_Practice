package util.shape;

abstract class Shape{
    public abstract double area();
    public abstract double volume();
    // public abstract void draw();
    public abstract void move(Vector p);
    public abstract void contain(Vector p); 
}