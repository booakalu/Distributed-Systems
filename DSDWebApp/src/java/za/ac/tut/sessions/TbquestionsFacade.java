/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.models.Tbquestions;

/**
 *
 * @author LNdlovu
 */
@Stateless
public class TbquestionsFacade extends AbstractFacade<Tbquestions> implements TbquestionsFacadeLocal {
    @PersistenceContext(unitName = "DSDWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbquestionsFacade() {
        super(Tbquestions.class);
    }
    
}
