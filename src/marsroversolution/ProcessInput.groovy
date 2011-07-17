package marsroversolution

import java.awt.Point
import util.MarsRoverConstants
import util.RoversException

class ProcessInput {
    static setTheRover(String roverCoordinates) {
        Point point = new Point()
        private RoverDirection direction;
        String[] roverVariables = roverCoordinates.split(" ");
        if (roverVariables.size() != 3)
            throw new RoversException("Invalid input, please provide input as \"x_axis y_axis face (N,S,E,W)\"");
        point.setLocation(Integer.parseInt(roverVariables[0]), Integer.parseInt(roverVariables[1]))
        if (!MarsRoverConstants.DIRECTION_INSTANCE_LIST.containsKey(roverVariables[2].toUpperCase())) {
            throw new RoversException("Wrong direction (N,S,E,W)\"");
        } else {
            direction = MarsRoverConstants.DIRECTION_INSTANCE_LIST.get(roverVariables[2].toUpperCase())
        }
        new Rover(position: point, direction: direction)
    }
}
