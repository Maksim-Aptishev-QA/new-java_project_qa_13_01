package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void testTaskFound() {
        SimpleTask simpleTask = new SimpleTask(6, "Написать другу");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = true;
        Assertions.assertTrue(actual);
    }

    @Test
    public void testTaskNotFound() {
        SimpleTask simpleTask = new SimpleTask(6, "Поговорить на счет зарплаты");

        boolean actual = simpleTask.matches("Сказать");
        boolean expected = true;
        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicFound() {
        Epic epic = new Epic(9, new String[]{"Пойти в кино"});
        boolean actual = epic.matches("кино");
        boolean expected = true;
        Assertions.assertTrue(actual);
    }


    @Test
    public void testEpicNotFound() {
        Epic epic = new Epic(9, new String[]{"Пойти в кино"});
        boolean actual = epic.matches("книга");
        boolean expected = false;
        Assertions.assertFalse(actual);
    }


    @Test
    public void testMeetingNotFound1() {
        Meeting meeting = new Meeting(9, "Ремонт", "Автомобиль", "12:00");
        Assertions.assertFalse(meeting.matches("Дом"));
        Assertions.assertTrue(meeting.matches("Автомобиль"));
        Assertions.assertTrue(meeting.matches(""));
    }
    
}