package spring.boot.desafio.nubank.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContatoDTO {

    @NotBlank(message = "Telefone é obrigatorio")
    private String telefone;

    @NotBlank(message = "E-mail é obrigatorio")
    private String email;
    private Long clienteId;
}
