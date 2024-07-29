package lambda.comGenerics;

public interface MinhaInterfaceFuncional<T> {
    void metodoComGenerics(T tipoT);
}

interface MinhaInterfaceFuncional2<T> {
    T metodoComGenericsComRetorno(T tipoT);
}

interface MinhaInterfaceFuncional3<T, R> {
    R metodoComMaisDeUmGenerics(T tipoT, R tipoR);
}

