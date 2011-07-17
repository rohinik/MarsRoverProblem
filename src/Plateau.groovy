public class Plateau {
    private int lowerLeftX = 0
    private lowerLeftY = 0
    private int upperRightX
    private int upperRightY

    def decreasePositionOfRoverOnPlateau(int position) {
        if (position - 1 < lowerLeftX) {
            throw new RoversException("Out of Rover...")
        }
        --position
    }

    def increasePositionOfRoverOnPlateu(int position) {
        if (position + 1 > upperRightX) {
            throw new RoversException("Out of Rover...")
        }
        ++position
    }
}