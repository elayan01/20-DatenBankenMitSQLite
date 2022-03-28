import control.MainController;

public class MainProgram {
    public static void main(String[] args) {
        MainController mc = new MainController();
        mc.doSomething();
        System.out.println("---------------------------");
        mc.testAQuery();
        System.out.println("---------------------------");
        mc.printSortedActivities();

        mc.close();
    }


}
