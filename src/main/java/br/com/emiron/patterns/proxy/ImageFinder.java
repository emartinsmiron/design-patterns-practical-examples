package br.com.emiron.patterns.proxy;

public class ImageFinder implements IImageFinder{
     private IImageFinder imageFinder = new ImageFinderProxy();

     public Thumbnail findThumbnailByTitle(String title){
          System.out.println(
                    "Image Finder - This method do not call the repository directly, the proxy will surregate it's call");
          return this.imageFinder.findThumbnailByTitle(title);
     }

}
