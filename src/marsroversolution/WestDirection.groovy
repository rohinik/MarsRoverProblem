package marsroversolution

import java.awt.Point

public class WestDirection extends RoverDirection {
    private Point forwardPosition = new Point(-1, 0)

    @Override
    getLeftDirectionOfRover() {
        'S'
    }

    @Override
    getRightDirectionOfRover() {
        'N'
    }

    @Override
    getForwardPositionOfRover() {
        forwardPosition
    }

    @Override
    getDirectionOfRover() {
        'W'
    }
}
