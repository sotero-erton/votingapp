package br.com.sicredi.VotingApp.api.controlers.interfaces;

import br.com.sicredi.VotingApp.requests.PollingSectionInformation;
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
@Api(value = "create-new-voting-section")
public interface CreateNewVotingSectionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /create-new-voting-section : CRIA UMA NOVA PAUTA
     * Cria uma nova Seção de Votação com uma Pauta associada a ela.  A nova Seção de Votação só será criada se a Chave de Autorização para criação de Seções informada pelo usuário for válida.
     *
     * @param PollingSectionInformation Informações da Seção de Votação. (optional)
     * @return Criado com sucesso. (status code 201)
     */
    @ApiOperation(value = "CRIA UMA NOVA PAUTA", nickname = "postCreateNewVotingSection",
                  notes = "Cria uma nova Seção de Votação com uma Pauta associada a ela.  A nova Seção de Votação só será criada se a Chave de Autorização para criação de Seções informada pelo usuário for válida.",
                  tags = {"Seções",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Criado com sucesso.")})
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/create-new-voting-section",
            consumes = {"application/json"}
    )
    default ResponseEntity<Void> postCreateNewVotingSection(
            @ApiParam(value = "Informações da Seção de Votação.") @Valid @RequestBody(required = false)
                    PollingSectionInformation PollingSectionInformation) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
