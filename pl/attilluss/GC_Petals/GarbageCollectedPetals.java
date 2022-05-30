package pl.attilluss.GC_Petals;
import pl.attilluss.Petals.IrisPetals;

import java.lang.ref.WeakReference;

public class GarbageCollectedPetals {
    public static void main(String[] args) {
      new GarbageCollectedPetals();
      System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collector called.");
    }


}
