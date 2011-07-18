import marsroversolution.ProcessInput
import marsroversolution.Rover
import spock.lang.Specification
import util.RoversException

class RoverTest extends Specification {
    def "should move the rover by given position input 1"() {
        when:
        Rover rover = ProcessInput.setTheRover("1 2 N")
        rover.moveTheRoverOnPlateau("LMLMLMLMM")

        then:
        rover.getPosition().x.intValue() == 1
        rover.getPosition().y.intValue() == 3

    }

    def "should move the rover by given position input 2"() {
        when:
        Rover rover = ProcessInput.setTheRover("3 3 E")
        rover.moveTheRoverOnPlateau("MMRMMRMRRM")

        then:
        rover.getPosition().x.intValue() == 5
        rover.getPosition().y.intValue() == 1

    }

    def "should move the rover by given position input 3"() {
        when:
        Rover rover = ProcessInput.setTheRover("3 3 E")
        rover.moveTheRoverOnPlateau("MMMMMMMM")
        then:
        def e = thrown(RoversException)
        e.message == "Out of Rover..."
    }
}
