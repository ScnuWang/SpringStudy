package cn.geekview.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    public void play() {
        System.out.println("比伯军曹寂寞芳心俱乐部");
    }
}
