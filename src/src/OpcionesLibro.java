
package src;

import javax.swing.JOptionPane;

public class OpcionesLibro extends javax.swing.JFrame {
private Libro libro;
private int index;
   
    public OpcionesLibro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        materia = new javax.swing.JLabel();
        pag = new javax.swing.JLabel();
        BtnActualizar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(239, 110, 33));

        title.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Nombre del libro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addGap(208, 208, 208))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(title)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/placeholder.jpg"))); // NOI18N

        nombre.setText("Nombre:");

        Codigo.setText("Código:");

        autor.setText("Autor:");

        materia.setText("Materia:");

        pag.setText("N° Páginas");

        BtnActualizar.setBackground(new java.awt.Color(239, 110, 33));
        BtnActualizar.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 18)); // NOI18N
        BtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(239, 110, 33));
        BtnEliminar.setFont(new java.awt.Font("Source Sans Pro Semibold", 0, 18)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)
                        .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombre)
                                .addComponent(Codigo)
                                .addComponent(autor)
                                .addComponent(materia)
                                .addComponent(pag)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombre)
                        .addGap(18, 18, 18)
                        .addComponent(Codigo)
                        .addGap(18, 18, 18)
                        .addComponent(autor)
                        .addGap(18, 18, 18)
                        .addComponent(materia)
                        .addGap(18, 18, 18)
                        .addComponent(pag))
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnEliminar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        // Obtener libro
        setLibro(Datos.getInstance().getLibros().obtenerLibro(index),index);
        //Aviso de confirmar eliminacion
        int op = JOptionPane.showInternalConfirmDialog(null, "¿Quieres eliminar el siguiente libro?\n"+libro.getNombre()+" - "+libro.getAutor(), "Eliminar libro: "+libro.getNombre(), JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if(op==0){
            Datos.getInstance().eliminarLibro(index);
            JOptionPane.showMessageDialog(rootPane, "El libro "+libro.getNombre()+" de "+libro.getAutor()+", se a eliminado.", "Libro Eliminado", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        //Abrir Formulario en modo edicion
        Formulario actualizar = new Formulario();
        actualizar.editLibro(true, libro);
        actualizar.setVisible(true);
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // Actualizar datos al concentrarse en la ventana 
        setLibro(Datos.getInstance().getLibros().obtenerLibro(index),index);
    }//GEN-LAST:event_formWindowGainedFocus
    
   //Mostrar datos del libro en pantalla
    public void setLibro(Libro libro,int index){
        this.libro = libro;
        this.index=index;
        Codigo.setText("Código: "+libro.getCodigo());
        autor.setText("Autor/a: "+libro.getAutor());
        nombre.setText("Nombre: "+libro.getNombre());
        pag.setText("N° Páginas: "+libro.getNumeroPaginas());
        materia.setText("Materia: "+libro.getMateria());
        title.setText(libro.getNombre()+" - "+libro.getAutor());
        setTitle(libro.getNombre()+" - "+libro.getAutor());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel autor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel materia;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pag;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
