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
    private Square hilt4;
    private Square hilt5;
    private Square grass;
    private Square sheildTop;
    private Triangle sheilddesign1;
    private Circle sheildBottom;
    private Square handle1;
    private Square handle2;
    private Square Lblade1;
    private Square Lblade2;
    private Square Lblade3;
    private Square Lblade4;
    private Square Lblade5;
    private Square Lblade6;
    private Square Lblade7;
    private Square Rblade1;
    private Square Rblade2;
    private Square Rblade3;
    private Square Rblade4;
    private Square Rblade5;
    private Square Rblade6;
    private Square Rblade7;
    private Triangle LhiltTip;
    private Triangle RhiltTip;
    private Circle gem;
    private Person person;
    private Person swordtip;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        hilt1 = new Square();
        hilt2 = new Square();
        hilt3 = new Square();
        hilt4 = new Square();
        hilt5 = new Square();
        grass = new Square();
        sheildTop = new Square();
        sheildBottom = new Circle();
        sheilddesign1 = new Triangle();
        handle1 = new Square();
        handle2 = new Square();
        Lblade1 = new Square();
        Lblade2 = new Square();
        Lblade3 = new Square();
        Lblade4 = new Square();
        Lblade5 = new Square();
        Lblade6 = new Square();
        Lblade7 = new Square();
        Rblade1 = new Square();
        Rblade2 = new Square();
        Rblade3 = new Square();
        Rblade4 = new Square();
        Rblade5 = new Square();
        Rblade6 = new Square();
        Rblade7 = new Square();
        LhiltTip = new Triangle();
        RhiltTip = new Triangle();
        gem = new Circle();
        person = new Person();
        swordtip = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            grass.changeColor("green");
            grass.moveHorizontal(-350);
            grass.moveVertical(140);
            grass.changeSize(550);
            grass.makeVisible();
            
            person.moveHorizontal(-70);
            person.moveVertical(-40);
            person.changeSize(200, 120);
            person.makeVisible();
            
            sheildTop.changeColor("sky blue");
            sheildTop.moveHorizontal(-200);
            sheildTop.moveVertical(40);
            sheildTop.changeSize(80);
            sheildTop.makeVisible();

            sheildBottom.changeColor("sky blue");
            sheildBottom.moveHorizontal(-121);
            sheildBottom.moveVertical(100);
            sheildBottom.changeSize(81);
            sheildBottom.makeVisible();
            
            sheilddesign1.changeColor("white");
            sheilddesign1.moveHorizontal(-60);
            sheilddesign1.moveVertical(40);
            sheilddesign1.changeSize(50, 50);
            sheilddesign1.makeVisible();
            
            
            hilt1.changeColor("red");
            hilt1.moveHorizontal(-80);
            hilt1.moveVertical(40);
            hilt1.changeSize(20);
            hilt1.makeVisible();
            
            LhiltTip.changeColor("red");
            LhiltTip.moveHorizontal(20);
            LhiltTip.moveVertical(0);
            LhiltTip.changeSize(40, 20);
            LhiltTip.makeVisible();
            
            RhiltTip.changeColor("red");
            RhiltTip.moveHorizontal(120);
            RhiltTip.moveVertical(0);
            RhiltTip.changeSize(40, 20);
            RhiltTip.makeVisible();

            hilt2.changeColor("red");
            hilt2.moveHorizontal(-60);
            hilt2.moveVertical(40);
            hilt2.changeSize(20);
            hilt2.makeVisible();
            
            hilt3.changeColor("red");
            hilt3.moveHorizontal(-40);
            hilt3.moveVertical(40);
            hilt3.changeSize(20);
            hilt3.makeVisible();
            
            hilt4.changeColor("red");
            hilt4.moveHorizontal(-20);
            hilt4.moveVertical(40);
            hilt4.changeSize(20);
            hilt4.makeVisible();
            
            hilt5.changeColor("red");
            hilt5.moveHorizontal(0);
            hilt5.moveVertical(40);
            hilt5.changeSize(20);
            hilt5.makeVisible();
            
            gem.changeColor("blue");
            gem.moveHorizontal(42);
            gem.moveVertical(73);
            gem.changeSize(15);
            gem.makeVisible();
            
            handle1.changeColor("dark grey");
            handle1.moveHorizontal(-40);
            handle1.moveVertical(60);
            handle1.changeSize(20);
            handle1.makeVisible();
            
            handle2.changeColor("dark grey");
            handle2.moveHorizontal(-40);
            handle2.moveVertical(80);
            handle2.changeSize(20);
            handle2.makeVisible();
            
            Lblade1.changeColor("grey");
            Lblade1.moveHorizontal(-50);
            Lblade1.moveVertical(20);
            Lblade1.changeSize(20);
            Lblade1.makeVisible();
            
            Lblade2.changeColor("grey");
            Lblade2.moveHorizontal(-50);
            Lblade2.moveVertical(0);
            Lblade2.changeSize(20);
            Lblade2.makeVisible();
            
            Lblade3.changeColor("grey");
            Lblade3.moveHorizontal(-50);
            Lblade3.moveVertical(-20);
            Lblade3.changeSize(20);
            Lblade3.makeVisible();
            
            Lblade4.changeColor("grey");
            Lblade4.moveHorizontal(-50);
            Lblade4.moveVertical(-40);
            Lblade4.changeSize(20);
            Lblade4.makeVisible();
            
            Lblade5.changeColor("grey");
            Lblade5.moveHorizontal(-50);
            Lblade5.moveVertical(-60);
            Lblade5.changeSize(20);
            Lblade5.makeVisible();
            
            Lblade6.changeColor("grey");
            Lblade6.moveHorizontal(-50);
            Lblade6.moveVertical(-80);
            Lblade6.changeSize(20);
            Lblade6.makeVisible();
            
            Lblade7.changeColor("grey");
            Lblade7.moveHorizontal(-50);
            Lblade7.moveVertical(-100);
            Lblade7.changeSize(20);
            Lblade7.makeVisible();
            
            Rblade1.changeColor("light grey");
            Rblade1.moveHorizontal(-30);
            Rblade1.moveVertical(20);
            Rblade1.changeSize(20);
            Rblade1.makeVisible();
            
            Rblade2.changeColor("light grey");
            Rblade2.moveHorizontal(-30);
            Rblade2.moveVertical(0);
            Rblade2.changeSize(20);
            Rblade2.makeVisible();
            
            Rblade3.changeColor("light grey");
            Rblade3.moveHorizontal(-30);
            Rblade3.moveVertical(-20);
            Rblade3.changeSize(20);
            Rblade3.makeVisible();
            
            Rblade4.changeColor("light grey");
            Rblade4.moveHorizontal(-30);
            Rblade4.moveVertical(-40);
            Rblade4.changeSize(20);
            Rblade4.makeVisible();
            
            Rblade5.changeColor("light grey");
            Rblade5.moveHorizontal(-30);
            Rblade5.moveVertical(-60);
            Rblade5.changeSize(20);
            Rblade5.makeVisible();
            
            Rblade6.changeColor("light grey");
            Rblade6.moveHorizontal(-30);
            Rblade6.moveVertical(-80);
            Rblade6.changeSize(20);
            Rblade6.makeVisible();
            
            Rblade7.changeColor("light grey");
            Rblade7.moveHorizontal(-30);
            Rblade7.moveVertical(-100);
            Rblade7.changeSize(20);
            Rblade7.makeVisible();
            
            swordtip.changeColor("white");
            swordtip.moveHorizontal(0);
            swordtip.moveVertical(-240);
            swordtip.changeSize(150, 90);
            swordtip.makeVisible();
    
    
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
