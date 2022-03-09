public class IMortalTest {
    public static void main(String[] args) {
        IMortal[] mortalEntities = { new Human("철수", 10), new Cow("누렁이", 2),
                new Plant("코스모스", 1, true), new Plant("소나무", 11, false)};
        // Plant 생성자의 세 번째 인자는 한 해 살이 식물이면 true, 여러 해 살이 식물이면 false로 설정한다.

        for (IMortal mortalEntity : mortalEntities) {
            System.out.println(mortalEntity.getName());
            System.out.println(mortalEntity.getAge());
            System.out.println(mortalEntity);

            System.out.print("Animal? ");
            if (mortalEntity instanceof Animal) {
                ((Animal) mortalEntity).isVegetarian();

                System.out.print("Talkable? ");
                if (mortalEntity instanceof ITalkable)
                    ((ITalkable) mortalEntity).talk();
                else
                    System.out.println("No.");

                System.out.print("Walkable? ");
                if (mortalEntity instanceof IWalkable)
                    ((IWalkable) mortalEntity).walk();
                else
                    System.out.println("No.");
            }
            else
                System.out.println("No.");

            System.out.print("Plant? ");
            if (mortalEntity instanceof Plant)
                ((Plant) mortalEntity).isAnnual();
            else
                System.out.println("No.");

            System.out.println("End of Iteration" + "\n");
        }
    }
}

