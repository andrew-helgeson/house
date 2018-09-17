/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square hilt1;
    private Square hilt2;
    private Square hilt3;
    private Square handle1;
    private Square blade;
    private Triangle bladetip;
    private Circle gem;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        hilt1 = new Square();
        hilt2 = new Square();
        hilt3 = new Square();
        handle1 = new Square();
        blade = new Square();
        bladetip = new Triangle();  
        gem = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            person.moveHorizontal(-70);
            person.moveVertical(-40);
            person.changeSize(200, 120);
            person.makeVisible();
            
            
            hilt1.changeColor("red");
            hilt1.moveHorizontal(-60);
            hilt1.moveVertical(40);
            hilt1.changeSize(20);
            hilt1.makeVisible();
            
            hilt2.changeColor("red");
            hilt2.moveHorizontal(-40);
            hilt2.moveVertical(40);
            hilt2.changeSize(20);
            hilt2.makeVisible();
            
            hilt3.changeColor("red");
            hilt3.moveHorizontal(-20);
            hilt3.moveVertical(40);
            hilt3.changeSize(20);
            hilt3.makeVisible();
            
            handle1.changeColor("gray");
            handle1.moveHorizontal(-40);
            handle1.moveVertical(60);
            handle1.changeSize(20);
            handle1.makeVisible();
    
    
            /**
             * sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
             */
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        /**
         * wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
         */
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        //wall.changeColor("red");
        //window.changeColor("black");
        //roof.changeColor("green");
        //sun.changeColor("yellow");
    }
}
