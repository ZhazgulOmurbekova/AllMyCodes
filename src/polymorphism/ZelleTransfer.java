package polymorphism;

public class ZelleTransfer implements MobilVerifiable {

    @Override
    public boolean verify() {
        System.out.println("Zelle is  verifying ");
        return true;
    }
}
