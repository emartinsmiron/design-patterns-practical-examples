package br.com.emiron.proxy;

import java.util.Map;

public interface ThumbNailProvider {
     Map<String, ThumbNail> listThumbNail();

     ThumbNail getThumbNail(String key);
}
