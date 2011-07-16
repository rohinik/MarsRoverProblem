
class ProcessInput {
     static setTheRover(String inputs)
    {
        int posX;
            int posY;
            private int direction;

        String [] inputArray = inputs.split(" ");
        print inputArray
        if(inputArray.size() != 3)
            throw new RoversException("Invalid input, please provide input as \"x_axis y_axis face (N,S,E,W)\"");
        posX = Integer.valueOf(inputArray[0]).intValue();
        posY = Integer.valueOf(inputArray[1]).intValue();
        if(!MarsRoverConstants.DIRECTION_STRING_TO_INT.containsKey(inputArray[2].toUpperCase()))
        {
            throw new RoversException("Wrong direction (N,S,E,W)\"");
        } else
        {
            direction = ((Integer)MarsRoverConstants.DIRECTION_STRING_TO_INT.get(inputArray[2].toUpperCase())).intValue();

        }
        Rover rover= new Rover(posX:posX,posY:posY,direction:direction)
        rover
    }
}
