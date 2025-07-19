package org.app1.myfirstspringbootapp.Service;

import org.app1.myfirstspringbootapp.Model.Produtos;
import org.app1.myfirstspringbootapp.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

     public List<Produtos> listarProdutos(){
        return produtoRepository.findAll();
     }

     public Optional<Produtos> buscarPorID(Long id){
        return produtoRepository.findById(id);
     }

     public Produtos adicionarProduto(Produtos produto){
        return produtoRepository.save(produto);
     }

     public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
     }

}
