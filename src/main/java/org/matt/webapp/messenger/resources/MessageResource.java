package org.matt.webapp.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.matt.webapp.messenger.model.Message;

import org.matt.webapp.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
    @GET
    @Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		//return "Hello Cruel World!";
    	return messageService.getAllMessages();
	}
}
