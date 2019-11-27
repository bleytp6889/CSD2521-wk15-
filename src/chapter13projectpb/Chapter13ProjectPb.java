
package chapter13projectpb;

/**
 *
 * @author Parker Bleything
 * 11/22/19
 * Chapter 13 Project 
 * Read html file then convert to text
 */
public class Chapter13ProjectPb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HTML Converter");
        System.out.println();
        
        System.out.println("INPUT:");
        
        
        String html = "<h1>Grocery List</h1>\n" +
                "<ul>\n" +
                "    <li>Eggs</li>\n" +
                "    <li>Milk</li>\n" +
                "    <li>Butter</li>\n" +
                "</ul>";
        
        System.out.println(html);
        System.out.println();
                
        System.out.println("OUTPUT:");
        
        // remove html 
        html = html.trim();
        html = html.replaceAll("\\<.*?\\>", "");
        // add *
        html += "*";
        
        
        // output
        System.out.println(html);
        
    
}
}
