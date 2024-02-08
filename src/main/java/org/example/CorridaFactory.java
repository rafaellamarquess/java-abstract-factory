package org.example;

public class CorridaFactory implements ExercicioFactory {
    @Override
    public ExercicioDeResistencia criarExercicioDeResistencia() {
        return new CorridaDeResistencia();
    }

    @Override
    public ExercicioDeVelocidade criarExercicioDeVelocidade() {
        return new CorridaDeVelocidade();
    }
}
