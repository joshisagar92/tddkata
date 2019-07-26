import com.kata.Calculator
import spock.lang.Specification
import spock.lang.Unroll

class CalculatorSpec extends Specification {

    @Unroll
    def "API to test calculator addition method"(){

        given : "A String containing comma separated numbers, Calculator object"
                Calculator calculator = new Calculator(numbers)
        when  : "Add method of calculator class is called"
                int sum = calculator.add()
        then  : "It will return their sum based on separator provider"
                sum == result
        where :

              numbers       ||  result
                "1,2"       ||   3
                ""          ||   0
                "5,7"       ||   12
                "11,5,7"    ||   23
                "1\n2,3"    ||   6
                "//;\\n1;2" ||   3
    }

}
