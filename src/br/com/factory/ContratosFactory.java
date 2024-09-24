package br.com.factory;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Toyota(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}