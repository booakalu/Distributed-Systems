/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.models.Tbwebtests;

/**
 *
 * @author LNdlovu
 */
@Stateless
public class TbwebtestsFacade extends AbstractFacade<Tbwebtests> implements TbwebtestsFacadeLocal {
    @PersistenceContext(unitName = "DSDWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbwebtestsFacade() {
        super(Tbwebtests.class);
    }
    
}
