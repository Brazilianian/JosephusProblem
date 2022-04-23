public class Main {

    private static String[] names = {"0", "1", "2", "3", "4", "5", "6", "7",};

    public static void main(String[] args) {
        josephusWorker(7, 2);
    }

    public static void josephusWorker(int count, int interval) {
        LinkedCircleList<String> list = new LinkedCircleList<>();

        for (int i = count - 1; i >= 0; i--) {
            list.add(names[i]);
        }

        list.printOneCircle();
        System.out.println("******************************");

       list.removeEach(interval);
    }
}
