package java_basics;

class Surgeon implements Doctor {
    @Override
    public void diagnose() {
        System.out.println("The surgeon makes a diagnosis.");
    }

    @Override
    public void treat() {
        System.out.println("The surgeon is treating.");
    }

    public void performSurgery() {
        System.out.println("The surgeon performs the operation.");
    }
}