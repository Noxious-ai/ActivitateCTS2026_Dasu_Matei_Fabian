package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        StatieAutobuz romana = new StatieAutobuz("Romana", 2);
        StatieAutobuz universitate = new StatieAutobuz("Universitate", 0);

        MijlocDeTransport autobuz1 = new Autobuz(3, 335);
        MijlocDeTransport autobuz2 = new Autobuz(0, 226);


        autobuz1.opresteInStatie(romana);
        autobuz2.opresteInStatie(universitate);

        MijlocDeTransport autobuzNoapte1 = new AutobuzDeNoapte(autobuz1);
        MijlocDeTransport autobuzNoapte2 = new AutobuzDeNoapte(autobuz2);

        autobuzNoapte1.opresteInStatie(romana);
        autobuzNoapte1.opresteInStatie(universitate);

        autobuzNoapte2.opresteInStatie(romana);
        autobuzNoapte2.opresteInStatie(universitate);

        MijlocDeTransport autobuzSpecial = new AutobuzSpecial(autobuz1);

        autobuzSpecial.opresteInStatie(romana);
        autobuzSpecial.opresteInStatie(universitate);
    }
}