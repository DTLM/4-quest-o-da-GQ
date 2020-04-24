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
public class Motorista extends Usuario {

    protected String modelo;
    protected boolean disponivel;

    public Motorista(String nome, int telefone, String modelo) {
        super();
        setNome(nome);
        setTelefone(telefone);
        this.modelo = modelo;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void indisponibilizar() {
        disponivel = false;
    }

    public void ListarMotoristas(List<Motorista> m) { //Adicionei agora
        Iterator aux = m.listIterator();
        int numero = 1;
        while (aux.hasNext()) {
            System.out.println("Passageiro numero " + numero + ": " + aux.next());
            numero++;
        }
    }
}
