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
        alert("Formulário enviado com sucesso!");
        return true;
    }
}

function ValidarExcluir(){
    
    var confirmar = confirm("Tem certeza que deseja excluir o produto?");
    
    if(confirmar){
        
        alert("Produto excluido com sucesso!")
        return true;
    }
    
    return false;
}


function validarAtualizar(){
    
    var confirmar = confirm("Tem certeza que deseja atualizar o produto?");
    
    if(confirmar){
        
        alert("Produto atualizado com sucesso!")
        return true;
    }
    
    return false;
}
