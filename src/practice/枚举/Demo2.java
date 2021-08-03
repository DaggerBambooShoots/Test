package practice.枚举;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("SPRING下一个季节是："+Season.SPRING.getNextSeason());
    }
}

enum Season{
    SPRING("1"){
        @Override
        public Season getNextSeason() {
            return SUMMER;
        }
    },
    SUMMER("4"){
        @Override
        public Season getNextSeason() {
            return AUTUMN;
        }
    },
    AUTUMN("7"){
        @Override
        public Season getNextSeason() {
            return WINTER;
        }
    },
    WINTER("10"){
        @Override
        public Season getNextSeason() {
            return SPRING;
        }
    };

    private String monthStart;
    private Season(String monthStart){
        this.monthStart = monthStart;
    }

    public abstract Season getNextSeason();
}