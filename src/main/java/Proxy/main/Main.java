package Proxy.main;

import Proxy.model.Image;
import Proxy.proxy.ImageProxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("teste.jpg");

        image.mostrar();
    }
}
