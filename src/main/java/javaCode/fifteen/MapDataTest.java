package javaCode.fifteen;

import net.mindview.util.CountingGenerator;
import net.mindview.util.MapData;
import net.mindview.util.RandomGenerator;

public class MapDataTest {
    public static void main(String[] args) {
        System.out.println(MapData.map(new CountingGenerator.Character(), new RandomGenerator.String(3),8));
    }
}
