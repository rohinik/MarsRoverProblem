import spock.lang.Specification
import marsroversolution.ProcessInput
import marsroversolution.Rover

class RoverTest extends Specification {
    def "Should move the rover by given position input 1"() {
        when:
        Rover rover = ProcessInput.setTheRover("1 2 N")
        rover.moveTheRoverOnPlateau("LMLMLMLMM")

        then:
        rover.getPosition().x.intValue()==1
        rover.getPosition().y.intValue()==3

    }

    def "Should move the rover by given position input 2"() {
        when:
        Rover rover = ProcessInput.setTheRover("3 3 E")
        rover.moveTheRoverOnPlateau("MMRMMRMRRM")

        then:
        rover.getPosition().x.intValue()==5
        rover.getPosition().y.intValue()==1

    }
}
