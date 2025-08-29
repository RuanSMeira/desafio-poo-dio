package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class DesafioCodigo extends Conteudo {
    private String nivelDificuldade;
    private String user;

    public List<String> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<String> questoes) {
        this.questoes = questoes;
    }

    private List<String> questoes = new ArrayList<>();

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public double calcularXp() {
        return 40;
    }

    public void addQuestao(String questao) {
        questoes.add(questao);
    }

    public int desafiosRestantes() {
        return questoes.size();
    }

    public void fazerDesafio(String questao) {
        if (questoes.contains(questao)) {
            questoes.remove(questao);
            System.out.println("Você concluiu: " + questao);
        } else {
            System.out.println("Questão não encontrada ou já concluída!");
        }
    }

    @Override
    public String toString() {
        return "Desafio {" +
                "questões='" + getQuestoes() + '\'' +
                ", nivelDificuldade='" + nivelDificuldade + '\'' +
                ", questoesRestantes=" + desafiosRestantes() + ", Usuário=" + user +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
