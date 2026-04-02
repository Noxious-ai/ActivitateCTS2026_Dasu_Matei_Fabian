package ro.ase.cts.builder;

import java.util.ArrayList;
import java.util.List;

public class HolidayPackage implements AbstractHolidayPackage{
    protected Cazare cazare;
    protected ActivitateExtra activitateExtra;
    protected Transport transport;

    List<ActivitateExtra> listaActivitati = new ArrayList<>();


    public void setCazare(Cazare cazare) {
        this.cazare = cazare;
    }

    public void setActivitateExtra(ActivitateExtra activitateExtra) {
        this.activitateExtra = activitateExtra;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void adaugaListaActivitati(ActivitateExtra activitateExtra) {
        this.listaActivitati.add(activitateExtra);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cazare: ").append(cazare.toString());
        sb.append("Transport: ").append(transport.toString());
        for (ActivitateExtra activitateExtra: listaActivitati){
            sb.append("O activitate: ").append(activitateExtra.toString());
        }
        System.out.println(sb.toString());
    }



    public class PachetBuilder implements AbstractBuilder{
        HolidayPackage holidayPackage;


        public PachetBuilder(HolidayPackage holidayPackage) {
            this.holidayPackage = holidayPackage;
        }

        @Override
        public HolidayPackage build() {
            return this.holidayPackage;
        }


    }
}
