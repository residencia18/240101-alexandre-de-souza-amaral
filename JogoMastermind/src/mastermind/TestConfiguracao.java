package mastermind;

import static org.junit.jupiter.api.Assertions.*;	

import org.junit.jupiter.api.Test;

class TestConfiguracao {

	@Test
	void test() {
		
		Configuracao config = new Configuracao();
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());
		
		config.setAlfabeto("ABCDEF");
		assertEquals("ABCDEF", config.getAlfabeto());

	}

}