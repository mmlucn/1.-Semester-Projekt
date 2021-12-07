package model;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class tet.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class tet
{
    private model.Item item1;
    private model.Item item2;
    private model.ItemContainer itemCont1;

    /**
     * Default constructor for test class tet
     */
    public tet()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        item1 = new model.Item("String 1", "Name 1", "Description 1", "11111", "Location 1", "Placement 1", 10.00, 100.00);
        item2 = new model.Item("ID 2", "Name 2", "Description 2", "Barcode 2", "Location 2", "Placement 2", 100.00, 1000.00);
        itemCont1 = new model.ItemContainer();
        itemCont1.addItem(item2);
        itemCont1.addItem(item1);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
