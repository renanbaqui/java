/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.math.RoundingMode;	// arredondamento de casas decimais
import java.text.DecimalFormat;	// arredondamento de casas decimais
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author R
 */
public class P8nX extends javax.swing.JFrame {

    /**
     * Creates new form P8nX
     */
    public P8nX() {
        initComponents();
    }   
    
    static MinhaListaOrdenavel objeto = new MinhaListaOrdenavel();
    
    static Homem p1 = new Homem("Jose", 70, 1.65);
    static Mulher p2 = new Mulher("Maria", 50, 1.63);
    static Mulher p3 = new Mulher("Ana", 81, 1.67);
    static Homem p4 = new Homem("Joao", 85, 1.79);
    static Homem p5 = new Homem("Antonio", 91, 1.83);
    static Mulher p6 = new Mulher("Renata", 69, 1.61);
    static Homem p7 = new Homem("Carlos", 71, 1.75);
    static Homem p8 = new Homem("Paulo", 82, 1.71);
    static Mulher p9 = new Mulher("Adriana", 63, 1.64);
    static Mulher p10 = new Mulher("Paula", 76, 1.66);
    
    static String generoPessoa, nomePessoa;
    static double pesoPessoa, alturaPessoa;
    
    static String buff1, buff2;
    static int erroNome = 0, erroPeso = 0, erroAltura = 0;    
    
