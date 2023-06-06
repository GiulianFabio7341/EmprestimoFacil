import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Gui2 extends JFrame {
    private JPanel Interface2;
    private JLabel labelFoto;
    private JLabel labelValor;
    private JLabel labelValordigitado;
    private JTextField textFieldValor;
    private JLabel labelValormessagem;
    private JLabel labelValormostrado;
    private JButton button2Mat;
    private JList listValores;

    private JLabel labelValormostrado2;

    private JTextField textFieldValor2;

    private JButton button3Mat;

    //Método Construtor
    public Gui2(String title){
//Chama o construtor de JFrame
        super(title);
//Faz o programa encerrar ao fechar a janela
        this.setDefaultCloseOperation(JFrame. DISPOSE_ON_CLOSE );
//Adiciona o Panel criado para a janela
        this.setContentPane(Interface2);
//Ajusta os tamanhos mínimos dos componentes
        this.pack();
        //criou a ação do butão com o listener
        JOptionPane.showMessageDialog(null,"Olá, Seja bem vindo(a) ao empréstimo facil ");
        this.setSize(1920,1080);

        labelValor = new JLabel("<html>Prezado(a) cliente, agradecemos sempre por sua confiança em nossos serviços!<br>Digite por favor na parte inferior " +
                "o valor desejado para retirada </html>");
        labelValor.setBounds(0,0,500,150);
        labelValor.setOpaque(true);
        labelValor.setForeground(Color.black);
        labelValor.setBackground(Color.white);
        labelFoto.add(labelValor);
        //Font fonteTamanhoNovo = new Font( "Serif", Font.PLAIN, 24);
        //seuLabel.setFont(fonteTamanhoNovo);
        Font fonteNovo=new Font("Serif",Font.PLAIN,24);
        labelValor.setFont(fonteNovo);

        labelValordigitado=new JLabel("DIGITE AQUI O VALOR DESEJADO:");
        labelValordigitado.setBounds(0,200,340,50);
        labelValordigitado.setOpaque(true);
        labelValordigitado.setForeground(Color.black);
        labelValordigitado.setBackground(Color.green);
        Font fonteNovo1=new Font("Arial",Font.PLAIN,20);
        labelValordigitado.setFont(fonteNovo1);
        labelFoto.add(labelValordigitado);

       textFieldValor=new JTextField();
       textFieldValor.setBounds(340,200,100,50);
       textFieldValor.setBackground(Color.GREEN);
       labelFoto.add(textFieldValor);

       button2Mat=new JButton("Confirmar");
       button2Mat.setBounds(440,200,100,50);
       labelFoto.add(button2Mat);


        labelValormessagem=new JLabel("SEU VALOR DESEJADO FOI:");
        labelValormessagem.setBounds(0,250,340,50);
        labelValormessagem.setOpaque(true);
        labelValormessagem.setForeground(Color.black);
        labelValormessagem.setBackground(Color.green);
        Font fonteNovo2=new Font("Arial",Font.PLAIN,20);
        labelValormessagem.setFont(fonteNovo1);
        labelFoto.add(labelValormessagem);

        labelValormostrado=new JLabel();
        labelValormostrado.setBounds(340,250,100,50);
        labelValormostrado.setOpaque(true);
        labelValormostrado.setForeground(Color.black);
        labelValormostrado.setBackground(Color.green);
        Font fonteNovo3=new Font("Arial",Font.PLAIN,20);
        labelValormostrado.setFont(fonteNovo1);

        labelFoto.add(labelValormostrado);


        button2Mat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double nome= Double.parseDouble(textFieldValor.getText());
                double valormulti=nome;
                DecimalFormat df= new DecimalFormat("0.00");
                labelValormostrado.setText(String.valueOf(valormulti));

            }
        });
        String[] pagamento={"12 Meses-Pagamento com juros ","13 Meses-Pagamento com juros ","14 Meses-Pagamento com juros "
        ,"15 Meses-Pagamento com juros ","16 Meses-Pagamento com juros","17 Meses-Pagamento com juros ","18 Meses-pagamento com juros ",
                "19 Meses-Pagamento com juros","20 Meses-Pagamento com juros","21 Meses-Pagamento com juros","22 Meses-Pagamento com juros",
                "23 Meses-Pagamento com juros","24 Meses-Pagamento com juros"};
        listValores=new JList(pagamento);
        Font fonteNovo4=new Font("Arial",Font.PLAIN,20);
        listValores.setFont(fonteNovo3);
        listValores.setBounds(0,670,300,350);
        listValores.setBackground(Color.green);
        labelFoto.add(listValores);

        listValores.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                double valoresnovos=Double.parseDouble(textFieldValor.getText());
                DecimalFormat df= new DecimalFormat("0.00");
                double [] lista={valoresnovos+30.0,valoresnovos+60,valoresnovos+90,
                valoresnovos+120,valoresnovos+150,valoresnovos+180,valoresnovos+210,
                valoresnovos+240,valoresnovos+270,valoresnovos+360,valoresnovos+390,valoresnovos+420,valoresnovos+450};
                pagamento[0]=String.valueOf(lista[0]);
                pagamento[1]=String.valueOf(lista[1]);
                pagamento[2]=String.valueOf(lista[2]);
                pagamento[3]=String.valueOf(lista[3]);
                pagamento[4]=String.valueOf(lista[4]);
                pagamento[5]=String.valueOf(lista[5]);
                pagamento[6]=String.valueOf(lista[6]);
                pagamento[7]=String.valueOf(lista[7]);
                pagamento[8]=String.valueOf(lista[8]);
                pagamento[9]=String.valueOf(lista[9]);
                pagamento[10]=String.valueOf(lista[10]);
                pagamento[11]=String.valueOf(lista[11]);
                pagamento[12]=String.valueOf(lista[12]);

            }
        });


        labelValormostrado2=new JLabel("Para finalizar, digite a quantidade referente ao mes de pagamento desejado:");
        labelValormostrado2.setBounds(0,370,700,100);
        labelValormostrado2.setOpaque(true);
        labelValormostrado2.setForeground(Color.black);
        labelValormostrado2.setBackground(Color.green);
        Font fonteNovo5=new Font("Arial",Font.PLAIN,20);
        labelFoto.add(labelValormostrado2);
        labelValormostrado2.setFont(fonteNovo5);

        textFieldValor2=new JTextField();
        textFieldValor2.setBounds(700,370,80,100);
        textFieldValor2.setBackground(Color.GREEN);
        labelFoto.add(textFieldValor2);

        button3Mat=new JButton("Finalizar operação");
        button3Mat.setBounds(0,470,150,50);
        labelFoto.add(button3Mat);

        button3Mat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double mes=Double.parseDouble(textFieldValor2.getText());
                DecimalFormat df= new DecimalFormat("0.00");
                double valoresnovos=Double.parseDouble(textFieldValor.getText());
                DecimalFormat dfq= new DecimalFormat("0.00");
                double [] lista={valoresnovos+30.0,valoresnovos+60,valoresnovos+90,
                        valoresnovos+120,valoresnovos+150,valoresnovos+180,valoresnovos+210,
                        valoresnovos+240,valoresnovos+270,valoresnovos+360,valoresnovos+390,valoresnovos+420,valoresnovos+450};
                if (mes==12){
                    int opção=JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[0]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==13){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[1]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==14){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[2]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==15){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[3]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==16){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[4]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==17){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[5]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==18){
                    int opção= JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[6]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==19){
                    int opção=   JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[7]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==20){
                    int opção= JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[8]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==21){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[9]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==22){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[10]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else if (mes==23){
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[11]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }
                else{
                    int opção=  JOptionPane.showConfirmDialog(null,"<html>Sua escolha foi "+mes+" meses!<br>"+"R$ "+lista[12]+"</html>");
                    if (opção==0){
                        System.exit(0);
                    }
                }


            }
        });






    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
//double valorp= Double.parseDouble(textField1Valor.getText());
//                System.out.println(valorp);
//                double valormulti=valorp*3;
//                System.out.println("O triplo é "+valormulti);
//                DecimalFormat df= new DecimalFormat("0.00");
//                labelValornovo.setText(String.valueOf(valormulti));