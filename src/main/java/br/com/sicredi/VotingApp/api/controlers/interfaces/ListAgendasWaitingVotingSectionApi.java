package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.CooperativeIdentification;
import io.swagger.annotations.*;
import org.openapitools.responses.AgendasWaitingVotingSection;
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
@Api(value = "list-agendas-waiting-voting-section")
public interface ListAgendasWaitingVotingSectionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /list-agendas-waiting-voting-section : LISTA DE PAUTAS AGUARDANDO SEÇÃO DE VOTAÇÃO
     * Lista de Pautas aguardando por associação a uma Seção de Votação.
     *
     * @param CooperativeIdentification (optional)
     * @return Lista de Pautas aguardando por associação a uma Seção de Votação. (status code 200)
     */
    @ApiOperation(value = "LISTA DE PAUTAS AGUARDANDO SEÇÃO DE VOTAÇÃO",
                  nickname = "postListAgendasWaitingVotingSection",
                  notes = "Lista de Pautas aguardando por associação a uma Seção de Votação.",
                  response = AgendasWaitingVotingSection.class, responseContainer = "List", tags = {"Seções",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Lista de Pautas aguardando por associação a uma Seção de Votação.",
                         response = AgendasWaitingVotingSection.class, responseContainer = "List")
    })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/list-agendas-waiting-voting-section",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    default ResponseEntity<List<AgendasWaitingVotingSection>> postListAgendasWaitingVotingSection(
            @ApiParam(value = "") @Valid @RequestBody(required = false)
                    CooperativeIdentification CooperativeIdentification) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"description\" : \"description\", \"id\" : \"id\" }";
                    org.openapitools.api.controlers.ApiUtil.setExampleResponse(request,
                                                                               "application/json",
                                                                               exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
