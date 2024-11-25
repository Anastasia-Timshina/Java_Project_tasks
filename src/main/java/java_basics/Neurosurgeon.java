package java_basics;

class Neurosurgeon extends Surgeon {
    @Override
    public void diagnose() {
        System.out.println("Neurosurgeon performs diagnostics.");
    }

    @Override
    public void treat() {
        System.out.println("Neurosurgeon treats diseases.");
    }

    // Метод, специфичный для нейрохирурга
    public void performBrainSurgery() {
        System.out.println("A neurosurgeon performs brain surgery.");
    }
}
