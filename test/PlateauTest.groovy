import spock.lang.Specification
class PlateauTest extends Specification{
    Plateau plateau

    def "should create instance of Plateau"(){
        when:
        plateau= new Plateau()
        plateau.setThePlateauCoordinates("5 5")

        then:
        plateau.getUpperRightX()==5
        plateau.getUpperRightY()==5
    }

}
