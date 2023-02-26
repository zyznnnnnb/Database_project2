import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

public class Login_win {
    public static void main(String[] args) {

    }
}

class helloLabel extends JFrame {
    public static int count = 0;
    public static JButton bt1;//登陆按钮
    public static JButton bt2;//忘记密码按钮
    public static JLabel jl_1;//登录的版面
    public static JFrame jf_1;//登陆的框架
    public static JTextField jtext1;//用户名
    public static JTextField jtext2;//密码
    public static JLabel jl_admin;
    public static JLabel jl_password;
    public static JCheckBox jcb1,jcb2,jcb3,jcb4;


    public helloLabel() {//初始化登陆界面
        Font font = new Font("黑体", Font.PLAIN, 20);//设置字体
        jf_1 = new JFrame("登陆界面");
        jf_1.setSize(450, 400);
        //给登陆界面添加背景图片
//        ImageIcon bgim = new ImageIcon(helloLabel.class.getResource("baozou.PNG"));//背景图案
//        bgim.setImage(bgim.getImage().
//                getScaledInstance(bgim.getIconWidth(),
//                        bgim.getIconHeight(),
//                        Image.SCALE_DEFAULT));
//        ImageIcon bg=new ImageIcon("C:\\Users\\zyz'\\IdeaProjects\\Reversi\\background.jpg");
//        JLabel label=new JLabel(bg);
//        label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
//        jf_1.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
//        JPanel jp=(JPanel)jf_1.getContentPane();
//        jp.setOpaque(false);//设置透明
        jl_1 = new JLabel();
//        jl_1.setIcon(bg);

        jl_admin = new JLabel("User");
        jl_admin.setBounds(20, 50, 200, 50);
        jl_admin.setFont(font);

        jl_password = new JLabel("Password");
        jl_password.setBounds(20, 120, 200, 50);
        jl_password.setFont(font);

        bt1 = new JButton("login");         //更改成loginButton
        bt1.setBounds(90, 250, 100, 50);
        bt1.setFont(font);

        bt2 = new JButton("exit");
        bt2.setBounds(250, 250, 100, 50);
        bt2.setFont(font);

        jcb1 = new JCheckBox("Courier");
        jcb1.setBounds(10,180,95,20);
        jcb1.setFont(font);

        jcb2 = new JCheckBox("Company manager");
        jcb2.setBounds(220,180,180,20);
        jcb2.setFont(font);

        jcb3 = new JCheckBox("Seaport officer");
        jcb3.setBounds(10,200,180,50);
        jcb3.setFont(font);

        jcb4 = new JCheckBox("Department manager");
        jcb4.setBounds(220,200,210,50);
        jcb4.setFont(font);

        //加入文本框
        jtext1 = new JTextField("");
        jtext1.setBounds(150, 50, 250, 50);
        jtext1.setFont(font);

        jtext2 = new JTextField("");//密码输入框
        jtext2.setBounds(150, 120, 250, 50);
        jtext2.setFont(font);

        jl_1.add(jtext1);
        jl_1.add(jtext2);

        jl_1.add(jl_admin);
        jl_1.add(jl_password);
        jl_1.add(bt1);
        jl_1.add(bt2);

        jl_1.add(jcb1);
        jl_1.add(jcb2);
        jl_1.add(jcb3);
        jl_1.add(jcb4);

        jf_1.add(jl_1);
        jf_1.setVisible(true);
        jf_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf_1.setLocation(300, 400);
    }

    public static void main(String[] args) {
        //初始化登陆界面
        ArrayList<Integer> identities = new ArrayList<>();
        helloLabel hl = new helloLabel();
        /**
         * 处理点击事件
         * 1.登陆按钮点击事件，判断账号密码是否正确，若正确，弹出监测信息界面
         * 否则，无响应（暂时无响应）
         * ：后可在登陆界面添加一个logLabel提示用户是否用户密码正确
         * 2.退出按钮，直接退出程序
         */
        //登陆点击事件
        ActionListener bt1_ls = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String user = jtext1.getText();
                String password = jtext2.getText();
                String identity;
                switch (identities.get(identities.size()-1)){
                    case 1: identity = "Courier";break;
                    case 2: identity = "Company manager";break;
                    case 3: identity = "Seaport officer";break;
                    case 4: identity = "Department manager";break;
                    default:identity = "";break;
                }

                if(true){// 这里写check方法
                    SwingUtilities.invokeLater(() -> {
                        System.out.println(identity);

                        //登录后的操作

                    });
                }

                hl.jf_1.dispose();//销毁当前界面
                File f;
                URI uri;
                URL url;

            }
        };
        bt1.addActionListener(bt1_ls);
        //退出事件的处理
        ActionListener bt2_ls = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(555);//终止当前程序
            }
        };
        bt2.addActionListener(bt2_ls);

        jcb1.addItemListener(new ItemListener() {
            boolean open;
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(open) open = false;
                else open = true;
                if(open) identities.add(1);
            }
        });

        jcb2.addItemListener(new ItemListener() {
            boolean open;
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(open) open = false;
                else open = true;
                if(open) identities.add(2);
            }
        });

        jcb3.addItemListener(new ItemListener() {
            boolean open;
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(open) open = false;
                else open = true;
                if(open) identities.add(3);
            }
        });

        jcb4.addItemListener(new ItemListener() {
            boolean open;
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(open) open = false;
                else open = true;
                if(open) identities.add(4);
            }
        });
    }
}