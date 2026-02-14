package br.com.audioplace.principal;

import br.com.audioplace.modelos.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== BEM-VINDO AO AUDIOPLACE ===\n");

        // ========== CRIANDO MÚSICAS ==========

        Musica musica1 = new Musica();
        musica1.setTitulo("Bohemian Rhapsody");
        musica1.setArtista("Queen");
        musica1.setAlbum("A Night at the Opera");
        musica1.setGenero("Rock");

        Musica musica2 = new Musica();
        musica2.setTitulo("Shape of You");
        musica2.setArtista("Ed Sheeran");
        musica2.setAlbum("÷ (Divide)");
        musica2.setGenero("Pop");

        Musica musica3 = new Musica();
        musica3.setTitulo("Garota de Ipanema");
        musica3.setArtista("Tom Jobim");
        musica3.setAlbum("Getz/Gilberto");
        musica3.setGenero("Bossa Nova");

        Musica musica4 = new Musica();
        musica4.setTitulo("Lose Yourself");
        musica4.setArtista("Eminem");
        musica4.setAlbum("8 Mile Soundtrack");
        musica4.setGenero("Rap");

        // ========== CRIANDO PODCASTS ==========

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Flow Podcast");
        podcast1.setHost("Igor");
        podcast1.setDescricao("Entrevistas descontraídas com personalidades");

        Podcast podcast2 = new Podcast();
        podcast2.setTitulo("NerdCast");
        podcast2.setHost("Jovem Nerd");
        podcast2.setDescricao("Cultura pop, ciência e tecnologia");

        Podcast podcast3 = new Podcast();
        podcast3.setTitulo("Mamilos");
        podcast3.setHost("Cris Bartis");
        podcast3.setDescricao("Discussões profundas sobre temas polêmicos");

        // ========== SIMULANDO INTERAÇÕES ==========

        System.out.println("--- SIMULANDO REPRODUÇÕES E CURTIDAS ---\n");

        // Música 1: Muito reproduzida e muito curtida
        for (int i = 0; i < 100; i++) musica1.reproduz();
        for (int i = 0; i < 90; i++) musica1.curte();

        // Música 2: Média
        for (int i = 0; i < 50; i++) musica2.reproduz();
        for (int i = 0; i < 30; i++) musica2.curte();

        // Música 3: Pouco reproduzida, mas bem curtida
        for (int i = 0; i < 10; i++) musica3.reproduz();
        for (int i = 0; i < 8; i++) musica3.curte();

        // Música 4: Sem curtidas
        for (int i = 0; i < 20; i++) musica4.reproduz();
        // Não curtiu nenhuma vez

        // Podcast 1: Sucesso!
        for (int i = 0; i < 200; i++) podcast1.reproduz();
        for (int i = 0; i < 150; i++) podcast1.curte();

        // Podcast 2: Médio
        for (int i = 0; i < 80; i++) podcast2.reproduz();
        for (int i = 0; i < 40; i++) podcast2.curte();

        // Podcast 3: Poucas reproduções
        for (int i = 0; i < 15; i++) podcast3.reproduz();
        for (int i = 0; i < 5; i++) podcast3.curte();

        // ========== EXIBINDO INFORMAÇÕES ==========

        System.out.println("=== INFORMAÇÕES DOS ÁUDIOS ===\n");

        exibirInfoMusica(musica1);
        exibirInfoMusica(musica2);
        exibirInfoMusica(musica3);
        exibirInfoMusica(musica4);

        exibirInfoPodcast(podcast1);
        exibirInfoPodcast(podcast2);
        exibirInfoPodcast(podcast3);

        // ========== TESTANDO POLIMORFISMO COM PREFERIDAS ==========

        System.out.println("\n=== MINHAS PREFERIDAS (TESTANDO POLIMORFISMO) ===\n");

        Preferidas preferidas = new Preferidas();

        // Passando diferentes tipos de Audio para o mesmo método
        System.out.println("Analisando músicas:");
        preferidas.inclui(musica1);
        preferidas.inclui(musica2);
        preferidas.inclui(musica3);
        preferidas.inclui(musica4);

        System.out.println("\nAnalisando podcasts:");
        preferidas.inclui(podcast1);
        preferidas.inclui(podcast2);
        preferidas.inclui(podcast3);

        // ========== COMPARANDO CLASSIFICAÇÕES ==========

        System.out.println("\n=== COMPARANDO CLASSIFICAÇÕES (COM OVERRIDE) ===\n");

        System.out.println("MÚSICAS:");
        System.out.println(musica1.getTitulo() + " - Classificação: " +
                String.format("%.2f", musica1.getClassificacao()));
        System.out.println(musica2.getTitulo() + " - Classificação: " +
                String.format("%.2f", musica2.getClassificacao()));
        System.out.println(musica3.getTitulo() + " - Classificação: " +
                String.format("%.2f", musica3.getClassificacao()));
        System.out.println(musica4.getTitulo() + " - Classificação: " +
                String.format("%.2f", musica4.getClassificacao()));

        System.out.println("\nPODCASTS:");
        System.out.println(podcast1.getTitulo() + " - Classificação: " +
                String.format("%.2f", podcast1.getClassificacao()));
        System.out.println(podcast2.getTitulo() + " - Classificação: " +
                String.format("%.2f", podcast2.getClassificacao()));
        System.out.println(podcast3.getTitulo() + " - Classificação: " +
                String.format("%.2f", podcast3.getClassificacao()));
    }

    // Método auxiliar para exibir informações da música
    public static void exibirInfoMusica(Musica musica) {
        System.out.println("🎵 MÚSICA: " + musica.getTitulo());
        System.out.println("   Artista: " + musica.getArtista());
        System.out.println("   Álbum: " + musica.getAlbum());
        System.out.println("   Gênero: " + musica.getGenero());
        System.out.println("   Reproduções: " + musica.getTotalReproducoes());
        System.out.println("   Curtidas: " + musica.getTotalCurtidas());
        System.out.println("   Classificação: " + String.format("%.2f", musica.getClassificacao()));
        System.out.println();
    }

    // Método auxiliar para exibir informações do podcast
    public static void exibirInfoPodcast(Podcast podcast) {
        System.out.println("🎙️ PODCAST: " + podcast.getTitulo());
        System.out.println("   Host: " + podcast.getHost());
        System.out.println("   Descrição: " + podcast.getDescricao());
        System.out.println("   Reproduções: " + podcast.getTotalReproducoes());
        System.out.println("   Curtidas: " + podcast.getTotalCurtidas());
        System.out.println("   Classificação: " + String.format("%.2f", podcast.getClassificacao()));
        System.out.println();
    }
}