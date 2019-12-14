package codingBat;

import java.util.List;

public class ReplaiceList {
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }
}
