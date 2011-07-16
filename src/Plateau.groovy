class Plateau {
    int upperRightX
    int upperRightY
    private static Plateau plateau = null

    def setThePlateauCoordinates(String coordinates) {
        String[] upperArrayCoordinates = coordinates.split(" ")
        if (upperArrayCoordinates.size() != 2) {
            throw new RoversException("Invalid input, please provide input as \"x_axis y_axis\"")
        }
        upperRightX = Integer.valueOf(upperArrayCoordinates[0]).intValue()
        upperRightY = Integer.valueOf(upperArrayCoordinates[1]).intValue()
    }

    public static Plateau getInstance(String coordinates) {
        if (plateau == null)
            plateau = new Plateau(coordinates)

        plateau
    }

    public int getUpperRightX() {
        upperRightX
    }

    public int getUpperRightY() {
        upperRightY
    }

}
