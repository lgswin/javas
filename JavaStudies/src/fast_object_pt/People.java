package fast_object_pt;

public class People {
    String name;
    int height;
    int weight;
    String gender;
    int age;

    public People() {

    }

    public People(String name, int height, int weight, String gender, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "키가 " + this.height + " 이고 몸무게가 " + this.height+" 킬로인 " + this.gender+"이 있습니다." +
                "이름은 " + this.name+" 이고 나이는 " +this.age +" 입니다.";
    }
}

