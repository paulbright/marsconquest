/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover.exceptions;

/**
 *
 * @author paulbright
 */
public class InvalidCommandException extends Exception{
    public InvalidCommandException(String msg) {
        super(msg);
    }
}
