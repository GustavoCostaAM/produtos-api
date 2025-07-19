package org.app1.myfirstspringbootapp.Repository;

import org.app1.myfirstspringbootapp.Model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
}
