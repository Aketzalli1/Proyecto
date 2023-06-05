package org.example.Vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPintores extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblNacimiento;
    private JLabel lblLugar;
    private JLabel lblEstilo;
    private JLabel lblUrl;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtNacimiento;
    private JTextField txtLugar;
    private JTextField txtEstilo;
    private JTextField txtUrl;
    private JLabel lblNombre1;
    private JLabel lblNacimiento1;
    private JLabel lblLugar1;
    private JLabel lblEstilo1;
    private JLabel lblUrl1;
    private JTextField txtNombre1;
    private JTextField txtNacimiento1;
    private JTextField txtLugar1;
    private JTextField txtEstilo1;
    private JTextField txtUrl1;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;

    private JScrollPane scrollPane;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTable tblPint;
    private JLabel lblImagenPin;

    public VentanaPintores(String title) throws HeadlessException {
        super(title);
        this.setSize(1100, 1100);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);
        // panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(225, 151, 151));

        lblId = new JLabel("ID:");
        lblNombre = new JLabel("Nombre:");
        lblNacimiento = new JLabel("F.nac(DD/MM/AAA):");
        lblLugar = new JLabel("L.nac:");
        lblEstilo = new JLabel("Estilo:");

        lblUrl = new JLabel("Url");
        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(20);
        txtNacimiento = new JTextField(8);
        txtLugar = new JTextField(15);
        txtEstilo = new JTextField(8);
        txtUrl = new JTextField(20);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblNacimiento);
        panel1.add(txtNacimiento);
        panel1.add(lblLugar);
        panel1.add(txtLugar);
        panel1.add(lblEstilo);
        panel1.add(txtEstilo);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

        // panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(138, 131, 131));

        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);

        tblPint = new JTable();
        scrollPane = new JScrollPane(tblPint);

        panel2.add(scrollPane);



        // panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(181, 229, 156));
        lblImagenPin = new JLabel("....");
        this.panel3.add(lblImagenPin);

        // panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(232, 181, 126));
        lblNombre1 = new JLabel("Nombre:");
        lblNacimiento1 = new JLabel("F.nac(DD/MM/AAA):");
        lblLugar1 = new JLabel("L.nac:");
        lblEstilo1= new JLabel("Estilo:");
        lblUrl1 = new JLabel("Url:");
        btnEliminar = new JButton("Eliminar");
        btnActualizar = new JButton("Actualizar");
        txtNombre1 = new JTextField(20);
        txtNacimiento1 = new JTextField(8);
        txtLugar1 = new JTextField(15);
        txtEstilo1 = new JTextField(8);
        txtUrl1 = new JTextField(20);
        panel4.add(lblNombre1);
        panel4.add(txtNombre1);
        panel4.add(lblNacimiento1);
        panel4.add(txtNacimiento1);
        panel4.add(lblLugar1);
        panel4.add(txtLugar1);
        panel4.add(lblEstilo1);
        panel4.add(txtEstilo1);
        panel4.add(lblUrl1);
        panel4.add(txtUrl1);
        panel4.add(btnActualizar);
        panel4.add(btnEliminar);

        this.getContentPane().add(panel1, 0);
        this.getContentPane().add(panel2, 1);
        this.getContentPane().add(panel3, 2);
        this.getContentPane().add(panel4, 3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblNombre1() {
        return lblNombre1;
    }

    public void setLblNombre1(JLabel lblNombre1) {
        this.lblNombre1 = lblNombre1;
    }

    public JLabel getLblNacimiento1() {
        return lblNacimiento1;
    }

    public void setLblNacimiento1(JLabel lblNacimiento1) {
        this.lblNacimiento1 = lblNacimiento1;
    }

    public JLabel getLblLugar1() {
        return lblLugar1;
    }

    public void setLblLugar1(JLabel lblLugar1) {
        this.lblLugar1 = lblLugar1;
    }

    public JLabel getLblEstilo1() {
        return lblEstilo1;
    }

    public void setLblEstilo1(JLabel lblEstilo1) {
        this.lblEstilo1 = lblEstilo1;
    }

    public JLabel getLblUrl1() {
        return lblUrl1;
    }

    public void setLblUrl1(JLabel lblUrl1) {
        this.lblUrl1 = lblUrl1;
    }

    public JTextField getTxtNombre1() {
        return txtNombre1;
    }

    public void setTxtNombre1(JTextField txtNombre1) {
        this.txtNombre1 = txtNombre1;
    }

    public JTextField getTxtNacimiento1() {
        return txtNacimiento1;
    }

    public void setTxtNacimiento1(JTextField txtNacimiento1) {
        this.txtNacimiento1 = txtNacimiento1;
    }

    public JTextField getTxtLugar1() {
        return txtLugar1;
    }

    public void setTxtLugar1(JTextField txtLugar1) {
        this.txtLugar1 = txtLugar1;
    }

    public JTextField getTxtEstilo1() {
        return txtEstilo1;
    }

    public void setTxtEstilo1(JTextField txtEstilo1) {
        this.txtEstilo1 = txtEstilo1;
    }

    public JTextField getTxtUrl1() {
        return txtUrl1;
    }

    public void setTxtUrl1(JTextField txtUrl1) {
        this.txtUrl1 = txtUrl1;
    }

    public JLabel getLblImagenPin() {
        return lblImagenPin;
    }

    public void setLblImagenPin(JLabel lblImagenPin) {
        this.lblImagenPin = lblImagenPin;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblNacimiento() {
        return lblNacimiento;
    }

    public void setLblNacimiento(JLabel lblNacimiento) {
        this.lblNacimiento = lblNacimiento;
    }

    public JLabel getLblLugar() {
        return lblLugar;
    }

    public void setLblLugar(JLabel lblLugar) {
        this.lblLugar = lblLugar;
    }

    public JLabel getLblEstilo() {
        return lblEstilo;
    }

    public void setLblEstilo(JLabel lblEstilo) {
        this.lblEstilo = lblEstilo;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNacimiento() {
        return txtNacimiento;
    }

    public void setTxtNacimiento(JTextField txtNacimiento) {
        this.txtNacimiento = txtNacimiento;
    }

    public JTextField getTxtLugar() {
        return txtLugar;
    }

    public void setTxtLugar(JTextField txtLugar) {
        this.txtLugar = txtLugar;
    }

    public JTextField getTxtEstilo() {
        return txtEstilo;
    }

    public void setTxtEstilo(JTextField txtEstilo) {
        this.txtEstilo = txtEstilo;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JTable getTblPint() {
        return tblPint;
    }

    public void setTblPint(JTable tblPint) {
        this.tblPint = tblPint;
    }

    public void limpiar() {
        txtEstilo.setText("");
        txtUrl.setText("");
        txtNombre.setText("");
        txtId.setText("");
        txtNacimiento.setText("");
        txtLugar.setText("");
    }
}


