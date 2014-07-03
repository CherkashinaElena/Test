package com.test.container;

import com.test.good.Good;

/**
 * Created by Elena on 02.07.2014.
 */
public class Container {

    private static final int MAX_ARRAY_SIZE = 1000;

    private Good[] goods = new Good[MAX_ARRAY_SIZE];

    public void addGood(Good good) {
        for(int i = 0; i < goods.length; i++){
            if(goods[i] == null){
                goods[i] = good;
                break;
            }
        }
    }

    public Good getGood(int index){
        return goods[index];
    }

    public void printList(){
        for(int i = 0; i < goods.length; i++){
            if(goods[i] == null) break;
            System.out.print(goods[i] + "\n");
        }
    }

    public int getCurrentLenght(){

        int currentLengh = 0;

        for(int i = 0; i < goods.length; i++){
            if(goods[i] == null) {
                currentLengh = i;
                break;
            }
        }
        return currentLengh;
    }

    public void sortList(){

        int lenght = getCurrentLenght();

        for (int i = 0; i < lenght; i++){
            for (int j = 0; j < lenght - 1; j++){
                if(goods[j].getPrice() > goods[j + 1].getPrice()){
                    Good currentGood = goods[j];
                    goods[j] = goods[j + 1];
                    goods[j + 1] = currentGood;
                }
            }
        }
    }
}
