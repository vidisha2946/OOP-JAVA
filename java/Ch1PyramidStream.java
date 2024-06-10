public class Ch1PyramidStream {
    public static void main(String[] args) {
        String str = "stream";
        for (int i = 0; i < str.length()+1; i++) {
            System.out.println(str.substring(0, i));
        }
    }
}
