public class asssiettecarré extends assiette{
    private double cote;
    public asssiettecarré(int a , double c)
    {
        super(a);
        cote = c;
    }
    public double getCote() {
        return cote;
    }
    public void setCote(double cote)
    {
        this.cote = cote;
    }
    @Override
    public double calcsurface() {
        double s = cote * cote;
        return s;
    }
    public int calcvaleur()
    {
        return 5 * super.calcvaleur();
    }
}
