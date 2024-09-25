package br.com.emiron.proxy;

public class FileManager {

    ThumbNailProvider provider;

    public FileManager(ThumbNailProvider provider) {
        this.provider = provider;
    }

    public void renderThumbNail(String key){
        provider.getThumbNail(key);
    }

    public void listThumbNail(){
        provider.listThumbNail();
    }
}
