package abstract2;

public class InternetUser {

    public static void main(String[] args) {
        Chrome ch = new Chrome();
        ch.close();
      Browser bs = new Browser() {
          @Override
          public void launch() {
              System.out.println("asd");
          }

          @Override
          public void browse(String url) {
              System.out.println("asdad");
          }

          @Override
          public int getNumOfTabs() {
              return 0;
          }

          @Override
          public int getNumOfTabs(String a) {
              return 0;
          }
      };
      bs.launch();
      bs.browse("asdfg");
    }
}
