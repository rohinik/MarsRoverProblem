import spock.lang.Specification
class RoverTest extends Specification{
    def "Should move the rover by given position"(){
        when:
        Rover rover=ProcessInput.setTheRover("1 2 N")
        rover.move("LMLMLMLMM")
        then:
        rover.getPosX()==1
        rover.getPosY()==3
        rover.getDirection()==1

    }
}
