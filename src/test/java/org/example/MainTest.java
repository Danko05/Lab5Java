package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shuttleMissionsTest() {
        Main main = new Main();
        String text = "IT (інформаційні технології) відіграє важливу роль в космічних місіях NASA. Наприклад, на веб-сайті NASA можна знайти  інформацію про першу її місію у космос /shuttle/missions/STS-1_1  Крім того, на сайті NASA є інформація про місії /shuttle/missions/STS-2_2 та /shuttle/missions/STS-3_3";
        List<String> expectedList = List.of(
                "/shuttle/missions/STS-1_1\n",
                "Mission name is: STS-1\n",
                "Order number is: 1\n\n",
                "/shuttle/missions/STS-2_2\n",
                "Mission name is: STS-2\n",
                "Order number is: 2\n\n",
                "/shuttle/missions/STS-3_3\n",
                "Mission name is: STS-3\n",
                "Order number is: 3\n\n"
        );
        List<String> actualList = main.shuttleMissions(text);
        assertEquals(actualList,expectedList);
    }

}