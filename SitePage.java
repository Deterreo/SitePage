package petrovskyy;

public class SitePage {

    private String lessons;
    private String title;
    private String content;

    SitePage(String lessons, String title, String content){

        this.lessons = lessons;
        this.title = title;
        this.content = content;
    }
    public String toString() {

        String tcontent;

        char lcontent = content.charAt(content.length() - 1);
        if (lcontent == ".".charAt(0))
            tcontent = content.substring(0, content.length() - 1);
        else
            tcontent = content;
        return lessons + ". " + title + ": " + tcontent + ".";
    }
}
