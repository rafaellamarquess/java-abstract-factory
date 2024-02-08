package org.example;

public class Main {
    public static void main(String[] args) {
        //fabrica para corrida
        ExercicioFactory corridaFactory = new CorridaFactory();

        //exercícios de resistência e velocidade para corrida
        ExercicioDeResistencia corridaResistencia = corridaFactory.criarExercicioDeResistencia();
        ExercicioDeVelocidade corridaVelocidade = corridaFactory.criarExercicioDeVelocidade();
        corridaResistencia.realizar();
        corridaVelocidade.realizar();

        // exercícios de musculação
        ExercicioFactory musculacaoFactory = new MusculacaoFactory();
        ExercicioDeResistencia musculacaoResistencia = musculacaoFactory.criarExercicioDeResistencia();
        ExercicioDeVelocidade musculacaoVelocidade = musculacaoFactory.criarExercicioDeVelocidade();
        musculacaoResistencia.realizar();
        musculacaoVelocidade.realizar();
    }
}

