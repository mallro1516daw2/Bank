/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernat
 */
public interface OperacionsBanquer {
    public void donarAltaClient(Banquer b1, String nom, String cognom1, String cognom2, String DNI, int usrNm, int pswd);
    
    public void donarBaixaClient(Banquer b1, Client cl1);
    
    public int obrirCompte(Banquer b1);
    
    public void tancarCompte(Banquer b1);
    
    public boolean concedirPréstec(Compte cClient); //In check
}
