package hello.core.singleton;

public class SingletonService {

    //  static 으로 선언 -> 클래스 레벨에 올라가기 때문에 단 하나만 생성된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    // 생성을 막아버림
    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
