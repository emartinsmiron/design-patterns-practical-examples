package br.com.emiron.proxy;

import java.util.HashMap;
import java.util.Map;

public class ImageCacheProxy implements ThumbNailProvider {
     ThumbNailProvider finder;

     private Map<String, ThumbNail> cache = new HashMap<>();

     public ImageCacheProxy() {
          finder = new ImageFinder();
     }

     @Override
     public Map<String, ThumbNail> listThumbNail() {
          if(cache.isEmpty()){
              this.cache =  finder.listThumbNail();
          }
          return cache;
     }

     @Override
     public ThumbNail getThumbNail(String key) {
          System.out.println(cache.get(key));
          return cache.get(key);
     }
}
