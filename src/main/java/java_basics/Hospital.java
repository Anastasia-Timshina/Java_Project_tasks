package java_basics;

public class Hospital {
    public static void main(String[] args) {
        Doctor generalSurgeon = new Surgeon();
        generalSurgeon.diagnose();
        generalSurgeon.treat();

        System.out.println();

        Doctor brainSurgeon = new Neurosurgeon();
        brainSurgeon.diagnose();
        brainSurgeon.treat();

        System.out.println();

        Surgeon specificSurgeon = new Surgeon();
        specificSurgeon.performSurgery();

        Neurosurgeon specificNeurosurgeon = new Neurosurgeon();
        specificNeurosurgeon.performBrainSurgery();
    }
}
