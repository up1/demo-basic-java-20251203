package org.example;

public class DemoException {

    public static void main(String[] args) {
        DemoException demoException = new DemoException();
        try {
            demoException.processWithException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void processWithException() throws Exception{
        try {
            String[] names = new String[]{"A", "B"};
            System.out.println(names[2]);
        } catch (Exception e) {
            throw new Exception("Error na");
        }
    }
}
