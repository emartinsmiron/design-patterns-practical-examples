package br.com.emiron.proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageRepository{

     public static Map<String, ThumbNail> getThumbnails(){
          Map<String, ThumbNail> thumbnails = new HashMap<>();
          ThumbNail thumbnail = new ThumbNail("teste");
          ThumbNail thumbnail2 = new ThumbNail("teste2");
          ThumbNail thumbnail3 = new ThumbNail("teste3");

          thumbnails.put(thumbnail.getTitle(), thumbnail);
          thumbnails.put(thumbnail2.getTitle(), thumbnail2);
          thumbnails.put(thumbnail3.getTitle(), thumbnail3);
          return thumbnails;
     }
}
