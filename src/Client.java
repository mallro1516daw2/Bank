
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public class Client extends Usuari implements OperacionsClient
    {
    private int nTelf;
    private int nTargeta;
    private boolean moros;
    private final Date dataOperacio;
        
    /**
     * 
     * @param nom
     * @param Pcognom
     * @param Scognom
     * @param DNI
     * @param nUsuari
     * @param contrasenya
     * @param nTelf
     * @param nTargeta
     * @param moros 
     */
    public Client(String nom, String Pcognom, String Scognom, String DNI, int nUsuari, int contrasenya, int nTelf, int nTargeta, boolean moros) //Constructor amb atributs.
        {
        //ATRIBUTS SUPER CLASE USUARI//
        this.nom = nom;
        this.Pcognom = Pcognom;
        this.Scognom = Scognom;
        this.DNI = DNI;
        this.nUsuari = nUsuari;
        this.contrasenya = contrasenya;
        
        //ATRIBUTS CLASSE CLIENT//
        this.nTelf = nTelf;
        this.nTargeta = nTargeta;
        this.moros = moros;
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataOperacio = d1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String aux = sdf.format(d1);
        
        System.out.println(nom + " ha fet una operació el dia "+aux) ;
        
        }
    
    //ATRIBUTS SUPER CLASE USUARI//
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
    
    //ATRIBUTS CLASSE CLIENT//
    /**
     * 
     * @param nTelf 
     */
    public void setnTelf(int nTelf) {this.nTelf = nTelf;}
    /**
     * 
     * @return nTelf 
     */
    public int getnTelf() {return nTelf;}

    /**
     * 
     * @param nTargeta 
     */
    public void setnTargeta(int nTargeta) {this.nTargeta = nTargeta;}
    /**
     * 
     * @return nTargeta 
     */
    public int getnTargeta() {return nTargeta;}

    /**
     * 
     * @param moros 
     */
    public void setMoros(boolean moros) {this.moros = moros;}
    /**
     * 
     * @return moros 
     */
    public boolean isMoros() {return moros;}

    /**
     * 
     * @param Diners
     * @param c1 
     */
    @Override
    public void IngressarDiners(int Diners, Compte c1) 
        {
        int diners = c1.getDiners();
        int dinersfinal = diners + Diners;
        c1.setDiners(dinersfinal);
        }

    /**
     * 
     * @param Diners
     * @param c1 
     */
    @Override
    public void retirarDiners(int Diners, Compte c1) 
        {
        int diners = c1.getDiners();
        int dinersfinal = diners - Diners;
        c1.setDiners(dinersfinal);
        }

    /**
     * 
     * @param cOrigen
     * @param cFinal
     * @param Diners 
     */
    @Override
    public void transferirDiners(Compte cOrigen, Compte cFinal, int Diners) 
        {
        int dinersCompteOrigen = cOrigen.getDiners();
        int dinersCompteFinal = cFinal.getDiners();
        cOrigen.setDiners(dinersCompteOrigen - Diners);
        cFinal.setDiners(dinersCompteFinal + Diners);
        }

    /**
     * 
     * @param Diners
     * @param b1
     * @param cClient 
     */
    @Override
    public void demanarPréstec(int Diners, Banquer b1, Compte cClient) 
        {
        boolean préstecConcedit = b1.concedirPréstec(cClient);
        int dinersAlCompte = cClient.getDiners();
        
        if (préstecConcedit) 
            {
            cClient.setDiners(dinersAlCompte + Diners);
            dinersAlCompte = cClient.getDiners();
            System.out.println("Préstec concedit. El seu saldo actual és " + dinersAlCompte);
            }
        
        else {System.out.println("Després d'estudiar el seu cas, no li podem concedir el préstec");}
        }
    }
