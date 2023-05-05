import java.net.SocketPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Physics physics = new Physics();
        physics.getGravity();

        Scanner input = new Scanner(System.in);

        double Mass;
        double Velocity;

        System.out.println("KineticEnergy");
        System.out.println("Input-Mass");
        Mass = input.nextDouble();

        System.out.println("Input-Velocity");
        System.out.println("kineticEnergy");
        Velocity = input.nextDouble();

        input.close();
        System.out.println(Energy.KineticEnergy(Mass, Velocity));
        
        //             .....POTENTIAL ENERGY.....
            System.out.println("\t \t .....POTENTIAL ENERGY.....");
            System.out.println("Input Mass");
            Mass = input.nextDouble();

            System.out.println("Input Height");
            Height = input.nextDouble();
            System.out.println("Potential Energy: ");


            System.out.println(Energy.PotentialEnergy(Mass, 10, Height));


        }
    }
}
