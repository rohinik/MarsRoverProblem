public class Nasa {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        String answer = "Y"
        while ("Y".equalsIgnoreCase(answer)) {
            println("Enter Rover's current position (e.g. 1 2 N x_axis, y_axis, face_direction)")
            String roverInputs = br.readLine()
            Rover rover = ProcessInput.setTheRover(roverInputs.toUpperCase())
            println("Enter movments:")
            String currentPos = rover.move(br.readLine().toUpperCase())
            println(currentPos)
            println("=================================")
            println()
            println("Do u want to change another Rover position (Y/N)")
            answer = br.readLine()
        }
    }
}