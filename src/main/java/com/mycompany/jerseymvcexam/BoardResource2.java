package com.mycompany.jerseymvcexam;

import javax.ejb.EJB;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.mvc.ErrorTemplate;
import org.glassfish.jersey.server.mvc.Template;

@Path("board2")
public class BoardResource2 {
    
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
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/board")
    @ErrorTemplate(name = "/board_error")
    public BoardBean submitMessage(@Valid @BeanParam ContributeBean contribute) {
        
        String name = contribute.getName();
        String comment = contribute.getComment();
        
        board.addMessage(name, comment);
        
        BoardBean res = new BoardBean();
        res.setName(name);
        res.setComment(comment);
        res.setArticles(board.getCurrentMessage());
        return res;
    }
}
