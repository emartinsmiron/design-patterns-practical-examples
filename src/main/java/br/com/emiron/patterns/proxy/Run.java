package br.com.emiron.proxy;

public class Run{
     // This code shows a short example of how to use proxy pattern
     public static void main(String... strings){
          FileManager naive = new FileManager(new ImageFinder());
          FileManager smart = new FileManager(new ImageCacheProxy());

          naive.renderThumbNail("teste2");
          naive.listThumbNail();

          smart.renderThumbNail("teste2");
          smart.listThumbNail();
          smart.renderThumbNail("teste2");
     }

}
