package logic;

import model.Gift;

/**
 * Created by Maksim_Karatkevich on 6/13/2017.
 */
public interface Parser {

	Gift parse(String fileName);
}