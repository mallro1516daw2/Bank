/**
 * 
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public interface OperacionsClient 
    {
    /**
     * 
     * @param Diners
     * @param c1 
     */
    public void IngressarDiners(int Diners, Compte c1);
    
    /**
     * 
     * @param Diners
     * @param c1 
     */
    public void retirarDiners(int Diners, Compte c1);
    
    /**
     * 
     * @param cOrigen
     * @param cFinal
     * @param Diners 
     */
    public void transferirDiners(Compte cOrigen, Compte cFinal, int Diners);
    
    /**
     * 
     * @param Diners
     * @param b1
     * @param compteClient 
     */
    public void demanarPréstec(int Diners, Banquer b1, Compte compteClient);
    }
