package br.com.audioplace.modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 4){
            System.out.println(audio.getTitulo()+" é uma das preferidas do público!");
        }else if(audio.getClassificacao() >= 3){
            System.out.println(audio.getTitulo()+" é uma ótima escolha!");
        }else if(audio.getClassificacao() == 0){
            System.out.println(audio.getTitulo()+" não tem classificação");
        }else {
            System.out.println(audio.getTitulo()+" não é dos mais preferidos.");
        }
    }
}
