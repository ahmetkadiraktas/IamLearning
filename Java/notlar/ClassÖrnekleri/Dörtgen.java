public class Dörtgen {

    public int width;
    public int height;

    
    public Dörtgen(){
        this(5,4);
    }


    public Dörtgen(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int calculatePerimeter(){
        return 2*(width+height);
    }


    public int calculateArea(){
        return width*height;
    }


    public int[] setDimensions() {
        int[] dimensions = new int[2];
        width = (int)(Math.random() * 100 + 1);
        height = (int)(Math.random() * 100 + 1);
        dimensions[0] = width;
        dimensions[1] = height;
        return dimensions;
    }

}
