package singleton;

import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.api.Test;


public class LogManagerTest {
	
	public void dada2Instancias_quandoGetInstance_entaoSeraAMesmaReferencia() {
	
		LogManager instancel = LogManager.getInstance();
		assertNotNulL( instancel );
		
		LogManager instance2 = LogManager.getInstance();
		assertNotNulL( instance2 );
		
		assertEquals (instance1, instance2);
		
	}

}
