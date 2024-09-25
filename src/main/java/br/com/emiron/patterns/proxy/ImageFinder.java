package br.com.emiron.proxy;

import java.util.Map;

public class ImageFinder implements ThumbNailProvider {

     @Override
     public Map<String, ThumbNail> listThumbNail() {
          return ImageRepository.getThumbnails();
     }

     @Override
     public ThumbNail getThumbNail(String key) {
          ThumbNail thumbNail = ImageRepository.getThumbnails().get(key);

          System.out.println(thumbNail);
          return thumbNail;
     }
}
