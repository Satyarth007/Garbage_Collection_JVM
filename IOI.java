public class IOI {

    IOI i;

    public static void main(String[] args) {
        
        IOI i1 = new IOI();
        IOI i2 = new IOI();
        IOI i3 = new IOI();

        i1.i = i2;
        i2.i = i3;
        i3.i = i1;

        // Till this point no object eligible for GC

        i1 = null;

        // Till this point no object eligible for GC

        i2 = null;

        // Till this point no object eligible for GC

        i3 = null;

        // At this point all objects eligible for GC
    }
    
}
