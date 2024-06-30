public class GenericsType<T> {
    private T variavel1;
    private int variavel2;

    public T getVariavel1(){
        return variavel1;
    }
    public void setVariavel1(T variavel1){
        this.variavel1 = variavel1;
    }

    public int getVariavel2() {
        return variavel2;
    }

    public void setVariavel2(int variavel2) {
        this.variavel2 = variavel2;
    }
}
