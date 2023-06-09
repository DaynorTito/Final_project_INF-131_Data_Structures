/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_lab131;
import Estructuras.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.*;
/**
 *
 * @author DAYNOR
 */
public class VentanaPuestosProMen extends javax.swing.JFrame {
    private String tipoMer, sector, nomMer;
    private CSimpleMercadoMin mercadosMino;
    private PilaMercadoMay mercadosMay;
    private CCircularPro prodGral = new CCircularPro();

    public String getNomMer() {
        return nomMer;
    }

    public void setNomMer(String nomMer) {
        this.nomMer = nomMer;
    }

    public CCircularPro getProdGral() {
        return prodGral;
    }

    public void setProdGral(CCircularPro prodGral) {
        this.prodGral = prodGral;
    }

    public void setMercadosMay(PilaMercadoMay mercadosMay) {
        this.mercadosMay = mercadosMay;
    }

    public PilaMercadoMay getMercadosMay() {
        return mercadosMay;
    }
    public void setTipoMer(String tipoMer) {
        this.tipoMer = tipoMer;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setMercadosMino(CSimpleMercadoMin mercadosMino) {
        this.mercadosMino = mercadosMino;
    }

  

    public String getTipoMer() {
        return tipoMer;
    }

    public String getSector() {
        return sector;
    }

    public CSimpleMercadoMin getMercadosMino() {
        return mercadosMino;
    }

    /**
     * Creates new form VentanaPuestosProMen
     */
    public VentanaPuestosProMen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public VentanaPuestosProMen(String tip) {
        initComponents();
        this.setLocationRelativeTo(null);
        tipoMer = tip;
        sector="";
    }
    public VentanaPuestosProMen(String tip, String nomMer) {
        initComponents();
        this.setLocationRelativeTo(null);
        tipoMer = tip;
        this.nomMer=nomMer;
        this.sector = "";
    }
    public VentanaPuestosProMen(String tip, String nomMer, String sec) {
        initComponents();
        this.setLocationRelativeTo(null);
        tipoMer = tip;
        this.nomMer=nomMer;
        this.sector=sec;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaIdPuestos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 208, 224));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("PUESTOS Y PRODUCTOS DEL MERCADO");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Puestos del mercado");

