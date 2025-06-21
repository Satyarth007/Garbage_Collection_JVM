public class FinalizeCase1 {
    
    public static void main(String[] args) {
        String s = new String("Satyarth");
        s = null;
        System.gc();
        System.out.println("End of main method....");
    }

    public void finalize(){
        System.out.println("Finalize method called.....");
    }
}

// Here we are getting following output because we are making String class object for GC and not our current class object, So by default String class ineherits the finalize method of Object class and not the current class.

/*
 * Output- 
 *  End of main method....
 */
