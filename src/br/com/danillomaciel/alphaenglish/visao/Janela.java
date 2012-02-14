/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.danillomaciel.alphaenglish.visao;

import br.com.danillomaciel.alphaenglish.modelo.Frase;
import br.com.danillomaciel.alphaenglish.persistencia.FraseDao;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Janela extends JFrame {
    private JLabel lblPt, lblEn;
    private JButton btnRnd;
    private JTextField txtPt, txtEn;
    private JMenu mnuCad, mnuCon;
    private JMenuBar mbarMenu;
    private final JPanel painel1, painel2;
    
    public Janela(){
        setLayout(new GridLayout(2,1));
        //instancia componentes
        lblPt = new JLabel("Digite a Frase em Português: ");
        lblEn = new JLabel("Digite a Frase em Inglês: ");
        txtPt = new JTextField(30);
        txtEn = new JTextField(30);
        btnRnd = new JButton("Start");

        painel1 = new JPanel();
         painel2 = new JPanel();
        //painel1 = setLayout(new GridLayout(3,2));

        //Adciona cada componente ao frame
        painel1.add(lblPt);
      painel1.add(txtPt);
        painel1.add(lblEn);
        painel1.add(txtEn);
        mnuCad = new JMenu("Cadastrar");
        mnuCon = new JMenu("Consultar");

        

        mbarMenu = new JMenuBar();
        mbarMenu.add(mnuCad);
        mbarMenu.add(mnuCon);

        setJMenuBar(mbarMenu);

       // painel2 = new JPainel();
        painel2.setLayout(new FlowLayout());
        painel2.add(btnRnd);

        add(painel1);
        add(painel2);
        






        //Instancia e registra o listener do TextField
        TrataBtn ttBtn = new TrataBtn();
        //txtIdade.addActionListener(ttf);

        btnRnd.addActionListener(ttBtn);

      
        }
    public class TrataBtn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try {
                Frase f = new Frase();
                FraseDao fd = new FraseDao();
                f.setfPortugues(txtPt.getText());
                f.setfIngles(txtEn.getText());
                fd.gravar(f);
                btnRnd.setText("O evento funciona");
            } catch (Exception ex) {
                Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
            }

        }






        
    }



}
