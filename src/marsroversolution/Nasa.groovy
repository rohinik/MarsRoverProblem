package marsroversolution
public class Nasa {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        String answer = "Y"
        while ("Y".equalsIgnoreCase(answer)) {
            println("Enter Rover's current position: x_axis, y_axis, direction")
            String roverInputs = br.readLine()
            Rover rover = ProcessInput.setTheRover(roverInputs.toUpperCase())
            println("Enter movments:")
            String currentPositionOfRover = rover.moveTheRoverOnPlateau(br.readLine().toUpperCase())
            println(currentPositionOfRover)
            println("Do u want to change another Rover position (Y/N)")
            answer = br.readLine()
        }
    }
}