import spock.lang.Specification
import marsroversolution.ProcessInput
import marsroversolution.Rover

class ProcessInputTest extends Specification {

    def "should create rover for given input"() {
        when:
        Rover rover = ProcessInput.setTheRover("1 2 N")
        then:
         rover.getPosition().x.intValue()==1
        rover.getPosition().y.intValue()==2
    }
}
