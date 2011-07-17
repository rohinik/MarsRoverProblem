package marsroversolution

import java.awt.Point

class NorthDirection extends RoverDirection {
    def Point forwardPosition = new Point(0, 1)

    @Override
    getLeftDirectionOfRover() {
        'W'
    }

    @Override
    getRightDirectionOfRover() {
        'E'
    }

    @Override
    getForwardPositionOfRover() {
        forwardPosition
    }

    @Override
    getDirectionOfRover() {
        return 'N'
    }
}
