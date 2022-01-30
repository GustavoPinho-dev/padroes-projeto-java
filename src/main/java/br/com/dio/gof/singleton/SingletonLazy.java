package br.com.dio.gof.singleton;

/**
 * O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma
 * e que forneça um ponto global de acesso a ela.
 * */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    // A instância é feita e retornada a partir de um método
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
