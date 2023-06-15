package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShuttleMissionTest {

    @Test
    public void SearchShuttleMissionsTest() {
        SearchShuttleMission searchShuttleMission = new SearchShuttleMission();
        String inputText = "IT (інформаційні технології) відіграє важливу роль в космічних місіях NASA. Наприклад, на веб-сайті NASA можна знайти  інформацію про першу її місію у космос /shuttle/missions/sts-1_1  Крім того, на сайті NASA є інформація про місії /shuttle/missions/sts-2_2 та /shuttle/missions/sts-3_3";
        List<String> expectedText = List.of("/shuttle/missions/sts-1_1", "/shuttle/missions/sts-2_2",
                "/shuttle/missions/sts-3_3");
        assertEquals(expectedText, searchShuttleMission.findRightWords(inputText));

    }


}