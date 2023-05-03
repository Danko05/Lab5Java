package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public List<String> shuttleMissions(final String text) {
        Pattern pattern = Pattern.compile(
                "/shuttle/missions/(\\D{3}-\\d)_(\\d)");
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            list.add(matcher.group() + "\n");
            list.add("Mission name is: " + matcher.group(1) + "\n");
            list.add("Order number is: " + matcher.group(2) + "\n" + "\n");
        }
        System.out.println(list);
        return list;
    }

    public void main(final String[] args) {


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Main main = new Main();
        main.shuttleMissions(text);
    }
}
