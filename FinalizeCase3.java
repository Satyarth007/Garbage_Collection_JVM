public class FinalizeCase3 {
    static FinalizeCase3 s;
    public static void main(String[] args) throws InterruptedException {

        FinalizeCase3 fc = new FinalizeCase3();
        System.out.println(fc.hashCode());
        fc = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of Main Method...");        
    }

    public void finalize(){
        System.out.println("Finalize method called...");
        s = this;
    }
}

// Note: Even if the same obj is eligible for GC multiple times, GC runs finalize() only once for every object. It is not going to call finalize multiple times.

/* 
 * Output:- 
925858445
Finalize method called...
925858445
End of Main Method...

 */
