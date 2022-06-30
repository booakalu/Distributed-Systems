/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.sessions;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.models.Tbanswers;

/**
 *
 * @author LNdlovu
 */
@Local
public interface TbanswersFacadeLocal {

    void create(Tbanswers tbanswers);

    void edit(Tbanswers tbanswers);

    void remove(Tbanswers tbanswers);

    Tbanswers find(Object id);

    List<Tbanswers> findAll();

    List<Tbanswers> findRange(int[] range);

    int count();
    
}
