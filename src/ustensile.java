abstract public class ustensile {
    private int annee;
    public ustensile(int a)
    {
        annee = a;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public int calcvaleur() {
        {
            if(2024 - getAnnee() < 50)
            {
                return 0;
            }
            else
                return 2024 - getAnnee() - 50;
        }
    }
}
