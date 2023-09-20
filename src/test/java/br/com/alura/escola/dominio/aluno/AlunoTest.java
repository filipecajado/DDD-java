package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlunoTest {


	@Test
	void naoDeveriaPermitirCriarMaisDe2Telefones() {
		Aluno aluno = new Aluno(new CPF( "123.456.789-00"), "", new Email( "sss@ccc.com"));
		String ddd = "11";
		String numero = "123456789";
		aluno.adicionarTelefone(ddd, numero);
		aluno.adicionarTelefone(ddd, numero);
		
		assertThrows(IllegalArgumentException.class,
				() -> aluno.adicionarTelefone(ddd, numero));
		
		assertEquals(aluno.getTelefones().size(), 2);
		
	}
}
