import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("black", "wood", "electric", 80.00, 150.00, 6);
    }

    @Test
    public void guitarHasColour(){
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void guitarHasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void guitarHasType(){
        assertEquals("electric", guitar.getType());
    }


}
