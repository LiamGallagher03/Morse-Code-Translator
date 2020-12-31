package morse.code;
import java.util.Scanner;
public class MorseCode {

    public static void main(String[] args) {
      Scanner kboard = new Scanner(System.in);
      String phrase;
      
      System.out.print("Type something:");
      phrase = kboard.nextLine();
     
      for (int i = 0; i < phrase.length(); i++) {
          String tempVar = (phrase.substring(i, i + 1)).toLowerCase();
        
          if ("a".equals(tempVar)) {
              System.out.print("•- ");
          }
          else if ("b".equals(tempVar)) {
              System.out.print("-••• ");
          }
          else if ("c".equals(tempVar)) {
              System.out.print("-•-• ");
          }
          else if ("d".equals(tempVar)) {
              System.out.print("-•• ");
          }
          else if ("e".equals(tempVar)) {
              System.out.print("• ");
          }
          else if ("f".equals(tempVar)) {
              System.out.print("••-• ");
          }
          else if ("g".equals(tempVar)) {
              System.out.print("--• ");
          }
          else if ("h".equals(tempVar)) {
              System.out.print("•••• ");
          }
          else if ("i".equals(tempVar)) {
              System.out.print("•• ");
          }
          else if ("j".equals(tempVar)) {
              System.out.print("•--- ");
          }
          else if ("k".equals(tempVar)) {
              System.out.print("-•- ");
          }
          else if ("l".equals(tempVar)) {
              System.out.print("•-•• ");
          }
          else if ("m".equals(tempVar)) {
              System.out.print("-- ");
          }
          else if ("n".equals(tempVar)) {
              System.out.print("-• ");
          }
          else if ("o".equals(tempVar)) {
              System.out.print("--- ");
          }
          else if ("p".equals(tempVar)) {
              System.out.print("•--• ");
          }
          else if ("q".equals(tempVar)) {
              System.out.print("--•- ");
          }
          else if ("r".equals(tempVar)) {
              System.out.print("•-• ");
          }
          else if ("s".equals(tempVar)) {
              System.out.print("••• ");
          }
          else if ("t".equals(tempVar)) {
              System.out.print("- ");
          }
          else if ("u".equals(tempVar)) {
              System.out.print("••- ");
          }
          else if ("v".equals(tempVar)) {
              System.out.print("•••- ");
          }
          else if ("w".equals(tempVar)) {
              System.out.print("•-- ");
          }
          else if ("x".equals(tempVar)) {
              System.out.print("-••- ");
          }
          else if ("y".equals(tempVar)) {
              System.out.print("-•-- ");
          }
          else if ("z".equals(tempVar)) {
              System.out.print("--•• ");
          }
          else if ("1".equals(tempVar)) {
              System.out.print("•---- ");
          }
          else if ("2".equals(tempVar)) {
              System.out.println("••--- ");
          }
          else if ("3".equals(tempVar)) {
              System.out.println("•••-- ");
          }
          else if ("4".equals(tempVar)) {
              System.out.println("••••- ");
          }
          else if ("5".equals(tempVar)) {
              System.out.println("••••• ");
          }
          else if ("6".equals(tempVar)) {
              System.out.println("-••• •");
          }
          else if ("7".equals(tempVar)) {
              System.out.println("--••• ");
          }
          else if ("8".equals(tempVar)) {
              System.out.println("---•• ");
          }
          else if ("9".equals(tempVar)) {
              System.out.println("----• ");
          }
          else if ("0".equals(tempVar)) {
              System.out.println("----- ");
          }
          else {
              System.out.print("   ");
          }
      }
    }
}
