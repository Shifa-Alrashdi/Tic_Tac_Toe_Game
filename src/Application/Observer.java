/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import Presentation.Board;

/**
 *
 * @author Administrator
 */
public abstract class Observer {
   protected Board subject;
   public abstract void update();
}
