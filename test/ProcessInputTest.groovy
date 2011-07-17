
import spock.lang.Specification
class ProcessInputTest extends Specification{

    def "should create rover for given input"(){
        when:
        Rover rover=ProcessInput.setTheRover("1 2 N")
        then:
        rover.getPosX()==1
        rover.getPosY()==2
    }
}
