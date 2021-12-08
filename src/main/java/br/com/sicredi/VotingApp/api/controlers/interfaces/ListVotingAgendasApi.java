package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.CooperativeIdentification;
import io.swagger.annotations.*;
import org.openapitools.api.controlers.ApiUtil;
import org.openapitools.responses.VotingAgendas;
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
@Api(value = "list-voting-agendas")
public interface ListVotingAgendasApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /list-voting-agendas : LISTA DE PAUTAS PARA VOTAÇÃO
     * Retorna a Lista de Pautas, ainda não votadas pelo Cooperado, que fazem parte de Seções de Votação abertas e ainda não finalizadas.  A habilitação para votação do Cooperado (se o Cooperado possui permissão para voração naquele momento) é verificada. Para isso existe uma integrar interna com um sistema que verifique, a partir do CPF do associado, se ele pode votar.
     *
     * @param cooperativeIdentification (optional)
     * @return Lista de Pautas que fazem parte de Seções de Votação abertas num dado momento (status code 200)
     */
    @ApiOperation(value = "LISTA DE PAUTAS PARA VOTAÇÃO", nickname = "postListVotingAgendas",
                  notes = "Retorna a Lista de Pautas, ainda não votadas pelo Cooperado, que fazem parte de Seções de Votação abertas e ainda não finalizadas.  A habilitação para votação do Cooperado (se o Cooperado possui permissão para voração naquele momento) é verificada. Para isso existe uma integrar interna com um sistema que verifique, a partir do CPF do associado, se ele pode votar. ",
                  response = VotingAgendas.class, responseContainer = "List", tags = {"votação",})
    @ApiResponses(value = {
            @ApiResponse(code = 200,
                         message = "Lista de Pautas que fazem parte de Seções de Votação abertas num dado momento",
                         response = VotingAgendas.class, responseContainer = "List")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/list-voting-agendas",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    default ResponseEntity<List<VotingAgendas>> postListVotingAgendas(
            @ApiParam(value = "") @Valid @RequestBody(required = false)
                    CooperativeIdentification cooperativeIdentification) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString =
                            "{ \"closing-time\" : \"closing-time\", \"description\" : \"description\", \"id\" : \"id\", \"closing-date\" : \"closing-date\" }";
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
