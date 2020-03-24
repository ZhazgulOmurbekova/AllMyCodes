package abstract2;

public  class Safari extends Browser {
    @Override
    public void launch() {

    }

    @Override
    public void browse(String url) {

    }

    @Override
    public int getNumOfTabs() {
        return 0;
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public int getNumOfTabs(String a) {
        return 0;
    }
}
