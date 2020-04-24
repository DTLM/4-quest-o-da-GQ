/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.util.LinkedList;
import java.util.List;

public class Uber {

    private List<Motorista> motoristas = new LinkedList<Motorista>();
    private List<Passageiro> passageiros = new LinkedList<Passageiro>();
    private List<Corrida> corridas = new LinkedList<Corrida>();

    public void adicionaMotorista(String nome, String modelo, int telefone) {
        Motorista m = new Motorista(nome, telefone, modelo);
        motoristas.add(m);
    }

    public void adicionaPassageiro(String nome, int telefone) {
        Passageiro p = new Passageiro(nome, telefone);
        passageiros.add(p);
    }

    public double solicitarCorrida(int telefone, String origem, String destino) {
        Motorista motDaCorrida = null;
        Passageiro passDaCorrida = achaPassageiro(telefone);

        for (Motorista umMotorista : motoristas) {
            if (umMotorista.isDisponivel()) {
                motDaCorrida = umMotorista;
                motDaCorrida.indisponibilizar();
                break;
            }
        }
        Corrida c = new Corrida(passDaCorrida, motDaCorrida, origem, destino);
        corridas.add(c);
        return c.getValor();
    }

    private Passageiro achaPassageiro(int telefone) {
        Passageiro passDaCorrida = null;
        for (Passageiro umPassageiro : passageiros) {
            if (umPassageiro.getTelefone() == telefone) {
                passDaCorrida = umPassageiro;
                break;
            }
        }
        return passDaCorrida;
    }
}
