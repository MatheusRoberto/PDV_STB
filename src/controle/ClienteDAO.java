/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Cliente;
import java.sql.Connection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author bieuu
 */
public class ClienteDAO {
    private final Session sessao;

    public ClienteDAO() {
        this.sessao = NovoHibernateUtil.getSessionFactory().openSession();
    }
    public void salvar(Cliente cli){
        Transaction t = sessao.beginTransaction();
        sessao.save(cli);
        t.commit();
    }

    public List<Cliente> buscacliente(String texto) {
    String sql = "from Cliente where nome like :texto or razaoSocial like :texto";
        Query query = sessao.createQuery(sql);
        texto = '%'+texto+'%';
        query.setString("texto", texto);
        List<Cliente>vetorClientes;
        vetorClientes = (List<Cliente>)query.list();
       
        return vetorClientes;   
    }

    public Cliente buscaCodigo(int codigo){
        String sql = "from Cliente where IdCliente = :cod";
        Query query = sessao.createQuery(sql);
        query.setInteger("cod", codigo);
        Cliente cliente = (Cliente) query.uniqueResult();
        return cliente;
    }
    
}
