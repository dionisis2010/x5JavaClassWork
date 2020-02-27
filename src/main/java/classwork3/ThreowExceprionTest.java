package classwork3;

public class ThreowExceprionTest {

    public static void main(String[] args) {

        try{
            throw new CustomException("");
        } catch (CustomException e){
            System.out.println(e.getClass());
            throw new RuntimeException();
        } catch (RuntimeException e){
            System.out.println(e.getClass());
        } finally {
            return;
        }

//        m();
    }

    static void m(){
        throw new CustomException("1344");
    }

}
