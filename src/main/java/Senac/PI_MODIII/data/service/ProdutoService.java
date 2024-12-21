/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Senac.PI_MODIII.data.service;

import Senac.PI_MODIII.data.ProdutoEntity;
import Senac.PI_MODIII.data.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author thiag
 */
@Service
public class ProdutoService {
    
    @Autowired
    
    ProdutoRepository ProdutoRepository;
    
    public ProdutoEntity cadastrarProduto(ProdutoEntity produto) {
        
        produto.setId(null);
        ProdutoRepository.save(produto);
        return produto;
    }
    
    public ProdutoEntity atualizarProduto(Integer produtoId, ProdutoEntity produtoRequest) {
        ProdutoEntity produto = getProdutoId(produtoId);
        produto.setTitulo(produtoRequest.getTitulo());
        produto.setPreco(produtoRequest.getPreco());
        produto.setQuantidade(produtoRequest.getQuantidade());
        produto.setObservacao(produtoRequest.getObservacao());
        
        ProdutoRepository.save(produto);
        return produto;
    }
    
    public ProdutoEntity getProdutoId(Integer produtoId) {
        return ProdutoRepository.findById(produtoId).orElse(null);
    }
    
    public List<ProdutoEntity> listarTodosProdutos() {
        return ProdutoRepository.findAll();
    }
    
    public void deletarProduto(Integer produtoId) {
        ProdutoEntity produto = getProdutoId(produtoId);
        ProdutoRepository.deleteById(produto.getId());
    }
}
