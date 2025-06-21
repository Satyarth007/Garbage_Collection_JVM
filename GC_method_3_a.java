public class GC_method_3_a {
    
    public static void main(String[] args) {
        m1();
    }

    public static void m1(){
        GC_method_3_a s1 = new GC_method_3_a();
        GC_method_3_a s2 = new GC_method_3_a();
    }
}

// here once m1() finishes, two objects are eligible for GC as there is not memory refrence.
