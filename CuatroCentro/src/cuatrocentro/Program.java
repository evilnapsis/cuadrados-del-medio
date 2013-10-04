/*
 * Programa para calcular numeros aleatorios apartir del metodo de los 4 del medio
 * Descargar de : http://github.com/evilnapsis/cuatro-del-medio
 * 2 de octubre del 2013.
 */
package cuatrocentro;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Program extends javax.swing.JFrame {

    public Program() {
        initComponents();
        modelo = new DefaultTableModel();
        String[] columns = {"n","x0","Operacion","RND"};
        modelo.setColumnIdentifiers(columns);
        tablasevalores.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        seedfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablasevalores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Escribir Semilla :");

        jButton1.setText("Generar Numeros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablasevalores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablasevalores);

        jLabel3.setText("Agustin Ramos Escalante (@evilnapsis)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seedfield, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seedfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(seedfield.getText().length()>0 && Integer.parseInt(seedfield.getText())>999 && Integer.parseInt(seedfield.getText())<=10000){
        Searchr.init();

            boolean is_number = true;
            
            try{
            int a;
                a = Integer.parseInt(seedfield.getText().toString());
            }
            catch(java.lang.NumberFormatException nfe){
                JOptionPane.showMessageDialog(rootPane, "No se puede procesar tu entrada, debes escribir caracteres numericos !");
                is_number = false;
            }

            if(is_number==true){
            modelo = new DefaultTableModel();
            int contador=0;
            int xaux = 0;
            String cadena = "";
            String[] columnas = {"n","x0","Operacion","RND"};
            modelo.setColumnIdentifiers(columnas);
            modelo.setColumnIdentifiers(columnas);
            int seed = Integer.parseInt(seedfield.getText());
            xaux = seed;
            int copia = seed;
            while(true){
                int op = (seed*seed);
                char[] numeros = (""+op).toCharArray();
                
                int longitud = numeros.length;
                System.out.println(""+longitud);
                if(longitud==4){ seed = op ;}
                else if(longitud==1){ 
                     cadena = "" + 0 + "" +0 + "" +0+ ""+numeros[0];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==2){ 
                     cadena = "" + 0 + "" +0 + "" + numeros[0]+ ""+numeros[1];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==3){ 
                     cadena = "" + 0 + "" + numeros[0] + "" + numeros[1]+ ""+numeros[2];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==5){ 
                     cadena = "" + numeros[0] + "" + numeros[1] + "" + numeros[2]+ ""+numeros[3];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==6){ 
                     cadena = "" + numeros[1] + "" + numeros[2] + "" + numeros[3]+ ""+numeros[4];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==7){ 
                    cadena = "" + numeros[1] + "" + numeros[2] + "" + numeros[3]+ ""+numeros[4];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==8){ 
                     cadena = "" + numeros[2] + "" + numeros[3] + "" + numeros[4]+ ""+numeros[5];
                    seed = Integer.parseInt(cadena);
                }
                modelo.addRow(new Object[]{contador,xaux,op,cadena});
                xaux = seed;
                if(seed==copia){
                    JOptionPane.showMessageDialog(rootPane, "la semilla inicial \""+copia+"\" se repite en : " + contador);                    
                    break; }
                else if(seed==0){
                    JOptionPane.showMessageDialog(rootPane, "el ciclo termina en 000 : " + contador);
                    break; }
                if(Searchr.isEmpty()){
                    Searchr.add(cadena);
                }else{
                    if(!Searchr.ifExist(cadena)){
                        Searchr.add(cadena);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "El numero se repite en "+ contador);
                        break;
                    }
                }
                
                contador++;
            }
            tablasevalores.setModel(modelo);
        }
        }
        else if(seedfield.getText().length()==0){
        JOptionPane.showMessageDialog(rootPane, "No debes dejar el campo de semilla vacio.");
        }
        else if(Integer.parseInt(seedfield.getText())<=999||Integer.parseInt(seedfield.getText())>=10000){
        JOptionPane.showMessageDialog(rootPane, "El campo de la semilla debe ser de 4 digitos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static DefaultTableModel modelo;
    
public static Program isn;
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Program.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                isn = new Program();
                isn.setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField seedfield;
    private javax.swing.JTable tablasevalores;
    // End of variables declaration//GEN-END:variables
}
