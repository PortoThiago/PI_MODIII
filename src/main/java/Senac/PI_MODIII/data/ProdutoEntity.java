/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Senac.PI_MODIII.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author thiag
 */
@Data
@Entity
@Table(name="produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @NotBlank @NotNull (message="o campo Produto não pode ser nulo")
    private String titulo;
    
    @NotBlank @NotNull (message="o campo Preço não pode ser nulo")
    private String Preço;
    
    @NotBlank @NotNull (message="o campo Quantidade não pode ser nulo")
    private String quantidade;
    
    private String Observação;
    
    
}