    static DecimalFormat df2 = new DecimalFormat("#.##");
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(410, 600));

        jLabel2.setText("Lista de Pessoas");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homem", "Mulher" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Inserir Pessoa");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Ordenacao");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome Crescente", "Nome Decrescente", "Peso Crescente", "Peso Decrescente", "Altura Crescente", "Altura Decrescente", "IMC Crescente", "IMC Decrescente", "Genero" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton2.setText("Ordenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mensagens");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome");

        jLabel6.setText("Peso (kg)");

        jLabel7.setText("Altura (m)");

        jLabel8.setText("Genero");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {objeto.get(0).getNome(), objeto.get(0).getPeso(), objeto.get(0).getAltura(), df2.format(objeto.get(0).calculaIMC(objeto.get(0).getAltura(), objeto.get(0).getPeso())), objeto.get(0).getClass().getSimpleName()},
                {objeto.get(1).getNome(), objeto.get(1).getPeso(), objeto.get(1).getAltura(), df2.format(objeto.get(1).calculaIMC(objeto.get(1).getAltura(), objeto.get(1).getPeso())), objeto.get(1).getClass().getSimpleName()},
                {objeto.get(2).getNome(), objeto.get(2).getPeso(), objeto.get(2).getAltura(), df2.format(objeto.get(2).calculaIMC(objeto.get(2).getAltura(), objeto.get(2).getPeso())), objeto.get(2).getClass().getSimpleName()},
                {objeto.get(3).getNome(), objeto.get(3).getPeso(), objeto.get(3).getAltura(), df2.format(objeto.get(3).calculaIMC(objeto.get(3).getAltura(), objeto.get(3).getPeso())), objeto.get(3).getClass().getSimpleName()},
                {objeto.get(4).getNome(), objeto.get(4).getPeso(), objeto.get(4).getAltura(), df2.format(objeto.get(4).calculaIMC(objeto.get(4).getAltura(), objeto.get(4).getPeso())), objeto.get(4).getClass().getSimpleName()},
                {objeto.get(5).getNome(), objeto.get(5).getPeso(), objeto.get(5).getAltura(), df2.format(objeto.get(5).calculaIMC(objeto.get(5).getAltura(), objeto.get(5).getPeso())), objeto.get(5).getClass().getSimpleName()},
                {objeto.get(6).getNome(), objeto.get(6).getPeso(), objeto.get(6).getAltura(), df2.format(objeto.get(6).calculaIMC(objeto.get(6).getAltura(), objeto.get(6).getPeso())), objeto.get(6).getClass().getSimpleName()},
                {objeto.get(7).getNome(), objeto.get(7).getPeso(), objeto.get(7).getAltura(), df2.format(objeto.get(7).calculaIMC(objeto.get(7).getAltura(), objeto.get(7).getPeso())), objeto.get(7).getClass().getSimpleName()},
                {objeto.get(8).getNome(), objeto.get(8).getPeso(), objeto.get(8).getAltura(), df2.format(objeto.get(8).calculaIMC(objeto.get(8).getAltura(), objeto.get(8).getPeso())), objeto.get(8).getClass().getSimpleName()},
                {objeto.get(9).getNome(), objeto.get(9).getPeso(), objeto.get(9).getAltura(), df2.format(objeto.get(9).calculaIMC(objeto.get(9).getAltura(), objeto.get(9).getPeso())), objeto.get(9).getClass().getSimpleName()}
            },
            new String [] {
                "Nome", "Peso", "Altura", "IMC", "Genero"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                        .addGap(56, 56, 56)
                                        .addComponent(jButton1))))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        generoPessoa = String.valueOf(jComboBox1.getSelectedItem());    // recebe o genero selecionado
        nomePessoa = jTextField1.getText(); // recebe o texto do campo nome
        buff1 = jTextField2.getText();  // recebe o texto do campo peso
        buff2 = jTextField3.getText();  // recebe o texto do campo altura
        
        if ("".equals(nomePessoa)) {    // verifica se o campo nome esta vazio
            erroNome = 1;
            jTextField4.setText("Nome vazio. Insira um nome.");
        } else {
            erroNome = 0;
        }
        
        if ("".equals(buff1)) {     // verifica se o campo peso esta vazio
            erroPeso = 1;
            jTextField4.setText("Peso vazio. Insira um peso.");
        } else {        
            erroPeso = 0;
        }
        
        if ("".equals(buff2)) {     // verifica se o campo altura esta vazio
            erroAltura = 1;
            jTextField4.setText("Altura vazia. Insira uma altura.");
        } else {        
            erroAltura = 0;
        }
        
        boolean numeric = true;
        boolean numeric2 = true;
	
        if (erroPeso == 0) {
            try {	// verifica se e' numero double
              Double num = Double.parseDouble(buff1);
            } catch (NumberFormatException e) {
              numeric = false;
            }
            if (!numeric)	// se nao e' numero double imprime a linha abaixo 
            {
                erroPeso = 1;
                jTextField4.setText("Peso invalido. Nao eh um numero.");	    
            }
        }
        
        if (erroAltura == 0) {
            try {	// verifica se e' numero double
              Double num2 = Double.parseDouble(buff2);
            } catch (NumberFormatException e) {
              numeric2 = false;
            }
            if (!numeric2)	// se nao e' numero double imprime a linha abaixo 
            {
                erroAltura = 1;
                jTextField4.setText("Altura invalida. Nao eh um numero.");	    
            }
        }        
        if (erroPeso == 0){
            pesoPessoa = Double.parseDouble(buff1);
        }
        if (erroAltura == 0) {
            alturaPessoa = Double.parseDouble(buff2);
        }
        
        if (erroPeso == 0) {
            if (pesoPessoa<1 || pesoPessoa>500) {   // verifica se o peso esta dentro do requisito
                erroPeso = 1;
                jTextField4.setText("Peso invalido. Numero deve ser entre 1 e 500 inclusive.");            
            }
            else {
                erroPeso = 0;
            }
        }
        
        if (erroAltura == 0) {
            if (alturaPessoa<0.3 || alturaPessoa>2.5) { // verifica se a altura esta dentro do requisito
                erroAltura = 1;
                jTextField4.setText("Altura invalida. Numero deve ser entre 0.3 e 2.5 inclusive.");
            }
            else {
                erroAltura = 0;
            }  
        }
        
        if (erroNome == 0 && erroPeso == 0 && erroAltura == 0) {  // caso nao hajam erros nos campos nome, peso e altura 
            switch (generoPessoa) {
            case "Homem":
                Homem p11 = new Homem(nomePessoa, pesoPessoa, alturaPessoa);
                //objeto.addPos(0, p11); // adiciona na posicao 0
                objeto.add(p11); // adiciona no fim da lista
                jTextField4.setText("Pessoa de nome "+nomePessoa+" inserida.");
                
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                model.addRow(new Object[]{nomePessoa, pesoPessoa, alturaPessoa, df2.format(p11.calculaIMC(p11.getAltura(), p11.getPeso())), p11.getClass().getSimpleName()});
                
                break;
            case "Mulher":
                Mulher p12 = new Mulher(nomePessoa, pesoPessoa, alturaPessoa);
                //objeto.addPos(0, p12); // adiciona na posicao 0 
                objeto.add(p12); // adiciona no fim da lista
                jTextField4.setText("Pessoa de nome "+nomePessoa+" inserida.");
                
                DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
                model2.addRow(new Object[]{nomePessoa, pesoPessoa, alturaPessoa, df2.format(p12.calculaIMC(p12.getAltura(), p12.getPeso())), p12.getClass().getSimpleName()});
                
                break;
            }
        }        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String selecionado = jComboBox2.getSelectedItem().toString();   // recebe o string com o metodo de ordenacao
        int n = 1;
        
        switch(selecionado){
            case "Nome Crescente":
                n = 1;
                break;
            case "Nome Decrescente":
                n = 2;
                break;                
            case "Peso Crescente":
                n = 3;
                break; 
            case "Peso Decrescente":
                n = 4;
                break; 
            case "Altura Crescente":
                n = 5;
                break; 
            case "Altura Decrescente":
                n = 6;
                break; 
            case "IMC Crescente":
                n = 7;
                break; 
            case "IMC Decrescente":
                n = 8;
                break; 
            case "Genero":
                n = 9;
                break;                 
        }        
        
        objeto.ordena(n);   // aplica o metodo ordena para ordenar        
       
        // atualiza a tabela com os valores ordenados
        jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {
        
            {objeto.get(0).getNome(), objeto.get(0).getPeso(), objeto.get(0).getAltura(), df2.format(objeto.get(0).calculaIMC(objeto.get(0).getAltura(), objeto.get(0).getPeso())), objeto.get(0).getClass().getSimpleName()},
            {objeto.get(1).getNome(), objeto.get(1).getPeso(), objeto.get(1).getAltura(), df2.format(objeto.get(1).calculaIMC(objeto.get(1).getAltura(), objeto.get(1).getPeso())), objeto.get(1).getClass().getSimpleName()},
            {objeto.get(2).getNome(), objeto.get(2).getPeso(), objeto.get(2).getAltura(), df2.format(objeto.get(2).calculaIMC(objeto.get(2).getAltura(), objeto.get(2).getPeso())), objeto.get(2).getClass().getSimpleName()},
            {objeto.get(3).getNome(), objeto.get(3).getPeso(), objeto.get(3).getAltura(), df2.format(objeto.get(3).calculaIMC(objeto.get(3).getAltura(), objeto.get(3).getPeso())), objeto.get(3).getClass().getSimpleName()},
            {objeto.get(4).getNome(), objeto.get(4).getPeso(), objeto.get(4).getAltura(), df2.format(objeto.get(4).calculaIMC(objeto.get(4).getAltura(), objeto.get(4).getPeso())), objeto.get(4).getClass().getSimpleName()},
            {objeto.get(5).getNome(), objeto.get(5).getPeso(), objeto.get(5).getAltura(), df2.format(objeto.get(5).calculaIMC(objeto.get(5).getAltura(), objeto.get(5).getPeso())), objeto.get(5).getClass().getSimpleName()},
            {objeto.get(6).getNome(), objeto.get(6).getPeso(), objeto.get(6).getAltura(), df2.format(objeto.get(6).calculaIMC(objeto.get(6).getAltura(), objeto.get(6).getPeso())), objeto.get(6).getClass().getSimpleName()},
            {objeto.get(7).getNome(), objeto.get(7).getPeso(), objeto.get(7).getAltura(), df2.format(objeto.get(7).calculaIMC(objeto.get(7).getAltura(), objeto.get(7).getPeso())), objeto.get(7).getClass().getSimpleName()},
            {objeto.get(8).getNome(), objeto.get(8).getPeso(), objeto.get(8).getAltura(), df2.format(objeto.get(8).calculaIMC(objeto.get(8).getAltura(), objeto.get(8).getPeso())), objeto.get(8).getClass().getSimpleName()},
            {objeto.get(9).getNome(), objeto.get(9).getPeso(), objeto.get(9).getAltura(), df2.format(objeto.get(9).calculaIMC(objeto.get(9).getAltura(), objeto.get(9).getPeso())), objeto.get(9).getClass().getSimpleName()}            
            },
            new String [] {
            "Nome", "Peso", "Altura", "IMC", "Genero"
            }
        ));       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // lista existente de pessoas       
        
        objeto.add(p1);        
        objeto.add(p2);   
        objeto.add(p3);
	objeto.add(p4);
        objeto.add(p5);
        objeto.add(p6);  
        objeto.add(p7);    
        objeto.add(p8);  
        objeto.add(p9);   
        objeto.add(p10);       
        

        
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
            java.util.logging.Logger.getLogger(P8nX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P8nX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P8nX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P8nX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P8nX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
