package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joke {
    private ArrayList<String> jokes;
    private Random random;

    public Joke() {
        random = new Random();
        jokes = new ArrayList<String>();
        jokes.add("世界上最遥远的距离不是生与死，而是你亲手制造的BUG就在你眼前，你却怎么都找不到她。。。");
        jokes.add("小时候吃方便面步骤，打开包装拆开调味袋，将调料撒在面上用力搓碎拌匀，然后开吃，吃到最后还剩点渣渣的时候倒在手心里，左手右手互相交换着把调料弄掉然后一下添在嘴里。这就是我们80 90的回忆，致我们那些回不去的青春。");
        jokes.add("听到敲门声，我问：“谁”？没回应。我又问：“谁？”门还在敲，我有点发怒，提高嗓门：“谁呀！”外面一个同样愤怒的女：“没敲你家门”！！！");
        jokes.add("LZ有一哥们在精神病院做兼职....今天他和患者打扑克输20....");
        jokes.add("中国足球最牛的地方在于，你认为他们已经差得不堪入目、无以伦比、无法再差的时候，他们会用一场惨不忍睹的失败告诉你，他们还有下降的空间！");
    }
    public String getJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}
