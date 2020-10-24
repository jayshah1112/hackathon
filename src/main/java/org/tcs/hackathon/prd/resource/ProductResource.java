package org.tcs.hackathon.prd.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.bson.types.ObjectId;
import org.tcs.hackathon.prd.model.Product;

@Path("/product")
@Consumes("application/json")
@Produces("application/json")
public class ProductResource {
	
	  @GET
	    public List<Product> list() {
	        return Product.listAll();
	    }

	    @GET
	    @Path("/{id}")
	    public Product get(@PathParam("id") String id) {
	        return Product.findById(new ObjectId(id));
	    }

	    @POST
	    public Response create(Product Product) {
	        Product.persist();
	        return Response.status(201).build();
	    }

	    @PUT
	    @Path("/{id}")
	    public void update(@PathParam("id") String id, Product Product) {
	        Product.update();
	    }


	    @GET
	    @Path("/search/{title}")
	    public Product search(@PathParam("title") String title) {
	        return Product.findByTitle(title);
	    }

	    @GET
	    @Path("/count")
	    public Long count() {
	        return Product.count();
	    }
	    
	    @DELETE
	    @Path("/{id}")
	    public void delete(@PathParam("id") String id) {
	        Product product = Product.findById(new ObjectId(id));
	        product.delete();
	    }
	    
	    
	
}
