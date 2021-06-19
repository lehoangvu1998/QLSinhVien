package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fSinhvien extends javax.swing.JFrame {

    Random rd = new Random();

    public fSinhvien() {
        initComponents();
        initalMSSV();
        convertDateToPass();
    }

    private void initalMSSV() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yy");
//        String mssv = dateFormat.format(Calendar.getInstance().getTime());
//        int random = rd.nextInt(100000) + 900000;
//        txtMssv.setText(mssv + random);
    }

    private void convertDateToPass() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String birthday = "17/03/1998";
            Date date = dateFormat.parse(birthday);
            String password = dateFormat.format(date).replaceAll("/", "");
            System.out.println("Ngày sinh " + birthday + "\nMật khẩu " + password);
        } catch (ParseException ex) {
            Logger.getLogger(fSinhvien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new fSinhvien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
