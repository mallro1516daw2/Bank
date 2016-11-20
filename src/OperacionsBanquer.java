/**
 * 
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public interface OperacionsBanquer 
    {
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
    public void donarAltaClient(Banquer b1, String nom, String cognom1, String cognom2, String DNI, int usrNm, int pswd);
    
    /**
     * 
     * @param b1
     * @param cl1 
     */
    public void donarBaixaClient(Banquer b1, Client cl1);
    
    /**
     * 
     * @param b1
     * @return 
     */
    public int obrirCompte(Banquer b1);
    
    /**
     * 
     * @param b1 
     */
    public void tancarCompte(Banquer b1);
    
    /**
     * 
     * @param cClient
     * @return 
     */
    public boolean concedirPréstec(Compte cClient); //In check
    }
