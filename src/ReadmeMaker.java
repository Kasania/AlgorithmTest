/*
 * Author : 나상혁 : Kasania
 * Filename : ReadmeMaker
 * Desc : Readme.md 파일을 일일히 관리하기 귀찮아서 만든 프로그램입니다.
 */

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadmeMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("File name : ");
        String target = sc.next().toUpperCase();
        List<Path> pathList = new ArrayList<>();
        try {
            pathList = Files.walk(Path.of("./")).filter(path -> path.getFileName().toString().contentEquals(target+".java")).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String filename = pathList.get(0).getFileName().toString();
        try {
            if(filename.startsWith("P")){
                String name = Files.lines(pathList.get(0)).skip(2).limit(1).collect(Collectors.joining()).split(":")[2].trim();
                String level = pathList.get(0).getParent().getName(3).toString();
                String levelReadme = pathList.get(0).getParent().toString() + "/Readme.md";

                Files.writeString(Path.of(levelReadme),
                        "\n* ["+name+"](https://programmers.co.kr/learn/courses/30/lessons/"+target.substring(1)+") " +
                                "/ [풀이](./"+target+".java)",
                        StandardCharsets.UTF_8, StandardOpenOption.APPEND);

                List<String> list = Files.lines(Path.of("./Readme.md")).collect(Collectors.toList());
                for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).equals("* "+level.toUpperCase())){
                        list.add(i+1,"  * ["+name+"](https://programmers.co.kr/learn/courses/30/lessons/"+target.substring(1)+") " +
                                "/ [풀이]("+pathList.get(0).toString().replace('\\','/')+")");
                    }
                }
                Files.writeString(Path.of("./Readme.md"),String.join("\n", list),StandardCharsets.UTF_8,StandardOpenOption.WRITE);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
