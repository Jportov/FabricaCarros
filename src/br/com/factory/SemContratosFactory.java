package br.com.factory;


public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Tesla(100, "Gas", "Blue");
        } else {
            return null;
        }
    }
}