package _05_class._access_modifier._pack05._abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수","ABC 고등학교",17,20220001);
        Baek baek = new Baek("백영희","XYZ 고등학교",18,20220002);

        kim.getInfo();
        kim.todo();
        baek.getInfo();
        baek.todo();
    }
}
