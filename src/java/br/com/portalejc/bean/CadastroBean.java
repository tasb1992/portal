/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.portalejc.bean;

import br.com.portalejc.entidade.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class CadastroBean {
    private Pessoa jovem = new Pessoa();
    private List<Pessoa> jovens = new ArrayList<Pessoa>();
    
    public void adicionar(){
        jovens.add(jovem);
        jovem = new Pessoa();
    }

    public Pessoa getJovem() {
        return jovem;
    }

    public void setJovem(Pessoa jovem) {
        this.jovem = jovem;
    }

    public List<Pessoa> getJovens() {
        return jovens;
    }

    public void setJovens(List<Pessoa> jovens) {
        this.jovens = jovens;
    }
    
}
