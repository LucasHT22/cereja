package view;

import java.awt.*;
import javax.swing.*;
import model.Book;
import controller.BookController;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        super("Cereja - The Library Manager");
        initComponents();
        loadBooks();
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(255, 248, 240));
        
        lblCherries.setForeground(new Color(215, 38, 56));
        lblDescription.setForeground(new Color(215, 38, 56));
        lblTitle.setForeground(new Color(215, 38, 56));
        lblAuthor.setForeground(new Color(215, 38, 56));
        lblLanguage.setForeground(new Color(215, 38, 56));
        lblQuantity.setForeground(new Color(215, 38, 56));
        lblYear.setForeground(new Color(215, 38, 56));
        lblIsbn.setForeground(new Color(215, 38, 56));
        lblPublisher.setForeground(new Color(215, 38, 56));

        btnAddBook.setBackground(new Color(215, 38, 56));
        btnAddBook.setForeground(Color.WHITE);
        btnClear.setBackground(new Color(209,73,91));
        btnClear.setForeground(Color.WHITE);
        btnExit.setBackground(new Color(107,15,26));
        btnExit.setForeground(Color.WHITE);

        tblBooks.setBackground(Color.WHITE);
        tblBooks.setForeground(new Color(51, 51, 51));

    }
    private void loadBooks() {
        try {
            List<Book> books = BookController.getLastThreeBooks();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            for (Book book : books) {
                model.addRow(new Object[]{
                    book.getId(),
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPublisher(),
                    book.getQuantity(),
                    book.getEditionYear(),
                    book.getLanguage(),
                    book.getIsbn()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading: " + e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtLanguage = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtEditionYear = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        tblBooks = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCherries = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        lblPublisher = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
        lblTitle.setText("Title");

        lblAuthor.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
        lblAuthor.setText("Author");

        lblLanguage.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
        lblLanguage.setText("Language");

        lblQuantity.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
        lblQuantity.setText("Quantity");

        lblYear.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
        lblYear.setText("Year");

        btnAddBook.setText("ADD");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 248, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "Title", "Publisher", "Author", "Quantity", "Year", "Language", "ISBN"
            }
        )
    );
    tblBooks.setViewportView(jTable1);

    lblCherries.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 36)); // NOI18N
    lblCherries.setText("Cereja");

    lblDescription.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
    lblDescription.setText("The Library Manager");

    lblIsbn.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
    lblIsbn.setText("ISBN");

    btnClear.setText("CLEAR");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
        }
    });

    lblPublisher.setFont(new java.awt.Font("Fraunces 72pt SuperSoft", 0, 12)); // NOI18N
    lblPublisher.setText("Publisher");

    btnExit.setText("EXIT");
    btnExit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExitActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tblBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCherries, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQuantity)
                                .addComponent(lblLanguage)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtLanguage)
                                .addComponent(txtAuthor)
                                .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(txtQuantity)
                                .addComponent(txtEditionYear)
                                .addComponent(lblDescription)
                                .addComponent(txtIsbn)
                                .addComponent(lblPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPublisher))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnAddBook)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblCherries)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblDescription)
            .addGap(20, 20, 20)
            .addComponent(lblTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lblAuthor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddBook)
                        .addComponent(btnClear)
                        .addComponent(btnExit))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(lblPublisher)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblLanguage)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblQuantity)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblYear)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtEditionYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lblIsbn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)))
            .addComponent(tblBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>                        

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtAuthor.setText("");
        txtTitle.setText("");
        txtPublisher.setText("");
        txtLanguage.setText("");
        txtQuantity.setText("");
        txtEditionYear.setText("");
        txtIsbn.setText("");
    }                                        

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            String title = txtTitle.getText();
            String author = txtAuthor.getText();
            String language = txtLanguage.getText();
            int quantity = Integer.parseInt(txtQuantity.getText());
            int editionYear = Integer.parseInt(txtEditionYear.getText());
            String isbn = txtIsbn.getText();
            String publisher = txtPublisher.getText();

            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setLanguage(language);
            book.setQuantity(quantity);
            book.setEditionYear(editionYear);
            book.setIsbn(isbn);
            book.setPublisher(publisher);

            BookController.addBook(book);
            JOptionPane.showMessageDialog(MainFrame.this, "Book added successfully!");

            loadBooks();
            btnClear.doClick();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(MainFrame.this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }                                          

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCherries;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblPublisher;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JScrollPane tblBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtEditionYear;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration                   
}
