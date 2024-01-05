package com.localhost.salvarcontatos.view;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego Barbosa da Silva
 */
public class ViewMain extends javax.swing.JFrame {

    /**
     * Creates new form ViewMain
     */
    public ViewMain() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContatos = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemImportar = new javax.swing.JMenuItem();
        jMenuItemExportar = new javax.swing.JMenuItem();
        jMenuItemExtrairContatos = new javax.swing.JMenuItem();
        jMenuItemSalvarContatos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuModoEscuro = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemGithub = new javax.swing.JMenuItem();
        jMenuItemLinkedin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salvar Contatos");
        setResizable(false);

        jTableContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mobile Phone"
            }
        ));
        jScrollPane1.setViewportView(jTableContatos);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        btnRemover.setText("Remover");

        jMenu1.setText("Arquivo");

        jMenuItemImportar.setText("Importar");
        jMenuItemImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemImportar);

        jMenuItemExportar.setText("Exportar");
        jMenuItemExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExportarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExportar);

        jMenuItemExtrairContatos.setText("Extrair Contatos");
        jMenuItemExtrairContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExtrairContatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExtrairContatos);

        jMenuItemSalvarContatos.setText("Salvar Contatos");
        jMenuItemSalvarContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalvarContatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalvarContatos);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Opções");

        menuModoEscuro.setText("Modo Escuro");
        menuModoEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModoEscuroActionPerformed(evt);
            }
        });
        jMenu3.add(menuModoEscuro);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Sobre");

        jMenuItemGithub.setText("Github");
        jMenuItemGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGithubActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemGithub);

        jMenuItemLinkedin.setText("LinkedIn");
        jMenuItemLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLinkedinActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemLinkedin);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnLimpar)
                    .addComponent(btnRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImportarActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            ImportarContatos(filename);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jMenuItemImportarActionPerformed

    private void jMenuItemExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExportarActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showSaveDialog(this);
            File f = chooser.getSelectedFile();
            ExportarContatos(f);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jMenuItemExportarActionPerformed

    private void jMenuItemGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGithubActionPerformed
        try {
            URI link = new URI("https://github.com/sbarbosadiego");
            Desktop.getDesktop().browse(link);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemGithubActionPerformed

    private void jMenuItemLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLinkedinActionPerformed
        try {
            URI link = new URI("https://www.linkedin.com/in/diegobarbosad/");
            Desktop.getDesktop().browse(link);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemLinkedinActionPerformed

    private void menuModoEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModoEscuroActionPerformed
        if (menuModoEscuro.isSelected()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }//GEN-LAST:event_menuModoEscuroActionPerformed

    private void jMenuItemExtrairContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExtrairContatosActionPerformed
        try {
            URI link = new URI("https://web.whatsapp.com/");
            Desktop.getDesktop().browse(link);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemExtrairContatosActionPerformed

    private void jMenuItemSalvarContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalvarContatosActionPerformed
        try {
            URI link = new URI("https://contacts.google.com/");
            Desktop.getDesktop().browse(link);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemSalvarContatosActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) jTableContatos.getModel();

        if (tabela.getRowCount() == 0) {
            tabela.setNumRows(0);
            int contador = 1;
            String nomeCliente = "";
            String linha = "";

            for (int c = 0; c < contador; c++) {
                tabela.addRow(new Object[]{
                    nomeCliente,
                    linha
                });
            }
        } else {
            tabela.getRowCount();
            
        }


    }//GEN-LAST:event_btnAdicionarActionPerformed

    /**
     * Método para importar o arquivo CSV com os telefones, automaticamente é
     * preenchido o nome do contato como "Cliente" com uma ordem númerica em
     * sequência.
     *
     * @param path
     */
    public void ImportarContatos(String path) {
        DefaultTableModel tabela = (DefaultTableModel) jTableContatos.getModel();

        // Limpar a tabela antes de adicionar novas informações
        tabela.setNumRows(0);

        // Uso de try-with-resources, garante que seja fechado os recursos, sem a necessidade de usar um método como close para cada um.
        try (FileInputStream fileInputStream = new FileInputStream(path); InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

            String linha;
            int contadorCliente = 1;

            while ((linha = bufferedReader.readLine()) != null) {
                String nomeCliente = "Cliente " + contadorCliente;
                tabela.addRow(new Object[]{
                    nomeCliente,
                    linha.trim()});
                contadorCliente++;
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * Método para exportar todo o conteúdo da tabela em um arquivo CSV, neste é
     * criado um cabeçalho e formatado o arquivo.
     *
     * @param path
     */
    public void ExportarContatos(File path) {
        DefaultTableModel tabela = (DefaultTableModel) jTableContatos.getModel();
        int contador = tabela.getRowCount();

        /* Em importar contatos poderia ser feito sem o uso de try-with-resources, porém em exportar é necessário,
        ** caso contrário o arquivo ficará em "edição" e ao fechar a aplicação para abrir, nada vai ter sido salvo
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path));) {
            writer.write("Name;Mobile Phone");
            writer.newLine();

            for (int i = 0; i < contador; i++) {
                String nome = tabela.getValueAt(i, 0).toString();
                String telefone = tabela.getValueAt(i, 1).toString();

                writer.write(nome + ";" + telefone);
                writer.newLine();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatIntelliJLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExportar;
    private javax.swing.JMenuItem jMenuItemExtrairContatos;
    private javax.swing.JMenuItem jMenuItemGithub;
    private javax.swing.JMenuItem jMenuItemImportar;
    private javax.swing.JMenuItem jMenuItemLinkedin;
    private javax.swing.JMenuItem jMenuItemSalvarContatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContatos;
    private javax.swing.JCheckBoxMenuItem menuModoEscuro;
    // End of variables declaration//GEN-END:variables
}
