package Exercices.EX1._4_Maarah;

public class Pixel {
    private int red;   // Red component
    private int green; // Green component
    private int blue;  // Blue component
  
    public Pixel(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() { return red; }
    public int getGreen() { return green; }
    public int getBlue() { return blue; }

    /* Checks if the pixel is purely red
     * @return true if the pixel is red, false otherwise
     */
    public boolean isRed() {
        return red > 0 && green == 0 && blue == 0;
    }

    /* Checks if the pixel is purely green
     * @return true if the pixel is green, false otherwise
     */
    public boolean isGreen() {
        return green > 0 && red == 0 && blue == 0;
    }
      
    /* Checks if the pixel is purely blue
     * @return true if the pixel is blue, false otherwise
     */
    public boolean isBlue() {
        return blue > 0 && red == 0 && green == 0;
    }

    /* Checks if the pixel is of another color
     * @return true if the pixel is not red, not green, and not blue
     */
    public boolean isOther() {
        return !isRed() && !isGreen() && !isBlue();
    }

    /* Testing the Pixel class
     * How it works:
     * 1. Create test pixels of different colors
     * 2. Test the color detection methods
     * 3. Create and test pictures
     */
    public static void main(String[] args) {
        // Create test pixels
        Pixel redPixel = new Pixel(255, 0, 0);
        Pixel greenPixel = new Pixel(0, 255, 0);
        Pixel bluePixel = new Pixel(0, 0, 255);
        Pixel mixedPixel = new Pixel(123, 45, 67);
      
        // Test the methods
        System.out.println("Red Pixel isRed: " + redPixel.isRed());       // true
        System.out.println("Green Pixel isGreen: " + greenPixel.isGreen()); // true
        System.out.println("Blue Pixel isBlue: " + bluePixel.isBlue());    // true
        System.out.println("Mixed Pixel isOther: " + mixedPixel.isOther()); // true
      
        // Create a Picture object and test isBalanced method
        Picture picture = new Picture("Test Picture", "Test Artist", 3, 3);
      
        // Test 1 - Balanced Picture (3 red, 3 green, 3 blue)
        Pixel[][] firstPicture = {
                { redPixel, greenPixel, bluePixel },
                { redPixel, greenPixel, bluePixel },
                { redPixel, greenPixel, bluePixel }
        };
        picture.createPic(firstPicture);
        System.out.println("First Picture Test: " + picture.isBalanced());  // true
      
        // Test 2 - Unbalanced Picture
        Pixel[][] secondPicture = {
                { redPixel, redPixel, redPixel },
                { redPixel, greenPixel, bluePixel },
                { redPixel, greenPixel, bluePixel }
        };
        picture.createPic(secondPicture);
        System.out.println("Second Picture Test: " + picture.isBalanced());  // false
    }
}

class Picture {
    private String picName;      // picture name
    private String painterName;  // painter's name
    private Pixel[][] pixels;    // array of pixels

    /* Constructor
     * @param picName - picture name
     * @param painterName - painter's name
     * @param width - picture width
     * @param height - picture height
     */
    public Picture(String picName, String painterName, int width, int height) {
        this.picName = picName;
        this.painterName = painterName;
        this.pixels = new Pixel[height][width];
    }

    /* Creates a picture from a ready-made array of pixels
     * @param pixels - two-dimensional array of pixels
     */
    public void createPic(Pixel[][] pixels) {
        this.pixels = pixels;
    }

    public String getPicName() { return picName; }
    public String getPainterName() { return painterName; }

    /* Checks if the picture is balanced
     * @return true if the number of red, green, and blue pixels is equal
     */
    public boolean isBalanced() {
        int redCount = 0, greenCount = 0, blueCount = 0;
        
        for(int i = 0; i < pixels.length; i++) {
            for(int j = 0; j < pixels[i].length; j++) {
                if(pixels[i][j].isRed()) redCount++;
                if(pixels[i][j].isGreen()) greenCount++;
                if(pixels[i][j].isBlue()) blueCount++;
            }
        }
        
        return redCount == greenCount && greenCount == blueCount;
    }
}