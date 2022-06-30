/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.models.Tbanswers;

/**
 *
 * @author LNdlovu
 */
@Stateless
public class TbanswersFacade extends AbstractFacade<Tbanswers> implements TbanswersFacadeLocal {
    @PersistenceContext(unitName = "DSDWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbanswersFacade() {
        super(Tbanswers.class);
    }
    
}
