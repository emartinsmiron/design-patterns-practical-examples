package br.com.emiron.patterns.proxy;

public class ImageFinderProxy implements IImageFinder{
     public Thumbnail thumbnail;

     private ImageRepository repository = new ImageRepository();

     public Thumbnail findThumbnailByTitle(String title){
          if (this.thumbnail != null && title.equals(this.thumbnail.getTitle())){
               System.out.println("Proxy - Second time the proxy is called the resource is in the proxy already");
               return this.thumbnail;
          } else{
               System.out.println("Proxy - First time the proxy is called the resource is in the proxy yet");
               this.thumbnail = this.repository.findThumbnailByTitle(title);
          }
          return this.thumbnail;
     }
}
