/**
 * 
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public class Banquer extends Usuari implements OperacionsBanquer
    {
   
    /**
     * 
     * @param nom
     * @param Pcognom
     * @param Scognom
     * @param DNI
     * @param nUsuari
     * @param contrasenya 
     */
    public Banquer(String nom, String Pcognom, String Scognom, String DNI, int nUsuari, int contrasenya) //Constructor amb atributs.
        {
        //ATRIBUTS SUPER CLASE USUARI
        this.nom = nom;
        this.Pcognom = Pcognom;
        this.Scognom = Scognom;
        this.DNI = DNI;
        this.nUsuari = nUsuari;
        this.contrasenya = contrasenya;
                
        }
    
    /**
     * 
     * @param nom 
     */
    public void setNom(String nom) {this.nom = nom;}
    /**
     * 
     * @return nom
     */
    public String getNom() {return nom;}

    /**
     * 
     * @param Pcognom 
     */
    public void setPcognom(String Pcognom) {this.Pcognom = Pcognom;}
    /**
     * 
     * @return Pcognom
     */
    public String getPcognom() {return Pcognom;}

    /**
     * 
     * @param Scognom 
     */
    public void setScognom(String Scognom) {this.Scognom = Scognom;}
    /**
     * 
     * @return Scognom
     */
    public String getScognom() {return Scognom;}
    /**
     * 
     * @param DNI 
     */
    public void setDNI(String DNI) {this.DNI = DNI;}
    /**
     * 
     * @return DNI
     */
    public String getDNI() {return DNI;}

    /**
     * 
     * @param nUsuari 
     */
    public void setnUsuari(int nUsuari) {this.nUsuari = nUsuari;}
    /**
     * 
     * @return nUsuari
     */
    public int getnUsuari() {return nUsuari;}
    /**
     * 
     * @param contrasenya 
     */
    public void setContrasenya(int contrasenya) {this.contrasenya = contrasenya;}
    /**
     * 
     * @return contrasenya
     */
    public int getContrasenya() {return contrasenya;}
    
    /**
     * 
     * @param b1
     * @param pswd
     * @return 
     */
    public boolean autenticarse(Banquer b1, int pswd)
        {
        int contrassenya = b1.getContrasenya();
        
        if (contrassenya == pswd) {return true;}
        return false;
        }

    /**
     * 
     * @param b1
     * @param nom
     * @param cognom1
     * @param cognom2
     * @param DNI
     * @param usrNm
     * @param pswd 
     */
    @Override
    public void donarAltaClient(Banquer b1, String nom, String cognom1, String cognom2, String DNI, int usrNm, int pswd) 
        {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    /**
     * 
     * @param b1
     * @param cl1 
     */
    @Override
    public void donarBaixaClient(Banquer b1, Client cl1) 
        {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    /**
     * 
     * @param b1
     * @return 
     */
    @Override
    public int obrirCompte(Banquer b1) 
        {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    /**
     * 
     * @param b1 
     */
    @Override
    public void tancarCompte(Banquer b1) 
        {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /**System.out.println("Esborrant compte");*/
        }

    /**
     * 
     * @param cClient
     * @return 
     */
    @Override
    public boolean concedirPréstec(Compte cClient) 
        {
        boolean concedir;
        int dinersAlCompte = cClient.getDiners();
        
        if (dinersAlCompte >= 0) {concedir = true;}
        else {concedir = false;}
        
        return concedir;
        }
    }
