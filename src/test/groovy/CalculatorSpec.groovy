import spock.lang.Specification

class CalculatorSpec extends Specification {


    def "API to test calculator ADD method"(){

        given : "A String containing comma separated numbers"
                Calculator calculator = new Calculator()
        when  : "Add method of calculator class is called"

        then  : "It will return their sum"

    }

}
