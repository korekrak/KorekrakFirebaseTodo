package denny.kristianto.korekrakfirebasetodo;

/**
 * KorekrakFirebaseTodo
 * Created by Denny Kristianto on 21/09/2017.
 * Copyright (c) 2017 by Denny Kristianto
 */

public class EventObj {
    private String eventName;
    private String eventDesc;

    public EventObj(String eventName, String eventDesc) {
        this.eventName = eventName;
        this.eventDesc = eventDesc;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }
}
