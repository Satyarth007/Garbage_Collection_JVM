public class FinalizeCase2{
	
	public static void main(String[] args){

		FinalizeCase2 fc2 = new FinalizeCase2();
        // As we have created the object of this class then finalize() of this class will only be called.

        fc2.finalize();
        fc2.finalize();
        fc2=null;
        System.gc();
		System.out.println("End of Main....");
	}

	public void finalize(){
		System.out.println("Finalize called");
	}
}


// output - 
/*
Finalize called
Finalize called
End of Main....
Finalize called 
*/