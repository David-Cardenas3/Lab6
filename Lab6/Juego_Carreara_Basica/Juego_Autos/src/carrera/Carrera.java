package carrera;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread {

    //creamos las variables
    private JLabel etiqueta;
    private frmCarrera auto;

    //constructor
    public Carrera(JLabel etiqueta, frmCarrera auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }

    @Override
    public void run() {

        int auto1 = 0;
        int auto2 = 0;
        int auto3 = 0;
        int auto4 = 0;
        int auto5 = 0;
        int auto6 = 0;
        int auto7 = 0;
        int auto8 = 0;
        int auto9 = 0;
        int auto10 = 0;

        while (true) {
            try {

                sleep((int) (Math.random() * 1000));
                auto1 = auto.getAuto_1().getLocation().x;
                auto2 = auto.getAuto_2().getLocation().x;
                auto3 = auto.getAuto_3().getLocation().x;
                auto4 = auto.getAuto_4().getLocation().x;
                auto5 = auto.getAuto_5().getLocation().x;
                auto6 = auto.getAuto_6().getLocation().x;
                auto7 = auto.getAuto_7().getLocation().x;
                auto8 = auto.getAuto_8().getLocation().x;
                auto9 = auto.getAuto_9().getLocation().x;
                auto10 = auto.getAuto_10().getLocation().x;

                if (auto1 < auto.getBarrera().getLocation().x - 125 || auto2 < auto.getBarrera().getLocation().x - 125 || auto3 < auto.getBarrera().getLocation().x - 125
                        || auto4 < auto.getBarrera().getLocation().x - 125 || auto5 < auto.getBarrera().getLocation().x - 125 || auto6 < auto.getBarrera().getLocation().x - 125
                        || auto7 < auto.getBarrera().getLocation().x - 125 || auto8 < auto.getBarrera().getLocation().x - 125 || auto9 < auto.getBarrera().getLocation().x - 125
                        || auto10 < auto.getBarrera().getLocation().x - 125) {

                    etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                    auto.repaint();
                } else {
                    break;
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }

            if (etiqueta.getLocation().x >= auto.getBarrera().getLocation().x - 125) {

                if (auto1 > auto2 && auto1 > auto3 && auto1 > auto4 && auto1 > auto5 && auto1 > auto6 && auto1 > auto7
                        && auto1 > auto8 && auto1 > auto9 && auto1 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el primer auto");
                    
                } else if (auto2 > auto1 && auto2 > auto3 && auto2 > auto4 && auto2 > auto5 && auto2 > auto6 && auto2 > auto7
                        && auto2 > auto8 && auto2 > auto9 && auto2 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el segundo auto");
                    
                } else if (auto3 > auto1 && auto3 > auto2 && auto3 > auto4 && auto3 > auto5 && auto3 > auto6 && auto3 > auto7
                        && auto3 > auto8 && auto3 > auto9 && auto3 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Tercer auto");
                    
                } else if (auto4 > auto1 && auto4 > auto2 && auto4 > auto3 && auto4 > auto5 && auto4 > auto6 && auto4 > auto7
                        && auto4 > auto8 && auto4 > auto9 && auto4 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Cuarto auto");
                    
                } else if (auto5 > auto1 && auto5 > auto2 && auto5 > auto3 && auto5 > auto4 && auto5 > auto6 && auto5 > auto7
                        && auto5 > auto8 && auto5 > auto9 && auto5 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Quinto auto");
                    
                } else if (auto6 > auto1 && auto6 > auto2 && auto6 > auto3 && auto6 > auto4 && auto6 > auto5 && auto6 > auto7
                        && auto6 > auto8 && auto6 > auto9 && auto6 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Sexto auto");
                    
                } else if (auto7 > auto1 && auto7 > auto2 && auto7 > auto3 && auto7 > auto4 && auto7 > auto5 && auto7 > auto6
                        && auto7 > auto8 && auto7 > auto9 && auto7 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Septimo auto");
                    
                } else if (auto8 > auto1 && auto8 > auto2 && auto8 > auto3 && auto8 > auto4 && auto8 > auto5 && auto8 > auto6
                        && auto8 > auto7 && auto8 > auto9 && auto8 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Octavo auto");
                    
                } else if (auto9 > auto1 && auto9 > auto2 && auto9 > auto3 && auto9 > auto4 && auto9 > auto5 && auto9 > auto6
                        && auto9 > auto7 && auto9 > auto8 && auto9 > auto10) {
                    JOptionPane.showMessageDialog(null, "Gano el Noveno auto");
                    
                } else if (auto10 > auto1 && auto10 > auto2 && auto10 > auto3 && auto10 > auto4 && auto10 > auto5 && auto10 > auto6
                        && auto10 > auto7 && auto10 > auto8 && auto10 > auto9) {
                    JOptionPane.showMessageDialog(null, "Gano el Decimo auto");
                    
                } else {
                    JOptionPane.showMessageDialog(null, " Perdedores ");
                }
            }
        }

    }
}
