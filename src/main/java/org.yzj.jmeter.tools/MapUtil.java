package org.yzj.jmeter.tools;

import java.util.Random;

public class MapUtil {

    public static void main(String[] args) {

        Double [] min = {114.110208, 30.483131};
        Double [] max = {114.437051, 30.718357};

        MapUtil mapUtil = new MapUtil();

        String slon = mapUtil.getRandomDouble(min,max,"lon");
        String slat = mapUtil.getRandomDouble(min,max,"lat");

        String dlon = mapUtil.getRandomDouble(min,max,"lon");
        String dlat = mapUtil.getRandomDouble(min,max,"lat");

        for (int i=0;i<10;i++){
            System.out.println(slon + "," + slat);
            System.out.println(dlon + "," + dlat);
        }

    }

    public String getRandomDouble(Double [] min,Double [] max,String type){
        double d = 0.000000;
        if(type.equals("lon")){
            d = min[0] + new Random().nextDouble() * (max[0] - min[0]);
        }else{
            d = min[1] + new Random().nextDouble() * (max[1] - min[1]);
        }
        return  String.format("%.6f", d);
    }

    public MapUtil() {
    }
}
