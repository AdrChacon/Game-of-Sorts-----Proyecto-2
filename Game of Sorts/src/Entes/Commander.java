/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entes;

/**
 *
 * @author Chacón Campos
 */
public class Commander extends Dragon{
    
    public Commander(int dragonNumber, Dragon parentDragon, int wave, int x, int y, int dragonAge, int dragonAS){
        super(x, y, "Commander", wave, dragonNumber, parentDragon, dragonAge, dragonAS);
        health = 5;
    }
    
}
