/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bernat
 */
public interface OperacionsClient {
    public void IngressarDiners(int Diners, Compte c1);
    
    public void retirarDiners(int Diners, Compte c1);
    
    public void transferirDiners(Compte cOrigen, Compte cFinal, int Diners);
    
    public void demanarPréstec(int Diners, Banquer b1, Compte compteClient);
}
