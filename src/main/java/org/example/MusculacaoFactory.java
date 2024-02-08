package org.example;

public class MusculacaoFactory implements ExercicioFactory {
    @Override
    public ExercicioDeResistencia criarExercicioDeResistencia() {
        return new MusculacaoDeResistencia();
    }

    @Override
    public ExercicioDeVelocidade criarExercicioDeVelocidade() {
        return new MusculacaoDeVelocidade();
    }
}