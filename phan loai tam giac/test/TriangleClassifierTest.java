import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTamGiac1() {
        String expected = "tam giac deu";
        String result = TriangleClassifier.Triangle(2,2,2);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiac2() {
        String expected = "tam giac can";
        String result = TriangleClassifier.Triangle(2,2,3);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiac3() {
        String expected = "tam giac thuong";
        String result = TriangleClassifier.Triangle(3,4,5);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiac4() {
        String expected = "Day khong phai la mot tam giac";
        String result = TriangleClassifier.Triangle(8,2,3);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiac5() {
        String expected = "Day khong phai la mot tam giac";
        String result = TriangleClassifier.Triangle(-1,2,1);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiac6() {
        String expected = "Day khong phai la mot tam giac";
        String result = TriangleClassifier.Triangle(0,1,1);
        assertEquals(expected,result);
    }




}