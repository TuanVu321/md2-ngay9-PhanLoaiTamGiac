public class TriangleClassifier {
    public static String Triangle(int canh1, int canh2, int canh3) {
        if (isTriangle(canh1, canh2, canh3)) {
            if(isTamGiacDeu(canh1, canh2, canh3)){
                return "tam giac deu";
            }else{
                if(isTamGiacCan(canh1, canh2, canh3)){
                    return "tam giac can";
                }else {
                    return "tam giac thuong";
                }
            }
        }else{
            return "Day khong phai la mot tam giac";
        }
    }

    private static boolean isTamGiacCan(int canh1, int canh2, int canh3) {
        return canh1==canh2||canh1==canh3||canh3==canh2;
    }

    private static boolean isTamGiacDeu(int canh1, int canh2, int canh3) {
        return canh1==canh2&&canh2==canh3;
    }

    private static boolean isTriangle(int canh1, int canh2, int canh3) {
        return (canh1 + canh2) > canh3 && (canh1 + canh3) > canh2 && (canh3 + canh2) > canh1;
    }

}
