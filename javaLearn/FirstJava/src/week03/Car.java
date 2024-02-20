package week03;

// 클래스를 만들기 위한 과정

// 1. 만드려는 설계도를 선언 (클래스 선언)
// 2. 객체가 가지고 있어야 할 속성(필드) 정의
// 3. 객체를 생성하는 방식 정의(생성자)
// 4. 객체가 가지고 있어야 할 행위(메서드) 정의
public class Car {
    // <필드 영역>

    // <고유 데이터 영역>
    String company;
    String model = "GV80";
    String color;
    double price;
    double speed;
    char gear;
    boolean lights = true;

    // <객체 데이터 영역>
    Tire tire = new Tire();
    Door door = new Door();
    Handle handle = new Handle();

    // 생성자 : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의.
    public Car () {
        // logic
        // 개본 생성자 : 생략이 가능
    }

    // <메서드 영역>

    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); //가속도 페달을 밟으면 자동으로 기어가 변한다.
        speed = kmh;
        return speed;
    }

    // breakPedal
    // input : X
    // output : speed
    double breakPedal () {
        speed = 0;
        return  speed;
    }

    //changeGear
    // input : gear(char type)
    // output : gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    //onOffLights
    // input : X
    // output : boolean
    boolean onOffLights () {
        lights = !lights;
        return lights;
    }

    // horn
    // input : X
    // output : X
    void horn () {
        System.out.println("빵빵");
    }

    // 자동차의 속도 .. 가변길이 메서드
    void carSpeeds(double ... speed) {
        for (double v : speed) {
            System.out.println("v = " + v);
        }
    }


}
