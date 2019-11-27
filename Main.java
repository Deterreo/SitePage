package petrovskyy;

import java.text.StringCharacterIterator;

public class Main {

    public static void main(String[] args) {
        SitePage theme1 = new SitePage("1", "Intro", "Meet the course, program, schedule, administration, etc.");
        SitePage theme2 = new SitePage("2", "Work with \"git\"", "git scm system and git based repositories: github, bitbucket");
        SitePage theme3 = new SitePage("3", "What is Automation ", "What is Test Automation, roles, benefits, approaches, etc.");
        SitePage theme4 = new SitePage("4-12", "Java", "Java programming language, based on Java 7/8 syntax");
        SitePage theme5 = new SitePage("13", "Maven", "Maven build tool for Java projects");


        System.out.println(theme1.toString());
        System.out.println(theme2.toString());
        System.out.println(theme3.toString());
        System.out.println(theme4.toString());
        System.out.println(theme5.toString());

    }
}
