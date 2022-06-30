/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.models.Tbwrittentests;

/**
 *
 * @author LNdlovu
 */
@Local
public interface TbwrittentestsFacadeLocal {

    void create(Tbwrittentests tbwrittentests);

    void edit(Tbwrittentests tbwrittentests);

    void remove(Tbwrittentests tbwrittentests);

    Tbwrittentests find(Object id);

    List<Tbwrittentests> findAll();

    List<Tbwrittentests> findRange(int[] range);

    int count();
    
}
