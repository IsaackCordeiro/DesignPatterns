package Proxy.proxy;

import Proxy.model.Image;
import Proxy.model.RealImage;

public class ImageProxy implements Image {
    private RealImage realImage;
    private final String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void mostrar (){
        if(realImage == null){
            realImage = new RealImage(fileName);
        }

        realImage.mostrar();
    }
}