        tablaIdPuestos.setBackground(new java.awt.Color(204, 204, 204));
        tablaIdPuestos.setFont(new java.awt.Font("Sitka Small", 0, 13)); // NOI18N
        tablaIdPuestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Puesto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaIdPuestos);
        if (tablaIdPuestos.getColumnModel().getColumnCount() > 0) {
            tablaIdPuestos.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Productos que tiene el mercado");

        tablaProductos.setBackground(new java.awt.Color(204, 204, 204));
        tablaProductos.setFont(new java.awt.Font("Sitka Small", 0, 13)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Producto", "Nombre", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setResizable(false);
            tablaProductos.getColumnModel().getColumn(1).setResizable(false);
            tablaProductos.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tienda.png"))); // NOI18N
        jButton1.setText("Listar Puestos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito-de-compras.png"))); // NOI18N
        jButton2.setText("Listar Productos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atra.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(257, 257, 257))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(96, 96, 96)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
        limpiar1();
      cargarDatosList1();
      } catch(Exception e){
          System.out.println(e);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(tipoMer.equalsIgnoreCase("minorista")){
        VentanaMerMen mer = new VentanaMerMen();
        mer.setMercadosMin(mercadosMino);
        mer.setProdGral(prodGral);
        mer.setVisible(true);
        this.setVisible(false);
        }
        else
        {
            VentanaSectorCamion secto = new VentanaSectorCamion(nomMer);
            secto.setMercadosMay(mercadosMay);
            secto.setProdGral(prodGral);
            secto.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
        limpiar2();
      cargarDatos2(tipoMer,sector);
      } catch(Exception e){
          System.out.println(e);
      }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void cargarDatos2(String tipoMer, String sect) throws IOException{
       if(tipoMer.equalsIgnoreCase("minorista")){
           ObjectInputStream Registro = null;
        try{
            Registro = new ObjectInputStream(new FileInputStream("datos1.dat"));
            while(true){
                mercadosMino = new CSimpleMercadoMin();
                mercadosMino = (CSimpleMercadoMin)Registro.readObject();
                
                CSimpleMercadoMin auxi = new CSimpleMercadoMin();
                while(!mercadosMino.esvacia()){
                    MercadoMinorista mmix = mercadosMino.eliminar();
                    auxi.adicionar(mmix);
                    if(mmix.getNombre().equalsIgnoreCase(nomMer)){
                        int nroE = this.prodGral.nroelem();
                        for (int i = 0; i < nroE; i++) {
                            Producto prx = prodGral.eliminar();
                            if(tieneProd(prx.getIdProd(),mmix.getPuestos())){
                                llenarTabla(prx.getIdProd(), prx.getNombre(), prx.getTipo());
                            }
                            prodGral.adicionar(prx);
                        }
                    }
                }
                mercadosMino.vaciar(auxi);
                
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            Registro.close();
        }
       } else{
           ObjectInputStream Registro = null;
        try{
            Registro = new ObjectInputStream(new FileInputStream("datos2.dat"));
            while(true){
                mercadosMay = new PilaMercadoMay();
                mercadosMay = (PilaMercadoMay)Registro.readObject();
                
                PilaMercadoMay aux = new PilaMercadoMay();
        while(!mercadosMay.esvacia()){
            MercadoMayorista mxx = mercadosMay.eliminar();
            aux.adicionar(mxx);
            if(mxx.getNombre().equalsIgnoreCase(this.nomMer)){
                PilaSe auxi = new PilaSe();
                while(!mxx.getSectores().esvacia()){
                    Sector sx = mxx.getSectores().eliminar();
                    auxi.adicionar(sx);
                    if(sx.getNombre().equalsIgnoreCase(this.sector)){
                        int nroE = this.prodGral.nroelem();
                        for (int i = 0; i < nroE; i++) {
                            Producto prx = prodGral.eliminar();
                            if(tieneProd(prx.getIdProd(),sx.getPuestos())){
                                llenarTabla(prx.getIdProd(), prx.getNombre(), prx.getTipo());
                            }
                            prodGral.adicionar(prx);
                        }
                    }
                }
                mxx.getSectores().vaciar(auxi);
            }
        }
        mercadosMay.vaciar(aux);
                
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            Registro.close();
        }
       }
    }
    public boolean tieneProd(String id, LSimpleCPu pu){
        NodoPu r = pu.getP();
        while(r.getSig()!=pu.getP()){
            if(existe(id,r.getPuest().getProductos().getP()))
                return true;
            r = r.getSig();
        }
        if(existe(id,r.getPuest().getProductos().getP()))
                return true;
        return false;
        
    }
    public boolean existe(String id, NodoPr r){
        if(r!=null){
            if(r.getIdProducto().equalsIgnoreCase(id))
                return true;
            return existe(id, r.getSig());
        } else
            return false;
    }
   
    private void llenarTabla(String tip, String nom,String tipo) {
        DefaultTableModel datos =  (DefaultTableModel) this.tablaProductos.getModel();
        Object[] fila = new Object[3];
        fila[0] = tip;
        fila[1] = nom;
        fila[2] = tipo;
        datos.addRow(fila);
    }
    public void limpiar2(){
        DefaultTableModel datos = (DefaultTableModel)this.tablaProductos.getModel();
        int n = this.tablaProductos.getRowCount()-1;
        for(int i = n; i >=0 ; i--){
            datos.removeRow(this.tablaProductos.getRowCount()-1);
        }
    }
    public void cargarDatosList1() throws IOException{
           if(tipoMer.equalsIgnoreCase("minorista")){
  
         ObjectInputStream Registro = null;
        try{
            Registro = new ObjectInputStream(new FileInputStream("datos1.dat"));
            while(true){
                mercadosMino = new CSimpleMercadoMin();
                mercadosMino = (CSimpleMercadoMin)Registro.readObject();
                CSimpleMercadoMin aux = new CSimpleMercadoMin();
        while(!mercadosMino.esvacia()){
            MercadoMinorista mxx = mercadosMino.eliminar();
            aux.adicionar(mxx);
            if(mxx.getNombre().equalsIgnoreCase(this.nomMer)){
                NodoPu rpu = mxx.getPuestos().getP();
                while(rpu.getSig()!=mxx.getPuestos().getP()){
                    adicionarTabla1(rpu.getPuest().getIdPuesto());
                    rpu = rpu.getSig();
                }
                adicionarTabla1(rpu.getPuest().getIdPuesto());
            }
        }
        mercadosMino.vaciar(aux);
                
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            Registro.close();
        }
        } else{
   
        ObjectInputStream Registro = null;
        try{
            Registro = new ObjectInputStream(new FileInputStream("datos2.dat"));
            while(true){
                mercadosMay = new PilaMercadoMay();
                mercadosMay = (PilaMercadoMay)Registro.readObject();
                PilaMercadoMay aux = new PilaMercadoMay();
        while(!mercadosMay.esvacia()){
            MercadoMayorista mxx = mercadosMay.eliminar();
            aux.adicionar(mxx);
            if(mxx.getNombre().equalsIgnoreCase(this.nomMer)){
                PilaSe auxi = new PilaSe();
                while(!mxx.getSectores().esvacia()){
                    Sector sx = mxx.getSectores().eliminar();
                    auxi.adicionar(sx);
                    if(sx.getNombre().equalsIgnoreCase(this.sector)){
                        NodoPu rpu = sx.getPuestos().getP();
                        while(rpu.getSig()!=sx.getPuestos().getP()){
                            adicionarTabla1(rpu.getPuest().getIdPuesto());
                            rpu = rpu.getSig();
                        }       
                        adicionarTabla1(rpu.getPuest().getIdPuesto());
                    }
                }
                mxx.getSectores().vaciar(auxi);
            }
        }
        mercadosMay.vaciar(aux);
                
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        finally{
            Registro.close();
        }
        
        
        
           }
    }
     private void adicionarTabla1(String idPuest) {
        DefaultTableModel datos = (DefaultTableModel)this.tablaIdPuestos.getModel();
        Object[] fila = new Object[2];
        fila[0] = idPuest;
        datos.addRow(fila);
    }
    public void limpiar1() {
        DefaultTableModel datos = (DefaultTableModel)tablaIdPuestos.getModel();
        int n = this.tablaIdPuestos.getRowCount()-1;
        for(int i = n; i >=0 ; i--){
            datos.removeRow(this.tablaIdPuestos.getRowCount()-1);
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaPuestosProMen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPuestosProMen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPuestosProMen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPuestosProMen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPuestosProMen().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaIdPuestos;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
