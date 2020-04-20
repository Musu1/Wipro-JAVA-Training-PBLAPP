package live;
import music.string.*;
import music.wind.*;

import music.Playable;
public class Test {
	public static void main(String args[]) {
	Veena v = new Veena();
    saxophone s = new saxophone();
    Playable pv, ps; 
    pv = new Veena();
    ps = new saxophone();
    
    v.play();
    s.play();
    
    pv.play(); 
    ps.play();
}
}