import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarun
 */
public class Record extends JPanel {
			Record()
			{
				this.setBounds(0, 0, 630, 450);
   //this.setBackground(Color.BLUE);
   jLabel1 = new javax.swing.JLabel();
   jScrollPane1 = new javax.swing.JScrollPane();
   jTable1 = new javax.swing.JTable();

   jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
   jLabel1.setText("Usage Database");

   jTable1.setModel(new javax.swing.table.DefaultTableModel(
       new Object [][] {
           {"20-feb-2018", "2kWH", null, null},
           {"21-feb-2018", "3kWH", null, null},
           {"22-feb-2018", "1kWH", null, null},
           {"23-feb-2018", "1kWH", null, null},
           {"24-feb-2018", "2kWH", null, null},
           {"25-feb-2018", "2kWH", null, null},
           {"26-feb-2018", "6kWH", null, null},
           {"27-feb-2018", "2kWH", null, null},
           {"28-feb-2018", "2kWH", null, null},
           {"29-feb-2018", "2kWH", null, null},
           {"30-feb-2018", "2kWH", null, null},
           {"01-march-2018", "1kWH", null, null},
           {"02-march-2018", "22kWH", null, null},
           {"03-march-2018", "0.2kWH", null, null},
           {"04-march-2018", "2kWH", null, null},
           {"05-march-2018", "2kWH", null, null},
           {null, null, null, null},
           {null, null, null, null}
       },
       new String [] {
           "Date", "Total Consumption", "Cost", "Total Time"
       }
   ) {
       Class[] types = new Class [] {
           java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
       };
       boolean[] canEdit = new boolean [] {
           false, false, false, false
       };

       public Class getColumnClass(int columnIndex) {
           return types [columnIndex];
       }

       public boolean isCellEditable(int rowIndex, int columnIndex) {
           return canEdit [columnIndex];
       }
   });
   jScrollPane1.setViewportView(jTable1);

   javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
   this.setLayout(layout);
   layout.setHorizontalGroup(
       layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
           .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
           .addGap(92, 92, 92))
       .addGroup(layout.createSequentialGroup()
           .addGap(23, 23, 23)
           .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
           .addContainerGap(24, Short.MAX_VALUE))
   );
   layout.setVerticalGroup(
       layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(layout.createSequentialGroup()
           .addContainerGap()
           .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
           .addGap(18, 18, 18)
           .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
           .addContainerGap(43, Short.MAX_VALUE))
   );
}// </editor-fold>                        


// Variables declaration - do not modify                     
private javax.swing.JLabel jLabel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTable jTable1;
// End of variables declaration         
			
}
