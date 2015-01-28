
package Interfaz;
import Fichero.*;
import formulaURJC.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Calendar;


public class MenuPrincipal extends javax.swing.JFrame {
    
    /* ATRIBUTOS */
    public static ArrayList<Escuderia> escuderias = new ArrayList();
    public static ArrayList<Coche> coches = new ArrayList();
    public static Mundial mundial = new Mundial();
    public static ArrayList<Circuito> circuitos = new ArrayList();
    public static ArrayList<Piloto> pilotos = new ArrayList();
    public static ArrayList<Carrera> carreras = new ArrayList();
    
    
    public static void main(String args[]) {  
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    public MenuPrincipal() {
        cargarDatos();
        initComponents();
        this.setLocation(450, 100);
        //Fecha
        Calendar cal=Calendar.getInstance();
        String fecha = cal.get(cal.DATE)+"/"+cal.get(cal.MARCH)+"/"+cal.get(cal.YEAR);
        this.JLB_Fecha.setText(fecha);
    }

    
    /* Cargamos datos de fichero */
    private static void cargarDatos(){
        
        FEscuderia fE = new FEscuderia();
        FCircuito fC = new FCircuito();
        FPiloto fP = new FPiloto();
        FCoche fX = new FCoche();
        FCarrera fT = new FCarrera();
        try{
            escuderias = fE.leer();
            circuitos = fC.leer();
            pilotos = fP.leer();
            coches = fX.leer();
            carreras = fT.leer();
            
        }
        catch(Exception e){
            System.err.println("Error leyendo el archivo."+e);
        }
        
    }
    
    /* Guardamos los cambios que hayamos hecho */
    private void guardarCambios(){

        try{
            FEscuderia fE = new FEscuderia();
            FCircuito fC = new FCircuito();
            FPiloto fP = new FPiloto();
            FCoche fX = new FCoche();
            FCarrera fT = new FCarrera();
            fE.escribir(escuderias);
            fC.escribir(circuitos);
            fP.escribir(pilotos);
            fX.escribir(coches);
            fT.escribir(carreras);
        }
        catch(Exception e){
            System.err.println("Error escribiendo el fichero");
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDP_MenuPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        JLB_Fecha = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MGestionCarreras = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(858, 617));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JDP_MenuPrincipal.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JDP_MenuPrincipalAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JDP_MenuPrincipal.setLayout(null);

        jLabel1.setText("FECHA:");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/herramienta.png"))); // NOI18N
        jMenu1.setText("GESTIONES F1");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jMenuItem1.setText("Gestion Coches");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jMenuItem2.setText("Gestion Pilotos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jMenuItem3.setText("Gestion Escuderia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jMenuItem7.setText("Gestion Circuitos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        MGestionCarreras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        MGestionCarreras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        MGestionCarreras.setText("Gestion Carreras");
        MGestionCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGestionCarrerasActionPerformed(evt);
            }
        });
        jMenu1.add(MGestionCarreras);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Dinero.jpg"))); // NOI18N
        jMenu2.setText("MERCADO");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        jMenuItem6.setText("Fichaje");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        jMenuItem9.setText("Traspasos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CAMPEONATO");

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jMenuItem8.setText("Empezar Mundial");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jMenuItem12.setText("Vueltas de entrenamiento");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libros.png"))); // NOI18N
        jMenu4.setText("INFORMACION");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iformacion.png"))); // NOI18N
        jMenuItem10.setText("Escuderias");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iformacion.png"))); // NOI18N
        jMenuItem11.setText("Pilotos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLB_Fecha)
                .addContainerGap(915, Short.MAX_VALUE))
            .addComponent(JDP_MenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDP_MenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JLB_Fecha)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void JDP_MenuPrincipalAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JDP_MenuPrincipalAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JDP_MenuPrincipalAncestorAdded
        
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Submenu mercado
        SubMenuMercado smm = new SubMenuMercado();
        this.JDP_MenuPrincipal.add(smm);
        smm.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        SubMenuMercadoT smmt = new SubMenuMercadoT();
        this.JDP_MenuPrincipal.add(smmt);
        smmt.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
       SelEquipos smmt = new SelEquipos();
        this.JDP_MenuPrincipal.add(smmt);
        smmt.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    //INFORMACION ESCUDERIAS
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // Submenu Escuderias
        infoesc smc= new infoesc();
        this.JDP_MenuPrincipal.add(smc);
        smc.show(); 
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    //INFORMACION PILOTOS
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // Submenu Pilotos
        infopilo smc= new infopilo();
        this.JDP_MenuPrincipal.add(smc);
        smc.show(); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Submenu Escuderia
        SubMenuEscuderia sme = new SubMenuEscuderia();
        this.JDP_MenuPrincipal.add(sme);
        sme.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Submenu Circuito
        SubMenuCircuito smc = new SubMenuCircuito();
        this.JDP_MenuPrincipal.add(smc);
        smc.show();
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Submenu Pilotos
        SubMenuPilotos smp= new SubMenuPilotos();
        this.JDP_MenuPrincipal.add(smp);
        smp.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Submenu Coches
        SubMenuCoche smc= new SubMenuCoche();
        this.JDP_MenuPrincipal.add(smc);
        smc.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarCambios();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        SubMenuEntrenamiento sme= new SubMenuEntrenamiento();
        this.JDP_MenuPrincipal.add(sme);
        sme.show();
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void MGestionCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGestionCarrerasActionPerformed
        // TODO add your handling code here:
        SubMenuCarrera smcc = new SubMenuCarrera();
         this.JDP_MenuPrincipal.add(smcc);
            smcc.show();
        
    }//GEN-LAST:event_MGestionCarrerasActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane JDP_MenuPrincipal;
    private javax.swing.JLabel JLB_Fecha;
    private javax.swing.JMenuItem MGestionCarreras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
