public class GC_method_3_b {
    
    // Exception case 1: Only 1 object eligible for GC at the end

    public static void main(String[] args) {
        
        GC_method_3_b s = m1();
    }

    public static GC_method_3_b m1(){

        GC_method_3_b s1 = new GC_method_3_b();
        GC_method_3_b s2 = new GC_method_3_b(); // eligible for GC

        return s1;

    }
}
