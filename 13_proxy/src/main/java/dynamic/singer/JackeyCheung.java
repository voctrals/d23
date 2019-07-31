package dynamic.singer;

import java.util.Arrays;

public class JackeyCheung implements Singer {
    @Override
    public void songList() {
        Arrays.asList("祝福", "饿狼传说").forEach(System.out::println);
    }

    @Override
    public void name() {
        System.out.println("张学友");
    }

    @Override
    public void style() {
        System.out.println("通俗");
    }
}
