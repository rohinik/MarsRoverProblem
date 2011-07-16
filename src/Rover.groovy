public class Rover {

    int posX;
    int posY;
    int direction

    public String move(String moversString) {
        moversString = moversString.toUpperCase()
        for (int index = 0; index < moversString.length(); index++) {
            char c = moversString.charAt(index)
            move(c);
        }
        (posX + " " + posY + " " +MarsRoverConstants.DIRECTION_INT_TO_STRING.get(Integer.valueOf(direction)))
    }

    void move(char c) {
        switch (c) {
            case 'L':
            case 'R':
                changeDirection(c)
                break;

            case 'M':
                move()
                break;
        }
    }

    void move() {
        if (direction == 1)
            increaseYPosition()
        else if (direction == 2)
            increaseXPosition()
        else if (direction == 3)
            decreaseYPosition()
        else
            decreaseXPosition()
    }

    private def decreaseXPosition() {
        if (posX - 1 < 0) {
            throw new RoversException("Out of Rover...")
        }
        posX--
    }

    private def decreaseYPosition() {
        if (posY - 1 < 0) {
            throw new RoversException("Out of Rover...")
        }
        posY--
    }

    private def increaseXPosition() {
        if (posX + 1 > Plateau.getInstance("").getUpperRightX()) {
            throw new RoversException("Out of Rover...")
        }
        posX++
    }

    private def increaseYPosition() {
        if (posY + 1 > Plateau.getInstance("").getUpperRightY()) {
            throw new RoversException("Out of Rover...")
        }
        posY++
    }

    private void changeDirection(char c) {
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