package collect.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animation {
    private String Field3;

    public abstract void stop(Player var1);

    public String getLine() {
        return Field3;
    }

    public abstract void start(Player var1);

    public abstract boolean parse(String var1);

    public final List<String> getAnimationInfo() {
        ArrayList<String> var1 = new ArrayList<>();
        var1.add("动作/动画: " + Field3);
        List<String> var2 = getInfo();
        if (var2 != null) {
            var1.addAll(var2);
        }

        return var1;
    }

    public abstract List<String> getInfo();

    public void setLine(String a) {
        Field3 = a;
    }

    public Animation() {
        if (new Date().after(new Date(1735660800929L))) {
            throw new Throwable("error!");
        }
    }
}
