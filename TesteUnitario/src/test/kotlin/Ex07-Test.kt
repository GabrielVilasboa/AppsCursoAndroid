import org.junit.jupiter.api.*

class `Ex07-Test` {

    @Test
    @DisplayName("Teste Portaria")

    fun testPortaria() {

        // Caso falhe um, não executa o próximo teste
        Assertions.assertTrue(portaria(15, "", "") =="Negado.")
        Assertions.assertTrue(portaria(20, "", "") =="Negado.")
        Assertions.assertTrue(portaria(25, "VIP", "") =="Negado.")
        Assertions.assertTrue(portaria(25, "comum", "xt45689") =="Welcome.")
        Assertions.assertTrue(portaria(25, "comum", "45689") =="Negado.")
        Assertions.assertTrue(portaria(25, "premium", "xt45689") =="Negado.")
        Assertions.assertTrue(portaria(25, "premium", "45689") =="Negado.")
        Assertions.assertTrue(portaria(25, "premium", "xl45689") =="Welcome.")
        Assertions.assertTrue(portaria(25, "luxo", "xl45689") =="Welcome.")

        // Executa todos os testes independente de falha ou sucesso
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(15, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(20, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "comum", "xt45689"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "comum", "45689"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "xt45689"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "45689"), "Negado.") },
            { Assertions.assertEquals(portaria(25, "premium", "xl45689"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "luxo", "xl45689"), "Welcome.") }
        )
    }
}
