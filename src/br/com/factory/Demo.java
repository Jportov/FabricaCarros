package br.com.factory;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // Criando um cliente que faz um pedido
        Customer cliente = new Customer("A", false);
        
        // Obtendo a fábrica adequada (com ou sem contrato)
        Factory factory = getFactory(cliente);
        
        // Lista de carros criada a partir da fábrica
        List<Car> carros = new ArrayList<>();

        // Adicionando diferentes carros à lista
        carros.add(factory.create("A"));
        carros.add(factory.create("B"));  // Outra grade pode ser adicionada aqui
        carros.add(new Tesla(150, "Elétrico", "Vermelho"));
        carros.add(new Ford(300, "Branco", "Diesel"));
        carros.add(new Honda(200, "Roxo", "Gas"));
        carros.add(new Chevrolet(100, "Branco", "GNV"));
        carros.add(new Toyota(80, "Cinza", "Gas"));        // Adicionando manualmente

        // Iterando sobre a lista de carros e iniciando o motor de cada um
        for (Car car : carros) {
            if (car != null) {
                car.startEngine();
            }
        }
    }

    // Método que retorna a fábrica baseada na existência de contrato
    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratosFactory();
        } else {
            return new SemContratosFactory();
        }
    }
}
