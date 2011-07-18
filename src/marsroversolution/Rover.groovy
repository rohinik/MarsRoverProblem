package marsroversolution

import java.awt.Point
import util.MarsRoverConstants
import util.RoversException

public class Rover {
    Point position;
    RoverDirection roverDirection

    public String moveTheRoverOnPlateau(String moveString) {
        moveString = moveString.toUpperCase()
        for (int index = 0; index < moveString.length(); index++) {
            char movingSide = moveString.charAt(index)
            move(movingSide);
        }
        (position.x.intValue() + " " + position.y.intValue() + " " + roverDirection.getDirectionOfRover())
    }

    void move(char movingSide) {
        if (movingSide == 'L')
            roverDirection = MarsRoverConstants.DIRECTION_INSTANCE_LIST.get(roverDirection.getLeftDirectionOfRover());
        else if (movingSide == 'R')
            roverDirection = MarsRoverConstants.DIRECTION_INSTANCE_LIST.get(roverDirection.getRightDirectionOfRover());
        else if (movingSide == 'M') {
            Point translatePosition = roverDirection.getForwardPositionOfRover()
            position.translate(translatePosition.x.toInteger(), translatePosition.y.toInteger())
            def posX = position.x.intValue()
            def posY = position.y.intValue()
            if (posX < 0 || posX > Plateau.upperRightX || posY < 0 || posY > Plateau.upperRightY)
                throw new RoversException("Out of Rover...")
        }
    }
}