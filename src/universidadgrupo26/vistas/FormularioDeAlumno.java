/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo26.vistas;

/**
 *
 * @author macbookpro
 */
public class FormularioDeAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioDeAlumno
     */
    public FormularioDeAlumno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloAlumno = new javax.swing.JLabel();
        documento = new javax.swing.JLabel();
        jtexDocumento = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        Apellido = new javax.swing.JLabel();
        jtexApellido = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        jtexNombre = new javax.swing.JTextField();
        Estado = new javax.swing.JLabel();
        activo = new javax.swing.JRadioButton();
        fechadenac = new javax.swing.JLabel();
        jtexEstado = new javax.swing.JTextField();
        nuevo = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        tituloAlumno.setText("          ALUMNO");

        documento.setText("Documento");

        buscar.setText("Buscar");

        Apellido.setText("Apellido");

        Nombre.setText("Nombre");

        Estado.setText("Estado");

        fechadenac.setText("Fecha de Nacimiento");

        nuevo.setText("Nuevo");

        eliminar.setText("Eliminar");

        guardar.setText("Guardar");

        salir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(tituloAlumno)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(documento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtexDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(activo)
                            .addComponent(jtexApellido)
                            .addComponent(jtexNombre)
                            .addComponent(jtexEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fechadenac)
                        .addGap(23, 23, 23)))
                .addGap(27, 27, 27)
                .addComponent(guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAlumno)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documento)
                    .addComponent(jtexDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(jtexApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(jtexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Estado)
                    .addComponent(activo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechadenac)
                    .addComponent(jtexEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(eliminar)
                    .addComponent(guardar)
                    .addComponent(salir))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Nombre;
    private javax.swing.JRadioButton activo;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel documento;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fechadenac;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField jtexApellido;
    private javax.swing.JTextField jtexDocumento;
    private javax.swing.JTextField jtexEstado;
    private javax.swing.JTextField jtexNombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tituloAlumno;
    // End of variables declaration//GEN-END:variables
}
