public class asssietteronde extends assiette{
    private double rayon;
    public asssietteronde(int a,double r)
    {
        super(a);
        rayon = r;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public  double calcsurface()
    {
        double s = 3.14 * rayon * rayon;
        return  s;
    }
}
