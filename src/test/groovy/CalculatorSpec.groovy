import com.kata.Calculator
import spock.lang.Specification

class CalculatorSpec extends Specification {


    def "API to test calculator ADD method"(){

        given : "A String containing comma separated numbers"
                Calculator calculator = new Calculator()
        when  : "Add method of calculator class is called"
                int sum = calculator.Add(numbers)
        then  : "It will return their sum"
                sum == result
        where :

              numbers       ||  result
                "1,2"       ||   3
                ""          ||   0
                "5,7"       ||   12
                "11,5,7"    ||   23
    }

}
