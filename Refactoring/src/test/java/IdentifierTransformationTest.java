import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTransformationTest {
    @Test
    public void snakeCaseIdentifierToCamelCaseTest1(){
        assertEquals("abcE",IdentifierTransformation.snakeCaseIdentifierToCamelCase("abc_e"));
    }
    @Test
    public void snakeCaseIdentifierToCamelCaseTest2(){
        assertEquals("abcE",IdentifierTransformation.snakeCaseIdentifierToCamelCase("_abc_e"));
    }
    @Test
    public void snakeCaseIdentifierToCamelCaseTest3(){
        assertEquals("",IdentifierTransformation.snakeCaseIdentifierToCamelCase(""));
    }

    @Test
    public void snakeCaseIdentifierToPascalCaseTest1(){
        assertEquals("UnNomDeVariable",IdentifierTransformation.snakeCaseIdentifierToPascalCase("un_nom_de_variable"));
    }
    @Test
    public void snakeCaseIdentifierToPascalCaseTest2(){
        assertEquals("UnNomDeVariable",IdentifierTransformation.snakeCaseIdentifierToPascalCase("_un_nom_de_variable"));
    }
    @Test
    public void snakeCaseIdentifierToPascalCaseTest3(){
        assertEquals("",IdentifierTransformation.snakeCaseIdentifierToPascalCase(""));
    }
}
