public class Rover {

    int posX;
    int posY;
    int direction
    Plateau plateau = new Plateau(upperRightX: 5, upperRightY: 5)

    public String move(String moversString) {
        moversString = moversString.toUpperCase()
        for (int index = 0; index < moversString.length(); index++) {
            char c = moversString.charAt(index)
            move(c);
        }
        (posX + " " + posY + " " + MarsRoverConstants.DIRECTION_INT_TO_STRING.get(Integer.valueOf(direction)))
    }

    void move(char c) {
        switch (c) {
            case 'L':
            case 'R':
                changeDirectionOfRover(c)
                break;
            case 'M':
                moveTheRoverForwardDirection()
        }
    }

    void moveTheRoverForwardDirection() {
        switch (direction) {
            case 1:
                posY = plateau.increasePositionOfRoverOnPlateu(posY)
                break
            case 2:
                posX = plateau.increasePositionOfRoverOnPlateu(posX)
                break
            case 3:
                posY = plateau.decreasePositionOfRoverOnPlateau(posY)
                break
            case 4:
                posX = plateau.decreasePositionOfRoverOnPlateau(posX)
        }
    }
    private void changeDirectionOfRover(char c) {
        if (c == 'L')
            direction--
        if (c == 'R')
            direction++
        if (direction == 0)
            direction = 4
        if (direction == 5)
            direction = 1
    }
}