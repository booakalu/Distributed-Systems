/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.models.Tbwebtests;

/**
 *
 * @author LNdlovu
 */
@Local
public interface TbwebtestsFacadeLocal {

    void create(Tbwebtests tbwebtests);

    void edit(Tbwebtests tbwebtests);

    void remove(Tbwebtests tbwebtests);

    Tbwebtests find(Object id);

    List<Tbwebtests> findAll();

    List<Tbwebtests> findRange(int[] range);

    int count();
    
}
