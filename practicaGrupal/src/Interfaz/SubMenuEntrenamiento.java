
package Interfaz;

import formulaURJC.Circuito;
import formulaURJC.Coche;
import formulaURJC.Escuderia;
import formulaURJC.Oficial;
import formulaURJC.Piloto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;




public class SubMenuEntrenamiento extends javax.swing.JInternalFrame {

    public SubMenuEntrenamiento(){
       initComponents();

       cargarEntrenamiento();
    }
    
    //UPDATE
    private void cargarEntrenamiento(){
        cargarEscuderias();
        cargarCircuitos();
    }
    
    private void mostrarResultados(Piloto pil,Coche coc){
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Nombre: "+pil.getNombre()+"Valoracion: "+pil.getValoracionGlobal());
        modelo.addElement("Nombre: "+coc.getModelo()+"MAX Vel.Curvas : "+String.valueOf(coc.getVelocidadCurva())+"MAX Vel.Rectas"+coc.getVelocidadRecta());
        LResultado.setModel(modelo);
    }
    
    
    
    // COMENTADA A FALTA DE PILOTOS

    private void cargarCircuitos(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Circuito  cir: MenuPrincipal.circuitos)
            if (!cir.getNombre().isEmpty())
            modelo.addElement(cir.getNombre());
        CCircuito.setModel(modelo);
        CCircuito.setSelectedIndex(1);
    }
    
    private void cargarEscuderias(){

        DefaultListModel modelo = new DefaultListModel();
        for (Escuderia  esc: MenuPrincipal.escuderias){
            //esc.setCoche(MenuPrincipal.coches.get(0));
            modelo.addElement(esc.getNombre());
        }
        LEscuderia.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        LEscuderia = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        LCoche = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        LResultado = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        LPiloto = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        BEntrenar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        CCircuito = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Mercado");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LEscuderia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEscuderiaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(LEscuderia);

        jLabel6.setText("Escuderias");

        LCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCocheMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(LCoche);

        LResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LResultadoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(LResultado);

        jLabel1.setText("Piloto");

        jLabel3.setText("Coche");

        LPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LPilotoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(LPiloto);

        jLabel4.setText("Resultado");

        BEntrenar.setText("Entrenar");
        BEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrenarActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Circuito");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(CCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(BEntrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CCircuito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BEntrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Entrenamiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int opcion=JOptionPane.showConfirmDialog(null,"Realmente desea Salir","SALIR?",JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_NO_OPTION){
            this.dispose();
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void LEscuderiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEscuderiaMouseClicked
        // TODO add your handling code here:
        DefaultListModel modelop = new DefaultListModel();
        DefaultListModel modeloc = new DefaultListModel();
        Escuderia esc = MenuPrincipal.escuderias.get(LEscuderia.getSelectedIndex());
        for(Piloto pil: esc.getPilotos()){
            if(pil instanceof Oficial){
                modelop.addElement(pil.getNombre()+" "+pil.getValoracionGlobal()+" "+"Oficial");
            }else{
                modelop.addElement(pil.getNombre()+" "+pil.getValoracionGlobal()+" "+"Probador");
            }
        }
        for(Coche coc: esc.getCoches())  
                modeloc.addElement(coc.getModelo()+" "+coc.getVelocidadCurva()+" "+coc.getVelocidadRecta());
      
        LPiloto.setModel(modelop);
        LCoche.setModel(modeloc);

    }//GEN-LAST:event_LEscuderiaMouseClicked

    private void LCocheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCocheMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LCocheMouseClicked

    private void LResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LResultadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LResultadoMouseClicked

    private void LPilotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPilotoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LPilotoMouseClicked

    private void BEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrenarActionPerformed
        // TODO add your handling code here:
        
        Escuderia esc = MenuPrincipal.escuderias.get(LEscuderia.getSelectedIndex());
        ArrayList<Piloto> posip = new ArrayList<>(esc.getPilotos());
        ArrayList<Coche> posic = new ArrayList<>(esc.getCoches());
        List<Coche> posc = new ArrayList(esc.getCoches());
        Piloto piloto = posip.get(LPiloto.getSelectedIndex());
        Coche coche = posc.get(LCoche.getSelectedIndex());
        Circuito circuito = MenuPrincipal.circuitos.get(CCircuito.getSelectedIndex());
        esc.entrenar(circuito, coche, piloto);
       mostrarResultados(piloto,coche);

        
    }//GEN-LAST:event_BEntrenarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntrenar;
    private javax.swing.JComboBox CCircuito;
    private javax.swing.JList LCoche;
    private javax.swing.JList LEscuderia;
    private javax.swing.JList LPiloto;
    private javax.swing.JList LResultado;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
