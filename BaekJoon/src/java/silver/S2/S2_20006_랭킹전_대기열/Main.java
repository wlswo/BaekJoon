package BaekJoon.src.java.silver.S2.S2_20006_랭킹전_대기열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Programmers
 * https://www.acmicpc.net/problem/20006
 * Problem: 랭킹전 대기열
 * Level: S2
 * Algorithm: 구현, 시뮬레이션
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int players = Integer.parseInt(str[0]);
        int limit = Integer.parseInt(str[1]);

        List<Room> rooms = new ArrayList<>();
        while (players-- > 0) {
            boolean isEnter = false;
            String[] player =  br.readLine().split(" ");

            for(int i=0; i<rooms.size(); i++) {
                Room room = rooms.get(i);
                if(room.isFull)
                    continue;

                if(room.check(Integer.parseInt(player[0]))) {
                    room.enter(player[1],Integer.parseInt(player[0]));
                    isEnter = true;
                    break;
                }
            }

            if(!isEnter) {
                Room room = new Room(limit,Integer.parseInt(player[0]),player[1]);
                rooms.add(room);
            }
        }

        for(int i=0; i<rooms.size(); i++) {
            Room room = rooms.get(i);
            if(room.isFull) {
                System.out.println("Started!");
            }else {
                System.out.println("Waiting!");
            }
            Map<String,Integer> map = room.getMap();
            String[] names = map.keySet().toArray(new String[0]);
            Arrays.sort(names);
            for(String name : names) {
                int l = map.get(name);
                System.out.println(l+" "+name);
            }
        }
    }
}

class Room {
    int limit;
    boolean isFull;
    int range;

    Map<String,Integer> map = new HashMap<>();

    Room(int limit, int range, String name) {
        this.limit = limit;
        this.range = range;
        map.put(name,range);
        if(limit == 1)
            isFull = true;
        else
            isFull = false;
    }

    public boolean check(int level) {
        if(level >= range-10 && level <= range+10 ) {
            return true;
        }else {
            return false;
        }
    }

    public Map<String,Integer> getMap() {
        return map;
    }

    public void enter(String name, int level) {
        map.put(name,level);
        if(map.size() == limit) {
            isFull = true;
        }
    }
}
