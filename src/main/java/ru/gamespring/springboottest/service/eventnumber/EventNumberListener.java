package ru.gamespring.springboottest.service.eventnumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import ru.gamespring.springboottest.service.Game;
import ru.gamespring.springboottest.service.speacker.Speacker;

@Component
public class EventNumberListener implements ApplicationListener<EventNumber> {
    private boolean isFind;
    @Autowired
    private Speacker speacker;

    @Override
    public void onApplicationEvent(EventNumber event) {
        //число из слушателя сравниваем с импорт статик инт гейм
        //на каждый результат вызываем метод c фразами
        if (event.getNumber() == Game.genX) {
            speacker.saySpeacker(5);

            setFind(true);
        } else if (event.getNumber() > Game.genX) {
            speacker.saySpeacker(4);
        } else if (event.getNumber() < Game.genX) {
            speacker.saySpeacker(3);
        }
    }

    public boolean getIsFind() {
        return isFind;
    }

    public void setFind(boolean isFind) {
        this.isFind = isFind;
    }}
