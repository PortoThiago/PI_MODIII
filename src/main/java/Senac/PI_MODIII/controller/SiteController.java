/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Senac.PI_MODIII.controller;

/**
 *
 * @author thiag
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteController {
   @GetMapping("/")
    public String index() {
        return "index"; 
    }
    
    @GetMapping("/cadastroProduto")
    public String cadastroProduto(){
        return "cadastroProduto";
    }
    
    @GetMapping("/listaProduto")
    public String listaProduto(){
        return "listaProduto";
    }
    
     @GetMapping("/atualizarProduto")
    public String atualizarProduto(){
        return "atualizar";
    }
}
