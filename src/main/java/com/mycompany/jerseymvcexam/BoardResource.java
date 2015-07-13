package com.mycompany.jerseymvcexam;

import javax.ejb.EJB;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.mvc.Template;

@Path("board")
public class BoardResource {
    
    @EJB
    private BoardEJB board;

    @GET
    @Path("init")
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/board")
    public BoardBean init() {
        
        BoardBean res = new BoardBean();
        res.setName("");
        res.setComment("");
        res.setArticles(board.getCurrentMessage());
        return res;
    }

    @POST
    @Path("submit")
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/board")
    public BoardBean submitMessage(
            @FormParam("name") String name, 
            @FormParam("comment") String comment) {
        
        board.addMessage(name, comment);
        
        BoardBean res = new BoardBean();
        res.setName(name);
        res.setComment(comment);
        res.setArticles(board.getCurrentMessage());
        return res;
    }
}
