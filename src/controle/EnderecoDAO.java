/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Endereco;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author bieuu
 */
public class EnderecoDAO {
  private final Session sessao;

    public EnderecoDAO() {
        this.sessao = NovoHibernateUtil.getSessionFactory().openSession();
    }
    public void salvar(Endereco cli){
        Transaction t = sessao.beginTransaction();
        sessao.save(cli);
        t.commit();
    }
       
}
