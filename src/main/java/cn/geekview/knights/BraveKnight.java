package cn.geekview.knights;

/**
 *  直接注入一个接口，也可以是一个父类
 */
public class BraveKnight implements Knight {
//    依赖Quest
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
