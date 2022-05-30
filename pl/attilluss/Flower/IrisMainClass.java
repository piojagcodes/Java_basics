package pl.attilluss.Flower;

import pl.attilluss.Petals.IrisPetals;

public class IrisMainClass {

    public static void main(String[] args) {
        IrisPetals firstFlower = new IrisPetals(12);
        /**
         * Class Iris Petals instantianated to object called first flower with number of petals 12
         */
        IrisPetals lastFlower = firstFlower;
        System.out.println(firstFlower);
        /**
         * Class Iris Petals instantianated to object called last flower with reference to first flower which copied value
         */
        System.out.println(lastFlower);




    }
}
