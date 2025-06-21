public class FinalizeCase4 {
    static int count = 0;
    public static void main(String[] args) {
        
        for(int i=1; i<100000000 ; i++){
            FinalizeCase4 fc = new FinalizeCase4();
            fc=null;
        }
    }

    public void finalize(){
        System.out.println("Finalize called "+ ++count);
    }
    
}

// How to check if JVM is running GC or not!


/*
 * Output - 
 * 
 * .
 * .
 * .
 * Finalize called 92379
Finalize called 92380
Finalize called 92381
Finalize called 92382
Finalize called 92383
Finalize called 92384
Finalize called 92385
Finalize called 92386
Finalize called 92387
.
.
.

 */
