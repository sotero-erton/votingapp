package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.CooperativeIdentification;
import io.swagger.annotations.*;
import org.openapitools.api.controlers.ApiUtil;
import org.openapitools.responses.MyAgendas;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Validated
@Api(value = "list-my-agendas")
public interface ListMyAgendasApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /list-my-agendas : LISTA PAUTAS DO ASSOCIADO
     * Lista Pautas originalmente criadas por um Associado.
     *
     * @param cooperativeIdentification (optional)
     * @return Listda de Pautas pertecentes a um Associado. (status code 200)
     */
    @ApiOperation(value = "LISTA PAUTAS DO ASSOCIADO", nickname = "postListMyAgendas",
                  notes = "Lista Pautas originalmente criadas por um Associado.", response = MyAgendas.class,
                  responseContainer = "List", tags = {"MinhasPautas",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Listda de Pautas pertecentes a um Associado.",
                         response = MyAgendas.class, responseContainer = "List")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/list-my-agendas",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    default ResponseEntity<List<MyAgendas>> postListMyAgendas(
            @ApiParam(value = "") @RequestBody(required = false)
            @Valid CooperativeIdentification cooperativeIdentification) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString =
                            "{ \"end-date\" : \"end-date\", \"votes-no\" : \"votes-no\", \"start-time\" : \"start-time\", \"end-time\" : \"end-time\", \"votes-yes\" : \"votes-yes\", \"description\" : \"description\", \"start-date\" : \"start-date\", \"id\" : \"id\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request,
                                               "application/json",
                                               exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
