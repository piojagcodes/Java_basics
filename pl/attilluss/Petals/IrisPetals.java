package pl.attilluss.Petals;
public class IrisPetals {

    /**
     * getter,setter,toString method and constructor
     *
     *Below proof that both objects share reference. To check it by yourself just comment toString method
     *
     * pl.attilluss.Petals.IrisPetals@5acf9800
     * pl.attilluss.Petals.IrisPetals@5acf9800
     */


    public int getNumberOfPetals() {
        return NumberOfPetals;
    }
    public void setNumberOfPetals(int numberOfPetals) {
        NumberOfPetals = numberOfPetals;
    }

    public IrisPetals(int numberOfPetals) {
        NumberOfPetals = numberOfPetals;
    }

    /*
    @Override
    public String toString() {
        return "IrisPetals{" +
                "NumberOfPetals=" + NumberOfPetals +
                '}';
    }


     */
    private int NumberOfPetals;


}
