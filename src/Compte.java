/**
 * 
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public class Compte 
    {
    private int idCompte;
    private int nPropietari;
    private int diners;
    
    /**
     * 
     * @param idCompte
     * @param nPropietari
     * @param diners 
     */
    public Compte(int idCompte, int nPropietari, int diners) //Constructor amb atributs.
        {
        this.idCompte = idCompte;
        this.nPropietari = nPropietari;
        this.diners = diners;
        }

    /**
     * 
     * @param idCompte 
     */
    public void setIdCompte(int idCompte) {this.idCompte = idCompte;}
    /**
     * 
     * @return idCompte
     */
    public int getIdCompte() {return idCompte;}

    /**
     * 
     * @param nPropietari 
     */
    public void setnPropietari(int nPropietari) {this.nPropietari = nPropietari;}
    /**
     * 
     * @return nPropietari
     */
    public int getnPropietari() {return nPropietari;}

    /**
     * 
     * @param diners 
     */
    public void setDiners(int diners) {this.diners = diners;}
    /**
     * 
     * @return diners
     */
    public int getDiners() {return diners;}
    }
