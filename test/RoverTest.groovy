import spock.lang.Specification
class RoverTest extends Specification{
    def "Should move the rover by given position input 1"(){
        when:
        Rover rover=ProcessInput.setTheRover("1 2 N")
        rover.move("LMLMLMLMM")
        then:
        rover.getPosX()==1
        rover.getPosY()==3
        rover.getDirection()==1

    }
    def "Should move the rover by given position input 2"(){
        when:
        Rover rover=ProcessInput.setTheRover("3 3 E")
        rover.move("MMRMMRMRRM")
        then:
        rover.getPosX()==5
        rover.getPosY()==1
        rover.getDirection()==2

    }

}
