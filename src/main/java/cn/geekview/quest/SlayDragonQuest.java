package cn.geekview.quest;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
//  依赖PrintStream
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark() {
        stream.println("Spring DI");
    }
}
