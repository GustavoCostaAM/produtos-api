package org.app1.myfirstspringbootapp.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    public String Message(){
        return "Mensagem do Repositorio";
    }
}
