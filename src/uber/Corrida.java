/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

/**
 *
 * @author operador
 */
public class Corrida {
    private Passageiro p;
	private Motorista m;
	private String origem;
	private String destino;
	private double valor;
	
	public Corrida(Passageiro p, Motorista m, String origem, String destino) {
		this.p = p;
		this.m = m;
		this.origem = origem;
		this.destino = destino;
		valor = Math.random();
	}

	public double getValor() {
		return valor;
	}

}