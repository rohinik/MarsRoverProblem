package marsroversolution

import java.awt.Point

public class EastDirection extends RoverDirection {
    def Point forwardPosition = new Point(1, 0)

    @Override
    getLeftDirectionOfRover() {
        'N'
    }

    @Override
    getRightDirectionOfRover() {
        'S'
    }

    @Override
    getForwardPositionOfRover() {
        forwardPosition
    }

    @Override
    getDirectionOfRover() {
        'E'
    }
}
