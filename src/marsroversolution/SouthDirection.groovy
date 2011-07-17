package marsroversolution

import java.awt.Point

public class SouthDirection extends RoverDirection {
    def Point forwardPosition = new Point(0, -1)

    @Override
    getDirectionOfRover() {
        'S'
    }

    @Override
    getLeftDirectionOfRover() {
        'E'
    }

    @Override
    getRightDirectionOfRover() {
        'W'
    }

    @Override
    getForwardPositionOfRover() {
        forwardPosition
    }
}
