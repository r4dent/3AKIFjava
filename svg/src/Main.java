import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wieviele Steine soll deine Kette haben?");
        String blue = "blue";
        String green = "green";
        String orange = "orange";
        String x = "color";
        String svgStart = "<svg height=\"100\" width=\"100\">";
        String svgBlue = MessageFormat.format( "\t<circle cx=\"20\" cy=\"20\" r=\"15\" fill=\"{0}\" />", x);
        String svgGreen = "\t<circle cx=\"20\" cy=\"20\" r=\"15\" fill=\"green\" />";
        String svgOrange = "\t<circle cx=\"20\" cy=\"20\" r=\"15\" fill=\"orange\" />";
        String svgEnd = "</svg>";
        String svg = MessageFormat.format( "<svg height=\"100\" width=\"100\">\n{0}\n{1}\n{2}\n</svg>",blue,green,orange);
        System.out.println("Hier ist Ihr SVG Code:\n");
        System.out.println(svg);
    }
}