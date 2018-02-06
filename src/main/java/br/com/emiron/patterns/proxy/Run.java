package br.com.emiron.patterns.proxy;

public class Run{
     // This explample shows a short example of how to use proxy pattern
     public static void main(String... strings){
          ImageFinder finder = new ImageFinder();
          finder.findThumbnailByTitle("teste");
          finder.findThumbnailByTitle("teste");
     }

}
