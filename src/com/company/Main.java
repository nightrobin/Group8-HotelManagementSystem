
package com.company;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.*;
import javax.swing.ImageIcon;


public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();

        tableReserve.getColumnModel().getColumn(0).setPreferredWidth(65);
        tableReserve.getColumnModel().getColumn(1).setPreferredWidth(80);
        tableReserve.getColumnModel().getColumn(2).setPreferredWidth(158);
        tableReserve.getColumnModel().getColumn(3).setPreferredWidth(110);
        tableReserve.getColumnModel().getColumn(4).setPreferredWidth(110);

        tableGuestsProfile.getColumnModel().getColumn(0).setPreferredWidth(30);
        tableGuestsProfile.getColumnModel().getColumn(1).setPreferredWidth(70);
        tableGuestsProfile.getColumnModel().getColumn(2).setPreferredWidth(80);
        tableGuestsProfile.getColumnModel().getColumn(3).setPreferredWidth(170);
        tableGuestsProfile.getColumnModel().getColumn(4).setPreferredWidth(90);
        tableGuestsProfile.getColumnModel().getColumn(5).setPreferredWidth(85);
        tableGuestsProfile.getColumnModel().getColumn(6).setPreferredWidth(122);
        tableGuestsProfile.getColumnModel().getColumn(7).setPreferredWidth(122);

        tableRevenue.getColumnModel().getColumn(0).setPreferredWidth(130);
        tableRevenue.getColumnModel().getColumn(1).setPreferredWidth(80);
        tableRevenue.getColumnModel().getColumn(2).setPreferredWidth(90);
        tableRevenue.getColumnModel().getColumn(3).setPreferredWidth(120);
        tableRevenue.getColumnModel().getColumn(4).setPreferredWidth(120);
        tableRevenue.getColumnModel().getColumn(5).setPreferredWidth(120);
    }

    public void Reserve () {
        if (cmbReserveType.getSelectedItem().equals(" ") || txtReserveName.getText().equals("") || txtReserveContact.getText().equals("") || txtReserveNo.getText().equals("") || txtReserveCheckIn.getText().equals("") || txtReserveCheckOut.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please completely fill up the information!");
        }
        else {
            String[] reserveinfo = {null, cmbReserveType.getSelectedItem().toString(), txtReserveName.getText(), txtReserveCheckIn.getText(), txtReserveCheckOut.getText()};
            DefaultTableModel reserveModel = (DefaultTableModel)tableReserve.getModel();
            int i = tableReserve.getSelectedRow();
            if (i >= 0) {
                reserveinfo[0] = tableReserve.getValueAt(i, 0).toString();
                tableReserve.setValueAt(cmbReserveType.getSelectedItem().toString(),i, 1);
                tableReserve.setValueAt(txtReserveName.getText(), i, 2);
                tableReserve.setValueAt(txtReserveCheckIn.getText(), i, 3);
                tableReserve.setValueAt(txtReserveCheckOut.getText(), i, 4);
            }
            JOptionPane.showMessageDialog(this, "Reserve successfully.");
            cmbReserveType.setSelectedItem(" ");
            txtReserveName.setText("");
            txtReserveContact.setText("");
            txtReserveNo.setText("");
            txtReserveCheckIn.setText(null);
            txtReserveCheckOut.setText(null);
        }
    }

    public void CancelReserve() {
        String[] reserveinfo = {null, cmbReserveType.getSelectedItem().toString(), txtReserveName.getText(), txtReserveCheckIn.getText(), txtReserveCheckOut.getText()};
        DefaultTableModel reserveModel = (DefaultTableModel)tableReserve.getModel();
        int i = tableReserve.getSelectedRow();
        if (i >= 0) {
            reserveinfo[0] = tableReserve.getValueAt(i, 0).toString();
            tableReserve.setValueAt("", i, 1);
            tableReserve.setValueAt("", i, 2);
            tableReserve.setValueAt("", i, 3);
            tableReserve.setValueAt("", i, 4);
        }
        JOptionPane.showMessageDialog(this, "Cancelled the reservation successfully.");
    }

    public void CheckIn() {

    }

    public void CheckOut() throws ParseException {

    }

    public void Clear() {

    }

    public void Search() {

    }

    public void RevenueSearch() {

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        pnltabHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblRooms = new javax.swing.JLabel();
        lblAmenities = new javax.swing.JLabel();
        lblDestinations = new javax.swing.JLabel();
        lblHotelName = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlHomeTab = new javax.swing.JPanel();
        lblServices = new javax.swing.JLabel();
        tabServices = new javax.swing.JTabbedPane();
        pnlReservation = new javax.swing.JPanel();
        lblReserveName = new javax.swing.JLabel();
        txtReserveName = new javax.swing.JTextField();
        lblReserveContact = new javax.swing.JLabel();
        txtReserveContact = new javax.swing.JTextField();
        lblReserveCIN = new javax.swing.JLabel();
        txtReserveCheckIn = new javax.swing.JTextField();
        lblReserveCOUT = new javax.swing.JLabel();
        txtReserveCheckOut = new javax.swing.JTextField();
        lblReserveNo = new javax.swing.JLabel();
        txtReserveNo = new javax.swing.JTextField();
        lblReserveType = new javax.swing.JLabel();
        cmbReserveType = new javax.swing.JComboBox<>();
        lblReserveCheckIn = new javax.swing.JLabel();
        lblReserveCheckOut = new javax.swing.JLabel();
        btnReserve = new javax.swing.JButton();
        btnReserveCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReserve = new javax.swing.JTable();
        pnlCheckIn = new javax.swing.JPanel();
        lblCheckInNo = new javax.swing.JLabel();
        lblCheckInName = new javax.swing.JLabel();
        txtCheckInNo = new javax.swing.JTextField();
        txtCheckInName = new javax.swing.JTextField();
        lblCheckInType = new javax.swing.JLabel();
        lblCheckInContact = new javax.swing.JLabel();
        cmbCheckInType = new javax.swing.JComboBox<>();
        txtCheckInContact = new javax.swing.JTextField();
        lblCheckInCIN1 = new javax.swing.JLabel();
        lblCheckInCIN = new javax.swing.JLabel();
        txtCheckInCIN = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCheckInCancel = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        pnlCheckOut = new javax.swing.JPanel();
        lblCheckOutName = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCheckOutName = new javax.swing.JTextField();
        btnCheckOut = new javax.swing.JButton();
        lblCheckOutRoomNo = new javax.swing.JLabel();
        txtCheckOutRoomNo = new javax.swing.JTextField();
        lblCheckOutType = new javax.swing.JLabel();
        txtCheckOutType = new javax.swing.JTextField();
        lblCheckOutFee = new javax.swing.JLabel();
        txtCheckOutFee = new javax.swing.JTextField();
        txtCheckOutCOUT = new javax.swing.JTextField();
        lblCheckOutCOUT = new javax.swing.JLabel();
        lblCheckOutDate = new javax.swing.JLabel();
        txtCheckOutNo = new javax.swing.JTextField();
        lblCheckOutNo = new javax.swing.JLabel();
        txtCheckOutTotal = new javax.swing.JTextField();
        lblCheckOutTotal = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        pnlRoomsProfile = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGuestsProfile = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRoomsClear = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox<>();
        pnlRevenueSearch = new javax.swing.JPanel();
        btnRevenueSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRevenue = new javax.swing.JTable();
        txtRevenueSearch = new javax.swing.JTextField();
        lblCheckInContact1 = new javax.swing.JLabel();
        txtRevenue = new javax.swing.JTextField();
        lblRevenue = new javax.swing.JLabel();
        btnRevenueClear = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pnlRoomTab = new javax.swing.JPanel();
        lblServices1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblSingle = new javax.swing.JLabel();
        lblDouble = new javax.swing.JLabel();
        lblDeluxe = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtareaSingle = new javax.swing.JTextArea();
        lblRoomsSingle = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtareaDouble = new javax.swing.JTextArea();
        lblRoomsDouble = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtareaDeluxeSuite = new javax.swing.JTextArea();
        lblRoomsDeluxeSuite = new javax.swing.JLabel();
        pnlAmenities = new javax.swing.JPanel();
        lblServices2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        lblGym = new javax.swing.JLabel();
        lblDining = new javax.swing.JLabel();
        lblSwimmingPool = new javax.swing.JLabel();
        lblSpa = new javax.swing.JLabel();
        lblAmSwimmingPool = new javax.swing.JLabel();
        lblAmDining = new javax.swing.JLabel();
        lblAmGym = new javax.swing.JLabel();
        lblAmSpa = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtareaDining = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtareaPool = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtareaPool1 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtareaPool2 = new javax.swing.JTextArea();
        pnlDestinations = new javax.swing.JPanel();
        lblServices3 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        lblMalls = new javax.swing.JLabel();
        lblMalls1 = new javax.swing.JLabel();
        lblMalls2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlTop.setBackground(new java.awt.Color(172, 127, 98));

        pnltabHome.setBackground(new java.awt.Color(187, 157, 142));
        pnltabHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnltabHomeMouseClicked(evt);
            }
        });

        lblHome.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblHome.setForeground(new java.awt.Color(254, 237, 204));
        lblHome.setText("Home");

        javax.swing.GroupLayout pnltabHomeLayout = new javax.swing.GroupLayout(pnltabHome);
        pnltabHome.setLayout(pnltabHomeLayout);
        pnltabHomeLayout.setHorizontalGroup(
            pnltabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltabHomeLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblHome)
                .addGap(23, 23, 23))
        );
        pnltabHomeLayout.setVerticalGroup(
            pnltabHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblRooms.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblRooms.setForeground(new java.awt.Color(254, 237, 204));
        lblRooms.setText("Rooms");
        lblRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRoomsMouseClicked(evt);
            }
        });

        lblAmenities.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblAmenities.setForeground(new java.awt.Color(254, 237, 204));
        lblAmenities.setText("Amenities");
        lblAmenities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAmenitiesMouseClicked(evt);
            }
        });

        lblDestinations.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        lblDestinations.setForeground(new java.awt.Color(254, 237, 204));
        lblDestinations.setText("Destinations");
        lblDestinations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDestinationsMouseClicked(evt);
            }
        });

        lblHotelName.setFont(new java.awt.Font("Benguiat", 0, 36)); // NOI18N
        lblHotelName.setForeground(new java.awt.Color(254, 237, 204));
        lblHotelName.setText("HYEITT HOTEL");

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\NetbeansFiles\\src\\logo.jpg")); // NOI18N
        jLabel25.setText("jLabel25");

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHotelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnltabHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblRooms)
                .addGap(28, 28, 28)
                .addComponent(lblAmenities)
                .addGap(26, 26, 26)
                .addComponent(lblDestinations)
                .addGap(18, 18, 18))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnltabHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblHotelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(lblRooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAmenities, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDestinations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlBody.setLayout(new java.awt.CardLayout());

        pnlHomeTab.setBackground(new java.awt.Color(92, 130, 143));

        lblServices.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        lblServices.setForeground(new java.awt.Color(254, 237, 204));
        lblServices.setText("SERVICES");

        tabServices.setBackground(new java.awt.Color(0, 0, 0));
        tabServices.setForeground(new java.awt.Color(254, 237, 204));
        tabServices.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabServices.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabServices.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabServices.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N

        pnlReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblReserveName.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblReserveName.setText("Guest's Name");

        txtReserveName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblReserveContact.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblReserveContact.setText("Contact Number");

        txtReserveContact.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblReserveCIN.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblReserveCIN.setText("Check-In");

        txtReserveCheckIn.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblReserveCOUT.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblReserveCOUT.setText("Check-Out");

        txtReserveCheckOut.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblReserveNo.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblReserveNo.setText("No. of Guests");

        txtReserveNo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblReserveType.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblReserveType.setText("Room Type");

        cmbReserveType.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbReserveType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Single", "Double", "Deluxe Suite" }));

        lblReserveCheckIn.setFont(new java.awt.Font("Bebas Neue", 0, 11)); // NOI18N
        lblReserveCheckIn.setText("MM-DD-YYYY HH:MM");

        lblReserveCheckOut.setFont(new java.awt.Font("Bebas Neue", 0, 11)); // NOI18N
        lblReserveCheckOut.setText("MM-DD-YYYY HH:MM");

        btnReserve.setBackground(new java.awt.Color(127, 183, 202));
        btnReserve.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnReserve.setForeground(new java.awt.Color(61, 62, 62));
        btnReserve.setText("Reserve");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        btnReserveCancel.setBackground(new java.awt.Color(127, 183, 202));
        btnReserveCancel.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnReserveCancel.setForeground(new java.awt.Color(61, 62, 62));
        btnReserveCancel.setText("Cancel Reservation");
        btnReserveCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveCancelActionPerformed(evt);
            }
        });

        tableReserve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"101", null, null, null, null},
                {"102", null, null, null, null},
                {"103", null, null, null, null},
                {"104", null, null, null, null},
                {"105", null, null, null, null},
                {"106", null, null, null, null},
                {"107", null, null, null, null},
                {"108", null, null, null, null},
                {"109", null, null, null, null},
                {"110", null, null, null, null},
                {"201", null, null, null, null},
                {"202", null, null, null, null},
                {"203", null, null, null, null},
                {"204", null, null, null, null},
                {"205", null, null, null, null},
                {"206", null, null, null, null},
                {"207", null, null, null, null},
                {"208", null, null, null, null},
                {"209", null, null, null, null},
                {"210", null, null, null, null},
                {"301", null, null, null, null},
                {"302", null, null, null, null},
                {"303", null, null, null, null},
                {"304", null, null, null, null},
                {"305", null, null, null, null},
                {"306", null, null, null, null},
                {"307", null, null, null, null},
                {"308", null, null, null, null},
                {"309", null, null, null, null},
                {"310", null, null, null, null}
            },
            new String [] {
                "Room No.", "Room Type", "Guest's Name", "Check-In", "Check-Out"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableReserve.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableReserve.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableReserve);
        if (tableReserve.getColumnModel().getColumnCount() > 0) {
            tableReserve.getColumnModel().getColumn(0).setResizable(false);
            tableReserve.getColumnModel().getColumn(1).setResizable(false);
            tableReserve.getColumnModel().getColumn(2).setResizable(false);
            tableReserve.getColumnModel().getColumn(3).setResizable(false);
            tableReserve.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout pnlReservationLayout = new javax.swing.GroupLayout(pnlReservation);
        pnlReservation.setLayout(pnlReservationLayout);
        pnlReservationLayout.setHorizontalGroup(
            pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservationLayout.createSequentialGroup()
                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservationLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlReservationLayout.createSequentialGroup()
                                .addComponent(lblReserveNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtReserveNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createSequentialGroup()
                                    .addComponent(lblReserveContact)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtReserveContact, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createSequentialGroup()
                                    .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlReservationLayout.createSequentialGroup()
                                            .addComponent(lblReserveType)
                                            .addGap(59, 59, 59))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlReservationLayout.createSequentialGroup()
                                            .addComponent(lblReserveName)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbReserveType, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtReserveName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlReservationLayout.createSequentialGroup()
                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReserveCIN)
                                    .addComponent(lblReserveCOUT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtReserveCheckIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(txtReserveCheckOut, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createSequentialGroup()
                                .addComponent(lblReserveCheckOut)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createSequentialGroup()
                                .addComponent(lblReserveCheckIn)
                                .addGap(127, 127, 127)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReservationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReserve)
                .addGap(18, 18, 18)
                .addComponent(btnReserveCancel)
                .addGap(169, 169, 169))
        );
        pnlReservationLayout.setVerticalGroup(
            pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservationLayout.createSequentialGroup()
                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservationLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlReservationLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbReserveType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReserveType))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReserveName)
                            .addComponent(txtReserveName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReserveContact)
                            .addComponent(txtReserveContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReserveNo)
                            .addComponent(txtReserveNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReserveCIN)
                            .addComponent(txtReserveCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReserveCheckIn)
                        .addGap(21, 21, 21)
                        .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReserveCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblReserveCOUT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReserveCheckOut)))
                .addGap(18, 18, 18)
                .addGroup(pnlReservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReserve)
                    .addComponent(btnReserveCancel))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabServices.addTab("Reservation", pnlReservation);

        lblCheckInNo.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckInNo.setText("No. of Guests");

        lblCheckInName.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckInName.setText("Guest's Name");

        txtCheckInNo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        txtCheckInName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblCheckInType.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckInType.setText("Room Type");

        lblCheckInContact.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckInContact.setText("Contact Number");

        cmbCheckInType.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbCheckInType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Single", "Double", "Deluxe Suite" }));

        txtCheckInContact.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblCheckInCIN1.setFont(new java.awt.Font("Bebas Neue", 0, 11)); // NOI18N
        lblCheckInCIN1.setText("MM-DD-YYYY HH:MM");

        lblCheckInCIN.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckInCIN.setText("Check-In");

        txtCheckInCIN.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        btnCheckInCancel.setBackground(new java.awt.Color(127, 183, 202));
        btnCheckInCancel.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCheckInCancel.setForeground(new java.awt.Color(61, 62, 62));
        btnCheckInCancel.setText("Cancel");
        btnCheckInCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInCancelActionPerformed(evt);
            }
        });

        btnCheckIn.setBackground(new java.awt.Color(127, 183, 202));
        btnCheckIn.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCheckIn.setForeground(new java.awt.Color(61, 62, 62));
        btnCheckIn.setText("Check In");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCheckInLayout = new javax.swing.GroupLayout(pnlCheckIn);
        pnlCheckIn.setLayout(pnlCheckInLayout);
        pnlCheckInLayout.setHorizontalGroup(
            pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckInLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(pnlCheckInLayout.createSequentialGroup()
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCheckInLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCheckInLayout.createSequentialGroup()
                                    .addComponent(lblCheckInNo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCheckInNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlCheckInLayout.createSequentialGroup()
                                    .addComponent(lblCheckInContact)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCheckInContact, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlCheckInLayout.createSequentialGroup()
                                    .addComponent(lblCheckInName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCheckInName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlCheckInLayout.createSequentialGroup()
                                    .addComponent(lblCheckInCIN)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCheckInCIN, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCheckInLayout.createSequentialGroup()
                                .addComponent(lblCheckInType)
                                .addGap(59, 59, 59)
                                .addComponent(cmbCheckInType, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckInLayout.createSequentialGroup()
                                .addComponent(lblCheckInCIN1)
                                .addGap(51, 51, 51))))
                    .addGroup(pnlCheckInLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(btnCheckIn)
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckInCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCheckInLayout.setVerticalGroup(
            pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckInLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCheckInType)
                    .addComponent(cmbCheckInType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckInName)
                    .addComponent(txtCheckInName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCheckInContact)
                    .addComponent(txtCheckInContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckInNo)
                    .addComponent(txtCheckInNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckInCIN)
                    .addComponent(txtCheckInCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCheckInCIN1)
                .addGap(36, 36, 36)
                .addGroup(pnlCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckIn)
                    .addComponent(btnCheckInCancel))
                .addGap(40, 40, 40))
        );

        tabServices.addTab("Check-In", pnlCheckIn);

        lblCheckOutName.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutName.setText("Guest's Name");

        txtCheckOutName.setEditable(false);
        txtCheckOutName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        btnCheckOut.setBackground(new java.awt.Color(127, 183, 202));
        btnCheckOut.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(61, 62, 62));
        btnCheckOut.setText("Check Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        lblCheckOutRoomNo.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutRoomNo.setText("Room No. ");

        txtCheckOutRoomNo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblCheckOutType.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutType.setText("Room type");

        txtCheckOutType.setEditable(false);
        txtCheckOutType.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblCheckOutFee.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutFee.setText("Fee");

        txtCheckOutFee.setEditable(false);
        txtCheckOutFee.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        txtCheckOutCOUT.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblCheckOutCOUT.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutCOUT.setText("Check-out");

        lblCheckOutDate.setFont(new java.awt.Font("Bebas Neue", 0, 11)); // NOI18N
        lblCheckOutDate.setText("MM-DD-YYYY HH:MM");
        lblCheckOutDate.setToolTipText("");

        txtCheckOutNo.setEditable(false);
        txtCheckOutNo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        lblCheckOutNo.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutNo.setText("No. of Hours Stayed");

        txtCheckOutTotal.setEditable(false);
        txtCheckOutTotal.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtCheckOutTotal.setText("PhP 0.00");

        lblCheckOutTotal.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckOutTotal.setText("Total Bill");

        btnClear.setBackground(new java.awt.Color(127, 183, 202));
        btnClear.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(61, 62, 62));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCheckOutLayout = new javax.swing.GroupLayout(pnlCheckOut);
        pnlCheckOut.setLayout(pnlCheckOutLayout);
        pnlCheckOutLayout.setHorizontalGroup(
            pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCheckOutLayout.createSequentialGroup()
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCheckOutLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCheckOutName)
                                    .addComponent(lblCheckOutType)
                                    .addComponent(lblCheckOutFee)
                                    .addComponent(lblCheckOutNo)
                                    .addComponent(lblCheckOutTotal))
                                .addGap(41, 41, 41)
                                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCheckOutTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheckOutNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheckOutFee, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheckOutType, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheckOutName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                .addComponent(lblCheckOutRoomNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtCheckOutRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(lblCheckOutCOUT)
                                .addGap(36, 36, 36)
                                .addComponent(txtCheckOutCOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCheckOutLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(btnCheckOut)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear))))
                    .addGroup(pnlCheckOutLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckOutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCheckOutDate)
                .addGap(290, 290, 290))
        );
        pnlCheckOutLayout.setVerticalGroup(
            pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCheckOutLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCheckOutRoomNo)
                    .addComponent(lblCheckOutCOUT)
                    .addComponent(txtCheckOutCOUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckOutRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCheckOutDate)
                .addGap(26, 26, 26)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckOutName)
                    .addComponent(txtCheckOutName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckOutType)
                    .addComponent(txtCheckOutType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckOutFee)
                    .addComponent(txtCheckOutFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckOutNo)
                    .addComponent(txtCheckOutNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCheckOutTotal)
                    .addComponent(txtCheckOutTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut)
                    .addComponent(btnClear))
                .addGap(33, 33, 33))
        );

        tabServices.addTab("Check-Out", pnlCheckOut);

        tableGuestsProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "101", null, null, null, null, null, null, "Available"},
                {"2", "102", null, null, null, null, null, null, "Available"},
                {"3", "103", null, null, null, null, null, null, "Available"},
                {"4", "104", null, null, null, null, null, null, "Available"},
                {"5", "105", null, null, null, null, null, null, "Available"},
                {"6", "106", null, null, null, null, null, null, "Available"},
                {"7", "107", null, null, null, null, null, null, "Available"},
                {"8", "108", null, null, null, null, null, null, "Available"},
                {"9", "109", null, null, null, null, null, null, "Available"},
                {"10", "110", null, null, null, null, null, null, "Available"},
                {"11", "201", null, null, null, null, null, null, "Available"},
                {"12", "202", null, null, null, null, null, null, "Available"},
                {"13", "203", null, null, null, null, null, null, "Available"},
                {"14", "204", null, null, null, null, null, null, "Available"},
                {"15", "205", null, null, null, null, null, null, "Available"},
                {"16", "206", null, null, null, null, null, null, "Available"},
                {"17", "207", null, null, null, null, null, null, "Available"},
                {"18", "208", null, null, null, null, null, null, "Available"},
                {"19", "209", null, null, null, null, null, null, "Available"},
                {"20", "210", null, null, null, null, null, null, "Available"},
                {"21", "301", null, null, null, null, null, null, "Available"},
                {"22", "302", null, null, null, null, null, null, "Available"},
                {"23", "303", null, null, null, null, null, null, "Available"},
                {"24", "304", null, null, null, null, null, null, "Available"},
                {"25", "305", null, null, null, null, null, null, "Available"},
                {"26", "306", null, null, null, null, null, null, "Available"},
                {"27", "307", null, null, null, null, null, null, "Available"},
                {"28", "308", null, null, null, null, null, null, "Available"},
                {"29", "309", null, null, null, null, null, null, "Available"},
                {"30", "310", null, null, null, null, null, null, "Available"}
            },
            new String [] {
                "#", "Room No.", "Room Type", "Guest's Name", "Contact No.", "No. of Guests", "Check-In", "Check-Out", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGuestsProfile.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableGuestsProfile.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableGuestsProfile);
        if (tableGuestsProfile.getColumnModel().getColumnCount() > 0) {
            tableGuestsProfile.getColumnModel().getColumn(0).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(1).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(2).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(3).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(4).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(5).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(6).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(7).setResizable(false);
            tableGuestsProfile.getColumnModel().getColumn(8).setResizable(false);
        }

        btnSearch.setBackground(new java.awt.Color(127, 183, 202));
        btnSearch.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(61, 62, 62));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N

        btnRoomsClear.setBackground(new java.awt.Color(127, 183, 202));
        btnRoomsClear.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnRoomsClear.setForeground(new java.awt.Color(61, 62, 62));
        btnRoomsClear.setText("Clear");
        btnRoomsClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsClearActionPerformed(evt);
            }
        });

        cmbStatus.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRoomsProfileLayout = new javax.swing.GroupLayout(pnlRoomsProfile);
        pnlRoomsProfile.setLayout(pnlRoomsProfileLayout);
        pnlRoomsProfileLayout.setHorizontalGroup(
            pnlRoomsProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRoomsProfileLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRoomsProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRoomsClear)
                .addGap(235, 235, 235))
        );
        pnlRoomsProfileLayout.setVerticalGroup(
            pnlRoomsProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRoomsProfileLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlRoomsProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRoomsProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnRoomsClear)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabServices.addTab("Rooms/Profile", pnlRoomsProfile);

        btnRevenueSearch.setBackground(new java.awt.Color(127, 183, 202));
        btnRevenueSearch.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnRevenueSearch.setForeground(new java.awt.Color(61, 62, 62));
        btnRevenueSearch.setText("Search");
        btnRevenueSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueSearchActionPerformed(evt);
            }
        });

        tableRevenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check-Out ", "Room No.", "Room Type", "Room Price", "No. of Hours Stayed", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRevenue.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tableRevenue.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tableRevenue);
        if (tableRevenue.getColumnModel().getColumnCount() > 0) {
            tableRevenue.getColumnModel().getColumn(0).setResizable(false);
            tableRevenue.getColumnModel().getColumn(1).setResizable(false);
            tableRevenue.getColumnModel().getColumn(2).setResizable(false);
            tableRevenue.getColumnModel().getColumn(3).setResizable(false);
            tableRevenue.getColumnModel().getColumn(4).setResizable(false);
            tableRevenue.getColumnModel().getColumn(5).setResizable(false);
        }

        txtRevenueSearch.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtRevenueSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCheckInContact1.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblCheckInContact1.setText("Search");

        txtRevenue.setEditable(false);
        txtRevenue.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtRevenue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRevenue.setText("PhP 0.00");

        lblRevenue.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        lblRevenue.setText("Total Revenue");

        btnRevenueClear.setBackground(new java.awt.Color(127, 183, 202));
        btnRevenueClear.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnRevenueClear.setForeground(new java.awt.Color(61, 62, 62));
        btnRevenueClear.setText("Clear");
        btnRevenueClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevenueClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRevenueSearchLayout = new javax.swing.GroupLayout(pnlRevenueSearch);
        pnlRevenueSearch.setLayout(pnlRevenueSearchLayout);
        pnlRevenueSearchLayout.setHorizontalGroup(
            pnlRevenueSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueSearchLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlRevenueSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRevenue)
                    .addComponent(txtRevenueSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckInContact1)
                    .addComponent(txtRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRevenueSearchLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnRevenueSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRevenueClear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRevenueSearchLayout.setVerticalGroup(
            pnlRevenueSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRevenueSearchLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblCheckInContact1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRevenueSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRevenueSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRevenueSearch)
                    .addComponent(btnRevenueClear))
                .addGap(79, 79, 79)
                .addComponent(lblRevenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRevenueSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabServices.addTab("Revenue", pnlRevenueSearch);

        javax.swing.GroupLayout pnlHomeTabLayout = new javax.swing.GroupLayout(pnlHomeTab);
        pnlHomeTab.setLayout(pnlHomeTabLayout);
        pnlHomeTabLayout.setHorizontalGroup(
            pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabServices)
                    .addGroup(pnlHomeTabLayout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblServices)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlHomeTabLayout.setVerticalGroup(
            pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHomeTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHomeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHomeTabLayout.createSequentialGroup()
                            .addComponent(lblServices)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeTabLayout.createSequentialGroup()
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeTabLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addComponent(tabServices)
                .addContainerGap())
        );

        tabServices.getAccessibleContext().setAccessibleDescription("");

        pnlBody.add(pnlHomeTab, "card2");


    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // TODO add your handling code here:
        Reserve();
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        // TODO add your handling code here:
        CheckIn();
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnReserveCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveCancelActionPerformed
        // TODO add your handling code here:
        CancelReserve();
    }//GEN-LAST:event_btnReserveCancelActionPerformed

    private void btnCheckInCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInCancelActionPerformed
        // TODO add your handling code here:
        cmbCheckInType.setSelectedItem(" ");
        txtCheckInName.setText("");
        txtCheckInContact.setText("");
        txtCheckInNo.setText("");
        txtCheckInCIN.setText(null);
    }//GEN-LAST:event_btnCheckInCancelActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        try {
            CheckOut();
        } catch (ParseException ex) {
            Logger.getLogger(NewProposal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRoomsClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomsClearActionPerformed
        // TODO add your handling code here:
        String[] checkin = {null, null, cmbCheckInType.getSelectedItem().toString(), txtCheckInName.getText(), txtCheckInCIN.getText(), txtCheckOutCOUT.getText(), null};
        DefaultTableModel checkinModel = (DefaultTableModel)tableGuestsProfile.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (checkinModel);
        tableGuestsProfile.setRowSorter(tr);
        txtSearch.setText("");
    }//GEN-LAST:event_btnRoomsClearActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
        String[] checkin = {null, null, cmbCheckInType.getSelectedItem().toString(), txtCheckInName.getText(), txtCheckInCIN.getText(), txtCheckOutCOUT.getText(), null};
        DefaultTableModel checkinModel = (DefaultTableModel)tableGuestsProfile.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (checkinModel);
        tableGuestsProfile.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(cmbStatus.getSelectedItem().toString()));
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void btnRevenueSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueSearchActionPerformed
        // TODO add your handling code here:
        RevenueSearch();
    }//GEN-LAST:event_btnRevenueSearchActionPerformed

    private void btnRevenueClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevenueClearActionPerformed
        // TODO add your handling code here:
        txtRevenueSearch.setText("");
        RevenueSearch();
        txtRevenue.setText("PhP " + 0.00);
    }//GEN-LAST:event_btnRevenueClearActionPerformed

    private void pnltabHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnltabHomeMouseClicked
        // TODO add your handling code here:
        pnlBody.removeAll();
        pnlBody.add(pnlHomeTab);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_pnltabHomeMouseClicked

    private void lblRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRoomsMouseClicked
        // TODO add your handling code here:
        pnlBody.removeAll();
        pnlBody.add(pnlRoomTab);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_lblRoomsMouseClicked

    private void lblAmenitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAmenitiesMouseClicked
        // TODO add your handling code here:
        pnlBody.removeAll();
        pnlBody.add(pnlAmenities);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_lblAmenitiesMouseClicked

    private void lblDestinationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDestinationsMouseClicked
        // TODO add your handling code here:
        pnlBody.removeAll();
        pnlBody.add(pnlDestinations);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_lblDestinationsMouseClicked

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
            java.util.logging.Logger.getLogger(NewProposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProposal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProposal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckInCancel;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnReserveCancel;
    private javax.swing.JButton btnRevenueClear;
    private javax.swing.JButton btnRevenueSearch;
    private javax.swing.JButton btnRoomsClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCheckInType;
    private javax.swing.JComboBox<String> cmbReserveType;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAmDining;
    private javax.swing.JLabel lblAmGym;
    private javax.swing.JLabel lblAmSpa;
    private javax.swing.JLabel lblAmSwimmingPool;
    private javax.swing.JLabel lblAmenities;
    private javax.swing.JLabel lblCheckInCIN;
    private javax.swing.JLabel lblCheckInCIN1;
    private javax.swing.JLabel lblCheckInContact;
    private javax.swing.JLabel lblCheckInContact1;
    private javax.swing.JLabel lblCheckInName;
    private javax.swing.JLabel lblCheckInNo;
    private javax.swing.JLabel lblCheckInType;
    private javax.swing.JLabel lblCheckOutCOUT;
    private javax.swing.JLabel lblCheckOutDate;
    private javax.swing.JLabel lblCheckOutFee;
    private javax.swing.JLabel lblCheckOutName;
    private javax.swing.JLabel lblCheckOutNo;
    private javax.swing.JLabel lblCheckOutRoomNo;
    private javax.swing.JLabel lblCheckOutTotal;
    private javax.swing.JLabel lblCheckOutType;
    private javax.swing.JLabel lblDeluxe;
    private javax.swing.JLabel lblDestinations;
    private javax.swing.JLabel lblDining;
    private javax.swing.JLabel lblDouble;
    private javax.swing.JLabel lblGym;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHotelName;
    private javax.swing.JLabel lblMalls;
    private javax.swing.JLabel lblMalls1;
    private javax.swing.JLabel lblMalls2;
    private javax.swing.JLabel lblReserveCIN;
    private javax.swing.JLabel lblReserveCOUT;
    private javax.swing.JLabel lblReserveCheckIn;
    private javax.swing.JLabel lblReserveCheckOut;
    private javax.swing.JLabel lblReserveContact;
    private javax.swing.JLabel lblReserveName;
    private javax.swing.JLabel lblReserveNo;
    private javax.swing.JLabel lblReserveType;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JLabel lblRooms;
    private javax.swing.JLabel lblRoomsDeluxeSuite;
    private javax.swing.JLabel lblRoomsDouble;
    private javax.swing.JLabel lblRoomsSingle;
    private javax.swing.JLabel lblServices;
    private javax.swing.JLabel lblServices1;
    private javax.swing.JLabel lblServices2;
    private javax.swing.JLabel lblServices3;
    private javax.swing.JLabel lblSingle;
    private javax.swing.JLabel lblSpa;
    private javax.swing.JLabel lblSwimmingPool;
    private javax.swing.JPanel pnlAmenities;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlCheckIn;
    private javax.swing.JPanel pnlCheckOut;
    private javax.swing.JPanel pnlDestinations;
    private javax.swing.JPanel pnlHomeTab;
    private javax.swing.JPanel pnlReservation;
    private javax.swing.JPanel pnlRevenueSearch;
    private javax.swing.JPanel pnlRoomTab;
    private javax.swing.JPanel pnlRoomsProfile;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnltabHome;
    private javax.swing.JTabbedPane tabServices;
    private javax.swing.JTable tableGuestsProfile;
    private javax.swing.JTable tableReserve;
    private javax.swing.JTable tableRevenue;
    private javax.swing.JTextField txtCheckInCIN;
    private javax.swing.JTextField txtCheckInContact;
    private javax.swing.JTextField txtCheckInName;
    private javax.swing.JTextField txtCheckInNo;
    private javax.swing.JTextField txtCheckOutCOUT;
    private javax.swing.JTextField txtCheckOutFee;
    private javax.swing.JTextField txtCheckOutName;
    private javax.swing.JTextField txtCheckOutNo;
    private javax.swing.JTextField txtCheckOutRoomNo;
    private javax.swing.JTextField txtCheckOutTotal;
    private javax.swing.JTextField txtCheckOutType;
    private javax.swing.JTextField txtReserveCheckIn;
    private javax.swing.JTextField txtReserveCheckOut;
    private javax.swing.JTextField txtReserveContact;
    private javax.swing.JTextField txtReserveName;
    private javax.swing.JTextField txtReserveNo;
    private javax.swing.JTextField txtRevenue;
    private javax.swing.JTextField txtRevenueSearch;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextArea txtareaDeluxeSuite;
    private javax.swing.JTextArea txtareaDining;
    private javax.swing.JTextArea txtareaDouble;
    private javax.swing.JTextArea txtareaPool;
    private javax.swing.JTextArea txtareaPool1;
    private javax.swing.JTextArea txtareaPool2;
    private javax.swing.JTextArea txtareaSingle;
    // End of variables declaration//GEN-END:variables
}
