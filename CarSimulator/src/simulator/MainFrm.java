/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author aaa
 */
public class MainFrm extends javax.swing.JFrame {

    /**
     * Creates new form MainFrm
     */
    public MainFrm() {
        super("Car Simulator");
        super.setIconImage(Toolkit.getDefaultToolkit().getImage("bugatti.jpg"));
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartButton = new javax.swing.JButton();
        speedometer = new eu.hansolo.steelseries.gauges.Radial();
        tachometer = new eu.hansolo.steelseries.gauges.Radial();
        Przyspiesz = new javax.swing.JButton();
        Hamuj = new javax.swing.JButton();
        ChangeGearUp = new javax.swing.JButton();
        ChangeGearDown = new javax.swing.JButton();
        CurrentGear = new eu.hansolo.steelseries.gauges.DisplayCircular();
        CarChoosing = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartButton.setBackground(new java.awt.Color(241, 240, 240));
        StartButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        StartButton.setText("Uruchom / Wyłącz");
        StartButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        StartButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StartButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                StartButtonKeyReleased(evt);
            }
        });

        speedometer.setBackgroundColor(eu.hansolo.steelseries.tools.BackgroundColor.CARBON);
        speedometer.setForegroundType(eu.hansolo.steelseries.tools.ForegroundType.FG_TYPE5);
        speedometer.setFrameDesign(eu.hansolo.steelseries.tools.FrameDesign.CHROME);
        speedometer.setFrameEffect(eu.hansolo.steelseries.tools.FrameEffect.EFFECT_TORUS);
        speedometer.setMaxValue(300);
        speedometer.setTitle("Velocity");
        speedometer.setUnitString("km/h");
        speedometer.setUserLedColor(eu.hansolo.steelseries.tools.LedColor.GREEN_LED);
        speedometer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                speedometerKeyPressed(evt);
            }
        });

        tachometer.setBackgroundColor(eu.hansolo.steelseries.tools.BackgroundColor.BROWN);
        tachometer.setForegroundType(eu.hansolo.steelseries.tools.ForegroundType.FG_TYPE4);
        tachometer.setFrameDesign(eu.hansolo.steelseries.tools.FrameDesign.GLOSSY_METAL);
        tachometer.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.BLUE_LCD);
        tachometer.setMaxValue(rpm);
        tachometer.setTitle("Rpm");
        tachometer.setUnitString("");
        tachometer.setUserLedBlinking(true);
        tachometer.setUserLedColor(eu.hansolo.steelseries.tools.LedColor.ORANGE_LED);

        Przyspiesz.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Przyspiesz.setText("Przyspiesz");
        Przyspiesz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        Przyspiesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyspieszActionPerformed(evt);
            }
        });

        Hamuj.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Hamuj.setText("Hamuj");
        Hamuj.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));

        ChangeGearUp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ChangeGearUp.setText("Gear Up");
        ChangeGearUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));

        ChangeGearDown.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ChangeGearDown.setText("Gear Down");
        ChangeGearDown.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));

        CurrentGear.setBackgroundColor(eu.hansolo.steelseries.tools.BackgroundColor.BEIGE);
        CurrentGear.setFrameEffect(eu.hansolo.steelseries.tools.FrameEffect.EFFECT_CONE);
        CurrentGear.setFrameType(eu.hansolo.steelseries.tools.FrameType.SQUARE);
        CurrentGear.setGlowing(true);
        CurrentGear.setLcdColor(eu.hansolo.steelseries.tools.LcdColor.REDDARKRED_LCD);
        CurrentGear.setLcdUnitString("");
        CurrentGear.setTitle("Gear");
        CurrentGear.setTitleAndUnitFont(CurrentGear.getTitleAndUnitFont().deriveFont(CurrentGear.getTitleAndUnitFont().getSize()+19f));
        CurrentGear.setTransparentSectionsEnabled(true);
        CurrentGear.setUnitString("");
        CurrentGear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CurrentGearKeyReleased(evt);
            }
        });

        CarChoosing.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CarChoosing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford Fusion", "Lamborghini Gallardo", "Chevrolet Cruze" }));
        CarChoosing.setBorder(null);
        CarChoosing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarChoosingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tachometer, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(CurrentGear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(speedometer, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChangeGearDown, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(ChangeGearUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CarChoosing, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Przyspiesz, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(Hamuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(speedometer, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tachometer, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(CurrentGear, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ChangeGearUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Przyspiesz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChangeGearDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hamuj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CarChoosing, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        if (flag) {
            a = new aTask();
            a.execute();
            flag = false;
        } else {
            a.cancel(true);
            flag = true;
        }
    }//GEN-LAST:event_StartButtonActionPerformed

    private void speedometerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_speedometerKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_UP)
        {
            
            j+=0.1;
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
            j-=0.1;
            
        }
    }//GEN-LAST:event_speedometerKeyPressed

    private void StartButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StartButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP)
        {
            
            j+=(0.2+acceleration);
            if(j>=maxVelocity)
                j=maxVelocity;
                
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
            j-=(0.2+acceleration);
            if(j<0)
                j=0;
            
        }
        
    }//GEN-LAST:event_StartButtonKeyPressed

    private void StartButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StartButtonKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_A)
        {
            
            bieg+=1;
            if(bieg>=maxBieg)
                bieg=maxBieg;
        }
        if (evt.getKeyCode() == KeyEvent.VK_D)
        {
            
            bieg-=1;
            if(bieg<1)
                bieg = 1;
            
        }
    }//GEN-LAST:event_StartButtonKeyReleased

    private void CurrentGearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurrentGearKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_A)
        {
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_D)
        {
            
        }
    }//GEN-LAST:event_CurrentGearKeyReleased

    private void CarChoosingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarChoosingActionPerformed
        String samochod = (String) ((JComboBox)evt.getSource()).getSelectedItem();
        switch(samochod){
                case "Ford Fusion":
                    maxVelocity = 170;
                    acceleration = 0.1;
                    maxBieg = 5;
                    rpm = 6500;
                    break;
                case "Lamborghini Gallardo":
                    maxVelocity = 300;
                    acceleration = 0.8;
                    maxBieg = 8;
                    rpm = 9000;
                    break;
                case "Chevrolet Cruze":
                    maxVelocity = 200;
                    acceleration = 0.2;
                    maxBieg = 6;
                    rpm = 7000;
                    break;
        }
    }//GEN-LAST:event_CarChoosingActionPerformed

    private void PrzyspieszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyspieszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrzyspieszActionPerformed
    private class CarHandler
            {
            public CarHandler(int samochod)
            {
                this.samochod = samochod;
            }
            
            private int samochod; 
            }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
           
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        ArrayList<Car> samochody = new ArrayList();
        samochody.add(new Car("Ford Fusion", 170, 7000));
        samochody.add(new Car("Lamborghini gallardo", 300, 9000));
        samochody.add(new Car("Chevrolet Cruze", 200, 8000));
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrm().setVisible(true);
            }
        });
    }
    
    private class aTask extends SwingWorker<Void, Double> {

        @Override
        protected Void doInBackground() throws InterruptedException {
            try {
                while (!flag) {
                    
                    publish(new Double(j));
                    Thread.sleep(500);
                }
            } catch (InterruptedException ex) {
            }
            return null;
        }

        @Override
        protected void done() {
        }

        @Override
        protected void process(List<Double> v) {
            
            double d  = v.get(v.size() - 1);
            speedometer.setValueAnimated(d);
            tachometer.setValueAnimated((d*50+1500)/bieg);
            CurrentGear.setLcdValue(bieg);
        }
    } 
    
    aTask a;
    boolean flag = true;
    static double acceleration;
    
    static int rpm = 9000;
    static int i = 1;
    static double j = 1;
    static int bieg = 1;
    static int maxBieg = 5;
    static int maxVelocity = 170;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CarChoosing;
    private javax.swing.JButton ChangeGearDown;
    private javax.swing.JButton ChangeGearUp;
    public eu.hansolo.steelseries.gauges.DisplayCircular CurrentGear;
    private javax.swing.JButton Hamuj;
    private javax.swing.JButton Przyspiesz;
    private javax.swing.JButton StartButton;
    private eu.hansolo.steelseries.gauges.Radial speedometer;
    private eu.hansolo.steelseries.gauges.Radial tachometer;
    // End of variables declaration//GEN-END:variables
}
