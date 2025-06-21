public class GC_method_3_d {

    static GC_method_3_d s;

    // Excpetion 3: one objects eligible for GC

    public static void main(String[] args) {
        m1(); 
    }

    public static void m1() {
        GC_method_3_d s1 = new GC_method_3_d();

        s = new GC_method_3_d(); // there is no impact of methdd calling as its an static variable
        
    }

}
