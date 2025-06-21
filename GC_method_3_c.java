public class GC_method_3_c {

    // Excpetion 2: Two objects eligible for GC

    public static void main(String[] args) {
        m1(); // not saving refrence
    }

    public static GC_method_3_c m1() {
        GC_method_3_c s1 = new GC_method_3_c();
        GC_method_3_c s2 = new GC_method_3_c(); 

        return s1;
    }

}
