package br.com.dio.gof.singleton;

public class SingletonEager {

    // A instância é feita já na atribuição da váriavel de instância
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
