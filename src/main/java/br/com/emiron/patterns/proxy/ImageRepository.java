package br.com.emiron.patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageRepository{

     Map<String, Thumbnail> thumbnails;

     public ImageRepository(){
          this.thumbnails = new HashMap<String, Thumbnail>();
          Thumbnail thumbnail = new Thumbnail("teste");
          Thumbnail thumbnail2 = new Thumbnail("teste2");
          Thumbnail thumbnail3 = new Thumbnail("teste3");

          this.thumbnails.put(thumbnail.getTitle(), thumbnail);
          this.thumbnails.put(thumbnail2.getTitle(), thumbnail2);
          this.thumbnails.put(thumbnail3.getTitle(), thumbnail3);
     }

     public Thumbnail findThumbnailByTitle(String title){

          return this.thumbnails.get(title);
     }

}
