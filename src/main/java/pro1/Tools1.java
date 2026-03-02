package pro1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Tools1
{
    public static String analyze(Path path)
    {
        List<String> lines;
        try {
            lines = Files.readAllLines(path);
            HashMap<String,Integer> dict = new HashMap<>();
            for(var line:  lines){
               var current = dict.getOrDefault(line,0);
                dict.put(line,current+1);
            }
            return dict.keySet().stream().sorted(Comparator.comparing(o -> o)).map((x)->x+":"+dict.get(x)).collect(Collectors.joining(","));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
