package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchShuttleMission {

    public List<String> findRightWords(String txt) {

        Pattern pattern = Pattern.compile("/shuttle/missions/(\\D{1,}-\\d)_(\\d)");
        Matcher matcher = pattern.matcher(txt);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            if (! list.contains(matcher.group(0))) {
                list.add(matcher.group(0));
            }
        }
            return list;
        }

    public static void main(final String[] args) {
        SearchShuttleMission searchShuttleMission = new SearchShuttleMission();
        List<String> list = searchShuttleMission.findRightWords("IT (інформаційні технології) відіграє важливу роль в космічних місіях NASA. Наприклад, на веб-сайті NASA можна знайти  інформацію про першу її місію у космос /shuttle/missions/STS-1_1  Крім того, на сайті NASA є інформація про місії /shuttle/missions/STS-2_2 та /shuttle/missions/STS-3_3");
        for (String word: list) {
            System.out.println(word);
        }
    }
}
