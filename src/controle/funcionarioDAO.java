/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Funcionario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author bieuu
 */
public class funcionarioDAO {
    private final Session sessao;
    
    public funcionarioDAO() {
        this.sessao = NovoHibernateUtil.getSessionFactory().openSession();
    }
    public void salvar (Funcionario fun){
        Transaction t = sessao.beginTransaction();
        sessao.save(fun);
        t.commit();
    }
    
    public Funcionario buscaFuncionario(int codigo){
        String sql = "from Funcionario where idfuncionario = :cod";
        Query query = sessao.createQuery(sql);
        query.setInteger("cod", codigo);
        Funcionario funcionario = (Funcionario) query.uniqueResult();
        return funcionario;
    }
}
