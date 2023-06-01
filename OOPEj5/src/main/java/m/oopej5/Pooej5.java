/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.oopej5;

import Entity.Account;
import Service.AccountService;

/**
 *
 * @author AndreaCardenasT
 */
public class Pooej5 {
    
    public static void main(String[] args){
        
        AccountService service = new AccountService();
        Account firstAcc = service.createAccount();
        
        System.out.println(firstAcc.getAccountNo());
        System.out.println("Tu cuenta te va a pagar un interes del " + (firstAcc.getInterest() * 100) + "%");
        
        
        service.depositar(firstAcc);
        service.consultarSaldo(firstAcc);
        
        service.retirar(firstAcc);
        service.consultarSaldo(firstAcc);
        
        service.extraccionRapida(firstAcc);
        
        
        service.consultarSaldo(firstAcc);
        System.out.println("----");
        service.consultarDatos(firstAcc);
    }
}
