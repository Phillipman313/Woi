/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package woc;

/**
 *
 * @author Sergio
 */
public class TownHall extends Building{

    public TownHall(String name, int id, int posX, int posY,  int currentHP, int maxHP, int level, Castle house) {
        super(name, id, posX, posY, 2, 2, currentHP, maxHP, level, house);
    }
    
}
