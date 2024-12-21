/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function validarForm() {

    var produto = document.getElementById("produto").value;
    var preco = document.getElementById("preco").value;
    var quantidade = document.getElementById("quantidade").value;

    if (produto === "" || preco === "" || quantidade === "") {
        alert("Todos os campos são obrigatórios!");
        return false;

    } else {
        alert("Produto salvo com sucesso!");
        return true;
    }
}

function ValidarExcluir() {
    
    var confirmar = confirm("Tem certeza que deseja excluir o produto?");
    
    if (confirmar) {
        alert("Produto excluído com sucesso!");
        return true; 
    }
    
    return false; 
}

function validar() {
    var produto = document.getElementById("produto").value;
    var preco = document.getElementById("preco").value;
    var quantidade = document.getElementById("quantidade").value;
    

    if (produto || preco || quantidade) {
        alert("Preencha todos os campos antes de atualizar.");
        return false;
    }

    if (confirm("Tem certeza que deseja atualizar o produto?")) {
        alert("Produto atualizado com sucesso!");
        return true;
    }

    return false;
}