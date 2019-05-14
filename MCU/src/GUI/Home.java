package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.DefaultListModel;

public class Home extends javax.swing.JFrame {

    private DefaultListModel heroesDlm = new DefaultListModel();
    private DefaultListModel moviesDlm = new DefaultListModel();

    private static File characters = new File(".\\heroes.csv");
    private static File chInfo = new File(".\\heroes_info.csv");
    private static File movies = new File(".\\mcu_movies.csv");

    public Home() {
        initComponents();
        listSuper.setModel(heroesDlm);
        listMovies.setModel(moviesDlm);

        fillLists();
    }

    public void fillLists() {

        // add heroes to the list
        try (BufferedReader br = new BufferedReader(new FileReader(chInfo))) {
            String s = "";
            String[] split;
            br.readLine();
            while ((s = br.readLine()) != null) {
                split = s.split(",");
                heroesDlm.addElement(split[1]);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // add movies to the list
        try (BufferedReader br = new BufferedReader(new FileReader(movies))) {
            String s = "";
            String[] split;

            br.readLine();
            while ((s = br.readLine()) != null) {
                split = s.split(",");
                moviesDlm.addElement(split[0]);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSuperheroes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSuper = new javax.swing.JList<>();
        lbMovies = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMovies = new javax.swing.JList<>();
        tfSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taInfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbSuperheroes.setText("Superheroes");

        listSuper.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listSuper.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSuperValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listSuper);

        lbMovies.setText("MCU Movies");

        listMovies.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listMovies);

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        taInfo.setColumns(20);
        taInfo.setRows(5);
        jScrollPane3.setViewportView(taInfo);

        jLabel1.setText("Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSuperheroes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tfSearch)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSuperheroes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMovies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        heroesDlm.clear();

        try (BufferedReader br = new BufferedReader(new FileReader(chInfo))) {
            String s = "";
            String[] split;

            br.readLine();
            while ((s = br.readLine()) != null) {
                if (s.toLowerCase().contains(tfSearch.getText().toLowerCase())) {
                    split = s.split(",");
                    heroesDlm.addElement(split[1]);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tfSearchKeyReleased

    private void listSuperValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSuperValueChanged
        taInfo.setText(null);
        String selected = listSuper.getSelectedValue();
        String info = "";

        try (BufferedReader br = new BufferedReader(new FileReader(chInfo))) {
            String s = "";
            String[] split;

            while ((s = br.readLine()) != null) {
                split = s.split(",");
                if (split[1].equals(selected)) {
                    info = s;
                }
            }

        } catch (Exception e) {
        }
        
        String[] infoSplit = info.split(",");

        taInfo.setText(String.format("NAME: %s\n"
                + "GENDER: %s\n"
                + "EYE-COLOR: %s\n"
                + "RACE: %s\n"
                + "HAIR-COLOR: %s\n"
                + "PUBLISHER: %s\n"
                + "SKIN-COLOR: %s\n"
                + "HEIGHT: %s\n"
                + "WEIGHT: %s\n", infoSplit[1],
                infoSplit[3],
                infoSplit[4],
                infoSplit[5],
                infoSplit[6],
                infoSplit[7],
                infoSplit[8],
                infoSplit[9],
                infoSplit[10]));
    }//GEN-LAST:event_listSuperValueChanged

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbMovies;
    private javax.swing.JLabel lbSuperheroes;
    private javax.swing.JList<String> listMovies;
    private javax.swing.JList<String> listSuper;
    private javax.swing.JTextArea taInfo;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
