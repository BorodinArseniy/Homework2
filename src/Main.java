import java.lang.Math;


public class Main {

    public static void main(String[] args) {
            // задание 1
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog + " " + cat + " " +paper);

            // задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog + " " + cat + " " +paper);

            // задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog + " " + cat + " " +paper);


            //задание 4
        int friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

            // задание 5
        float frog = 3.5f;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog / 3.5f;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

            // задание 6
        var FirstBoxerWeight = 78.2;
        var SecondBoxerWeight = 82.7;
        var commonWeight = FirstBoxerWeight + SecondBoxerWeight;
        var difWeight = Math.abs(FirstBoxerWeight - SecondBoxerWeight);
        System.out.println(commonWeight + " " + difWeight);

            // задание 7
        var justDif = SecondBoxerWeight - FirstBoxerWeight;
        var remDif = SecondBoxerWeight % FirstBoxerWeight;
        System.out.println(justDif);
        System.out.println(remDif);

            //задание 8
        var commonHours = 640;
        var personHours = 8;
        var people = commonHours / personHours;
        System.out.println("Всего работников в компании – " + people + " человек");

        var peopleNewCount = people + 94;
        var newPersonHours = commonHours / peopleNewCount;
        System.out.println("Если в компании работает " + peopleNewCount + " человек, то всего "
                + newPersonHours + " часов работы может быть поделено между сотрудниками");



        









    }
}