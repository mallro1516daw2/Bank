/**
 * 
 * @author Alfred Ferrer, Bernat Montoro, Marc LLobera.
 */
public class Principal
    {
    public static void main (String[] args)
        {
        Client client1 = new Client("Joan", "Perez","Martinez","412555563U",0001,2222,641225441,1234,false);
        Client client2 = new Client("Carlos", "Javier","Perea","214785563A",0002,3333,611225992,4321,false);
        
        Compte compte1 = new Compte(0001,0001,200);
        Compte compte2 = new Compte(0002,0002,2300);
        Compte compte3 = new Compte(0003,0001,200);
        
        Banquer banquer1 = new Banquer("Ferran", "Pallús","Jandro","32114587A",1234,1234);
        
        client1.IngressarDiners(200, compte1);
        System.out.println("El seu saldo actual és " + compte1.getDiners());
        
        client2.retirarDiners(3000, compte2);
        System.out.println("El seu saldo actual és " + compte2.getDiners());
        
        client1.demanarPréstec(1200, banquer1, compte1);
        
        client1.transferirDiners(compte1,compte3,600);
        System.out.println("Despres de la trasferencia el seu saldo actual és " +compte3.getDiners());
        }
    }
