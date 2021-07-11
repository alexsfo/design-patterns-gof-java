package creational.prototype.NotasMusicais.notas;

import creational.prototype.NotasMusicais.Partitura;

public class MinhaApp {

	public static void main(String[] args) {
		//Carregar os diferentes tipos de notas musicais
		Partitura.carregaNotas();

		//Compor a canção
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Mi").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Fa").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Do").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
		Partitura.getNota("Re").desenha();
	}

}
