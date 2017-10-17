package cn.geekview.knights;

import cn.geekview.quest.RescueDamselQuest;

/**
 * 传统的依赖写法：
 *      只能处理RescueDamselQuest这一类
 *      Damsel: 少女
 *      Knight: 骑士
 *      embark：从事
 */
public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
