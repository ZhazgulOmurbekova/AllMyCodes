package inheritancePart2;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

public class Sun {

    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.model = "Lenovo";
        lenovo.memorySize =123;
        lenovo.color = "grey";
        lenovo.turnOn();
    }
}
