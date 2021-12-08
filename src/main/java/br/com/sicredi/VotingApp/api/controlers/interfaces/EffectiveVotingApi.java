package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.VoteInformation;
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
@Api(value = "effective-voting")
public interface EffectiveVotingApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /effective-voting : EFETIVA A VOTAÇÃO
     * Efetiva a votação do Cooperado na Pauta indicada. Se a efetivação do voto for bem secedida o status do Associado é modificado de forma que não poderá mais votar nessa mesma Pauta. Além disso, a contabilização dos votos é atualizada.
     *
     * @param voteInformation Informações do Voto realizado. (optional)
     * @return Criado com sucesso. (status code 201)
     * or Assinatura Digital não validada. (status code 403)
     * or Pauta indicada não encontrada. (status code 404)
     */
    @ApiOperation(value = "EFETIVA A VOTAÇÃO", nickname = "postEffectiveVoting",
                  notes = "Efetiva a votação do Cooperado na Pauta indicada. Se a efetivação do voto for bem secedida o status do Associado é modificado de forma que não poderá mais votar nessa mesma Pauta. Além disso, a contabilização dos votos é atualizada.",
                  tags = {"votação",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Criado com sucesso."),
            @ApiResponse(code = 403, message = "Assinatura Digital não validada."),
            @ApiResponse(code = 404, message = "Pauta indicada não encontrada.")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/effective-voting",
            consumes = {"application/json"}
    )
    default ResponseEntity<Void> postEffectiveVoting(
            @ApiParam(value = "Informações do Voto realizado.") @RequestBody(required = false) @Valid
                    VoteInformation voteInformation) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
