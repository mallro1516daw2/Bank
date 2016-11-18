public class Compte 
    {
    private int idCompte;
    private int nPropietari;
    private int diners;
    
    public Compte(int idCompte, int nPropietari, int diners) //Constructor amb atributs.
        {
        this.idCompte = idCompte;
        this.nPropietari = nPropietari;
        this.diners = diners;
        }

    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public void setnPropietari(int nPropietari) {this.nPropietari = nPropietari;}

    public int getnPropietari() {return nPropietari;}

    public void setDiners(int diners) {this.diners = diners;}

    public int getDiners() {return diners;}
    }
