/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.models.Tbquestions;

/**
 *
 * @author LNdlovu
 */
@Local
public interface TbquestionsFacadeLocal {

    void create(Tbquestions tbquestions);

    void edit(Tbquestions tbquestions);

    void remove(Tbquestions tbquestions);

    Tbquestions find(Object id);

    List<Tbquestions> findAll();

    List<Tbquestions> findRange(int[] range);

    int count();
    
}
