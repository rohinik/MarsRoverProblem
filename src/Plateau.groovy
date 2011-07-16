public class Plateau
{
    private static Plateau plateau = null;

        private int upperRightX;
        private int upperRightY;

    private Plateau(String coords)
    {
        populateInput(coords);
    }

    private void populateInput(String coords)
    {
        String [] upperArrayCoords = coords.split(" ");
        if(upperArrayCoords.size()!=2){
            throw new RoversException("Invalid input, please provide input as \"x_axis y_axis\"");
        }
        upperRightX = Integer.valueOf(upperArrayCoords[0]).intValue();
        upperRightY = Integer.valueOf(upperArrayCoords[1]).intValue();
    }

    public static Plateau getInstance(String coords)
    {

        	if(plateau == null)
                plateau = new Plateau("5 5");

            plateau;
    }


    public int getUpperRightX()
    {
        return upperRightX;
    }

    public int getUpperRightY()
    {
        return upperRightY;
    }


}