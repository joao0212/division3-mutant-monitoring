package com.br.division3;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mutants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MutantResource {

    @Inject
    MutantDAO mutantDAO;

    @GET
    public List<Mutant> findAll() {
        return mutantDAO.findAll().all();
    }

    @POST
    public void save(Mutant mutant) {
        mutantDAO.save(mutant);
    }
}
