/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author operador
 */
public class Passageiro extends Usuario {

    public Passageiro(String nome, int telefone) {
        super();
        setNome(nome);
        setTelefone(telefone);
    }
    
    public void ListarPassageiros(List<Passageiro> p){ // Adicionei agora
        Iterator aux = p.listIterator();
        int numero = 1;
        while(aux.hasNext()){
            System.out.println("Passageiro numero " + numero + ": " + aux.next());
            numero++;
        }
    }

}
