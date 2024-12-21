/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Senac.PI_MODIII.controller;

import Senac.PI_MODIII.data.ProdutoEntity;
import Senac.PI_MODIII.data.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author thiag
 */
@Controller
public class FuncController {

    @Autowired
    ProdutoService produtoService;


    @GetMapping("/deletarProduto/{id}")
    public String deletarFilme(@PathVariable(value = "id") Integer id) {
        produtoService.deletarProduto(id);
        return "redirect:/listaProduto";
    }

    @GetMapping("/cadastroProduto")
    public String criarProdutoForm(Model model) {
        ProdutoEntity produto = new ProdutoEntity();
        model.addAttribute("produto", produto);
        return "cadastroProduto";
    }

    @GetMapping("/listaProduto")
    public String listarProdutoForm(Model model) {
        model.addAttribute("listaProduto", produtoService.listarTodosProdutos());
        return "listaProduto";
    }

    @PostMapping("/salvarProduto")
    public String salvarProduto(@Valid @ModelAttribute("produto") ProdutoEntity produto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("produto", produto);
            return "redirect:/";
        }
        if (produto.getId() == null) {
            produtoService.cadastrarProduto(produto);
             model.addAttribute("mensagem", "Produto cadastrado com sucesso!");
        } else {
            
            produtoService.atualizarProduto(produto.getId(), produto);
            model.addAttribute("mensagem", "Produto atualizado com sucesso!");

        }
        
        return "redirect:/listaProduto";
    }

    @GetMapping("/atualizarProdutoForm/{id}")
    public String atualizarProdutoForm(@PathVariable(value = "id") Integer id, Model model) {
        ProdutoEntity produto = produtoService.getProdutoId(id);
        model.addAttribute("produto", produto);
        return "atualizar";
    }
}
