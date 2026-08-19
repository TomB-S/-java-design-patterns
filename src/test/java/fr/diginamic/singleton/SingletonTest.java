package fr.diginamic.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {
    /**
     * Vérifie que 2 appels à getInstance() retournent la meme valeur.
     */
    @Test
    public void testSingleton() {
        ConfigurationSingleton testSingleton = ConfigurationSingleton.getInstance();
        ConfigurationSingleton testSingleton2 = ConfigurationSingleton.getInstance();
        assertSame(testSingleton, testSingleton2);
    }

    /**
     * Vérifie que getString() retourne la valeur assosicée à la clé
     */
    @Test
    public void testGetString() {
        String valeur = ConfigurationSingleton.getInstance().getString("db.url");
        assertEquals("jdbc:mysql://localhost:3306/mabase", valeur);

    }


}
