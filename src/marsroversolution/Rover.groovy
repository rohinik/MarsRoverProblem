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
            char c = moveString.charAt(index)
            move(c);
        }
        (position.x.intValue() + " " + position.y.intValue() + " " + roverDirection.getDirectionOfRover())
    }

    void move(char c) {
        if (c == 'L')
            roverDirection = MarsRoverConstants.DIRECTION_INSTANCE_LIST.get(roverDirection.getLeftDirectionOfRover());
        else if (c == 'R')
            roverDirection = MarsRoverConstants.DIRECTION_INSTANCE_LIST.get(roverDirection.getRightDirectionOfRover());
        else if (c == 'M') {
            Point translatePosition = roverDirection.getForwardPositionOfRover()
            position.translate(translatePosition.x.toInteger(), translatePosition.y.toInteger())
            def posX = position.x.intValue()
            def posY = position.y.intValue()
            if (posX < 0 || posX > Plateau.upperRightX || posY < 0 || posY > Plateau.upperRightY)
                throw new RoversException("Out of Rover...")
        }
    }
}