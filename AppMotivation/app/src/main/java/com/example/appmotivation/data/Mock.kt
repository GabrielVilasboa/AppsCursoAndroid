package com.example.appmotivation.data

import com.example.appmotivation.infra.MotivationConstants

data class Phrase(val description: String, val category: Int)

class Mock {

    //type_filter
    private val all = MotivationConstants.FILTER.ALL
    private val happy = MotivationConstants.FILTER.HAPPY
    private val sunny = MotivationConstants.FILTER.SUNNY


    //Lista de frases que aparecerão na tela.
    private val listPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Phrase("Quando está mais escuro, vemos mais estrelas!", happy),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", happy),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", happy),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny)
    )

    //Método que retorna uma fraze aleatória de acordo com o filtro.
    fun getPhrase(filter: Int): String {

        /* Método aprendido em aula:
        * val filtered = listPhrases.filter { it.category == filter || filter == all } //Gera uma lista de frases usando apenas as que estão de acordo com o filtro
        * return filtered(random.nextInt(filtered.size).description)
        */

        var phrase = listPhrases.random()
        while (phrase.category != filter && filter != all) {
            phrase = listPhrases.random()
        }
        return phrase.description
    }
}



