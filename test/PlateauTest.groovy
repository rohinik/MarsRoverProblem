import spock.lang.Specification
class PlateauTest extends Specification{
    Plateau plateau

    def "should create instance of Plateau"(){
        when:
        plateau= new Plateau(upperRightX: 5,upperRightY: 5)


        then:
        plateau!=null
    }
    def "should increase the position of rover on plateau"(){
        when:
        plateau=new Plateau(upperRightX: 5,upperRightY: 5)
        then:
        plateau.increasePositionOfRoverOnPlateu(3)==4

    }
    def "should decrease the position of rover on plateau"(){
        when:
        plateau=new Plateau(upperRightX: 5,upperRightY: 5)
        then:
        plateau.decreasePositionOfRoverOnPlateau(3)==2

    }
}
