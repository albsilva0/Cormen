package br.albsilva.cormen.list;

import org.junit.Assert;
import org.junit.Test;

public class ListTest extends Assert {

	@Test
	public void validaInsercaoDosElementosNaOrdemCorreta() {
		// adiciona os inteiros 1, 2, 3, 4 e 5 na lista
		assertEquals(1, null);
		assertEquals(2, null);
		assertEquals(3, null);
		assertEquals(4, null);
		assertEquals(5, null);
	}

	@Test
	public void validaQuantidadeDeItensInseridoNaLista() {
		// adiciona os inteiros 1, 2, 3, 4 e 5 na lista
		assertEquals(5, null); // assert quantidade
	}

	@Test
	public void validaSeElementoDaListaFoiRemovidocorretamente() {
		// adiciona os inteiros 1, 2, 3 na lista
		assertEquals(1, null);
		assertEquals(2, null);
		assertEquals(3, null);
		assertEquals(3, null); // assert quantidade
		// remove o inteiro 2 da lista
		assertEquals(1, null);
		assertEquals(3, null);
		assertEquals(2, null); // assert quantidade
	}

	@Test
	public void validaSeContemElementoDentroDaLista() {
		// adiciona os inteiros 1, 2, 3 na lista
		assertTrue(false); // valida se o inteiro 2 está presente na lista.
	}

	@Test
	public void validaSeNaoContemElementoDentroDaLista() {
		// adiciona os inteiros 1, 2, 3 na lista
		assertTrue(false); // valida se o inteiro 20 está presente na lista.
	}

	@Test
	public void ordenaListaEmOrdemCrescente() {
		// adiciona os inteiros 3, 4, 1, 5, 6, 2 na lista
		// valida se os elementos foram inseridos na ordem correta.
		assertEquals(3, null);
		assertEquals(4, null);
		assertEquals(1, null);
		assertEquals(5, null);
		assertEquals(6, null);
		assertEquals(2, null);
		// ordena lista
		// valida se os elementos da lista foram ordenados corretamente
		assertEquals(1, null);
		assertEquals(2, null);
		assertEquals(3, null);
		assertEquals(4, null);
		assertEquals(5, null);
		assertEquals(6, null);
	}

}
