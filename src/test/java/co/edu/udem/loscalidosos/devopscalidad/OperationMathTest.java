package co.edu.udem.loscalidosos.devopscalidad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OperationMathTest {

    @Test
    void sumTwoNumbers() throws Exception{
        //Arrange
        Long number1 = 250L;
        Long number2 = 100L;
        OperationMath operationMath = new OperationMath();
        Long expected = 350L;
        //Act
        Long sum = operationMath.sum(number1, number2);
        //Assert
        assert(sum).equals(expected);
    }
}
