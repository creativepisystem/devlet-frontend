package br.com.devlet.frontend.event;

import java.util.HashMap;
import java.util.Map;

public class EventBus {

	private static Map<String, Event> events;
	
	public static void listen(String event, Event action) {
		
		if(events == null) {
			events = new HashMap<>();
		} 
		
		events.put(event, action);
		
	}
	
	public static void dispatch(String event, Object data) {
		Event action = events.get(event);
		if(action != null) {
			action.handle(data);			
		}
	}
	
	public static void dispatch(String event) {
		dispatch(event,null);
	}
	
}
