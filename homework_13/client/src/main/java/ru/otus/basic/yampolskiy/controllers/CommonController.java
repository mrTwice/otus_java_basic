package ru.otus.basic.yampolskiy.controllers;

import ru.otus.basic.yampolskiy.mvp.Model;
import ru.otus.basic.yampolskiy.protocol.Message;
import ru.otus.basic.yampolskiy.tasks.CommonTask;

import java.util.concurrent.BlockingQueue;

public class CommonController {
    private final Model model;
    private final BlockingQueue<Message> messages;
    private final BlockingQueue<String> incoming;

    public CommonController(Model model, BlockingQueue<String> incoming, BlockingQueue<Message> messages) {
        this.model = model;
        this.messages = messages;
        this.incoming = incoming;
    }

    public void processing() {
        new Thread(new CommonTask(this, incoming, messages)).start();
    }


}
