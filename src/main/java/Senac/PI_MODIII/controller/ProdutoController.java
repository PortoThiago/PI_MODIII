/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Senac.PI_MODIII.controller;

import Senac.PI_MODIII.data.ProdutoEntity;
import Senac.PI_MODIII.data.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author thiag
 */

    
@RestController

@RequestMapping("/produto")

public class ProdutoController {

    @Autowired

    ProdutoService produtoService;

    @GetMapping("/listar")

    public ResponseEntity<List> getAllProdutos() {

        List<ProdutoEntity> produto = produtoService.listarTodosProdutos();

        return new ResponseEntity<>(produto, HttpStatus.OK);

    }

    @GetMapping("/pesquisar/{id}")

    public ResponseEntity<ProdutoEntity> getProdutoById(@PathVariable Integer id) {

        ProdutoEntity produtoId = produtoService.getProdutoId(id);

        return new ResponseEntity<>(produtoId, HttpStatus.OK);

    }

    @PostMapping("/adicionar")

    public ResponseEntity<ProdutoEntity> addProduto(@RequestBody ProdutoEntity produto) {

        var novoProduto = produtoService.cadastrarProduto(produto);

        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);

    }

    @PutMapping("/atualizar/{id}")

    public ResponseEntity<ProdutoEntity> atualizarProduto(@PathVariable Integer id, @RequestBody ProdutoEntity produto) {

        var produtoAtualizado = produtoService.atualizarProduto(id, produto);

        return new ResponseEntity<>(produtoAtualizado, HttpStatus.OK);

    }

    @DeleteMapping("/deletar/{id}")

    public ResponseEntity deletarProduto(@PathVariable Integer id) {

        produtoService.deletarProduto(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

}
