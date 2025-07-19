package org.app1.myfirstspringbootapp.Controllers;

import org.app1.myfirstspringbootapp.Model.Produtos;
import org.app1.myfirstspringbootapp.Service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produtos> listarProdutos(){
        return produtoService.listarProdutos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtos> buscarProduto(@PathVariable Long id){
        return produtoService.buscarPorID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Produtos criarProduto(@RequestBody Produtos produtos){
        produtoService.adicionarProduto(produtos);
        return produtos;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produtos> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }
}
