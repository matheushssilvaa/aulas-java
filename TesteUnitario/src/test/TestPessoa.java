package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import application.Pessoa;

class TestPessoa {
	
	// teste unitário
	
	@Test
	void testNome() {
		Pessoa p = new Pessoa();
		
		try {
		  p.setNome("Matheus Silva");
		} catch (Exception ex) {}
		
		String expected = "Matheus Silva";
		assertEquals(expected, p.getNome());
	}
	
	@Test
	void testRg() {
		Pessoa p = new Pessoa();
		p.setrg("55129170-9");
		assertEquals("55129170-9", p.getrg());
	}
	
	@Test
	void testCpf() {
		Pessoa p = new Pessoa();
		
		try {
			p.setCpf("44513622881");
		} catch (Exception e) {}
		
		assertEquals("44513622881", p.getcpf());
	}
	
	@Test
	void setNomeSobrenome() {
		Pessoa p = new Pessoa();
		
		try {
			p.setNome("Matheus S Silva");
		} catch (Exception ex) {}
		
		String expected = "Matheus S Silva";
		assertEquals(expected, p.getNome());
		
		assertThrows(Exception.class, () -> p.setNome("Matheus"));
	}
	
	@Test
	void testConstrutor() throws Exception {
		Pessoa p = new Pessoa("Matheus Silva", "445.136.228-81");
		assertEquals("Matheus Silva", p.getNome());
		assertEquals("445.136.228-81", p.getcpf());
		
		assertThrows(Exception.class, () -> new Pessoa("Matheus Silva", "44513622881"));
	}
	

}
