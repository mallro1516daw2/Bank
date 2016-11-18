/**
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public class Banquer extends Usuari implements OperacionsBanquer
    {
    
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
    
  
    public void setNom(String nom) {this.nom = nom;}
 
    public String getNom() {return nom;}

    
    public void setPcognom(String Pcognom) {this.Pcognom = Pcognom;}
    
    public String getPcognom() {return Pcognom;}

   
    public void setScognom(String Scognom) {this.Scognom = Scognom;}
    
    public String getScognom() {return Scognom;}

    public void setDNI(String DNI) {this.DNI = DNI;}
   
    public String getDNI() {return DNI;}

    
    public void setnUsuari(int nUsuari) {this.nUsuari = nUsuari;}
    
    public int getnUsuari() {return nUsuari;}

    public void setContrasenya(int contrasenya) {this.contrasenya = contrasenya;}

    public int getContrasenya() {return contrasenya;}
    
    public boolean autenticarse(Banquer b1, int pswd){
        int contrassenya = b1.getContrasenya();
        if (contrassenya == pswd){
            return true;
        }
        return false;
    }

    @Override
    public void donarAltaClient(Banquer b1, String nom, String cognom1, String cognom2, String DNI, int usrNm, int pswd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void donarBaixaClient(Banquer b1, Client cl1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obrirCompte(Banquer b1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tancarCompte(Banquer b1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean concedirPréstec(Compte cClient) {
        boolean concedir;
        int dinersAlCompte = cClient.getDiners();
        if (dinersAlCompte >= 0){
             concedir = true;
        }
        else{
            concedir = false;
        }
        return concedir;
    }
    }
