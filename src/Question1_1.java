public class Question1_1 {
    public static void main(String[] args) {
        result(300,500,0,1);
    }
    public static int result(int xStart,int xEnd,int yStart,int yEnd){
        return ((xEnd * (xEnd + 1) /2) - (xStart*(xStart+1)/2)) / ((yEnd * (yEnd + 1) /2) - (yStart*(yStart+1)/2));
    }
}
