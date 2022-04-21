package ru.gamespring.springboottest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gamespring.springboottest.service.eventnumber.EventNumberListener;
import ru.gamespring.springboottest.service.eventnumber.EventNumberPublisher;
import ru.gamespring.springboottest.service.speacker.Speacker;

import java.util.Scanner;

@Service
public class Game {

    //бесячая статик переменная инт для ген числа
    public static int genX;
    @Autowired
    private Speacker speacker;
    @Autowired
    private EventNumberListener eventNumberListener;
    @Autowired
    private EventNumberPublisher eventNumberPublisher;

    public Game(){}
    public Game(int genX){
        this.genX = genX;
    }

    public void start(){
        //вызов реплик из класса Speacker
        speacker.saySpeacker(1);
        speacker.saySpeacker(2);
        //генерация числа
        genX = 0 + (int) (Math.random() * 1000);
        //создаём слушатель для цикла
        while (!eventNumberListener.getIsFind()) {
            //ввод и создание события в цикле publisher.publishNumber(new Scanner(System.in).nextInt());
            eventNumberPublisher.publishNumber(new Scanner(System.in).nextInt());
        }
    }
}
