package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.InformationForDeletingAgenda;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@Validated
@Api(value = "delete-agenda-not-voted")
public interface DeleteAgendaNotVotedApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /delete-agenda-not-voted : EXCLUI AGENDA AINDA NÃO VOTADA
     * Efetua a exclusão da uma Agenda ainda não votada. Será validado se a Pauta pertence ao Assotiado que está solicitando a exclusão.
     *
     * @param informationForDeletingAgenda Informações para exclusão de Pauta. (optional)
     * @return OK (status code 200)
     * or Pauta indicada não encontrada. (status code 404)
     */
    @ApiOperation(value = "EXCLUI AGENDA AINDA NÃO VOTADA", nickname = "postDeleteAgendaNotVoted",
                  notes = "Efetua a exclusão da uma Agenda ainda não votada. Será validado se a Pauta pertence ao Assotiado que está solicitando a exclusão.",
                  tags = {"MinhasPautas",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Pauta indicada não encontrada.")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/delete-agenda-not-voted",
            consumes = {"application/json"}
    )
    default ResponseEntity<Void> postDeleteAgendaNotVoted(
            @ApiParam(value = "Informações para exclusão de Pauta.") @RequestBody(required = false) @Valid
                    InformationForDeletingAgenda informationForDeletingAgenda) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
