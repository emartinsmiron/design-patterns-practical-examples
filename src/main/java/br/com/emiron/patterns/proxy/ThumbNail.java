package br.com.emiron.proxy;

public class ThumbNail {
     private String title;

     public ThumbNail(String title){
          this.title = title;
     }

     public String getTitle(){
          return this.title;
     }

     @Override
     public String toString() {
          return "ThumbNail{" +
                  "title='" + title + '\'' +
                  '}';
     }
}
