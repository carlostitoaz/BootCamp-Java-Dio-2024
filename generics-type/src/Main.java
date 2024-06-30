public class Main {
    public static void main(String[] args) {
        GenericsType<String> gt = new GenericsType<>();
        gt.setVariavel1("teste");
        System.out.println(gt.getVariavel1());

        GenericsType<Integer> gt1 = new GenericsType<>();
        gt1.setVariavel1(3);
        System.out.println(gt1.getVariavel1());
    }
}