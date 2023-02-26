import java.awt.*;

import javax.swing.*;

public class Demo11_5_1 extends JFrame {

//北部区域

    JLabel jl1;

//南部区域

    JButton jb1,jb2,jb3;

    JPanel jp1;

//中部区域

    JTabbedPane jtp;//选项卡窗格

    JPanel jp2,jp3,jp4;

    JLabel jl2,jl3,jl4,jl5;

//号码输入文本框

    JTextField  jtf;

//密码

    JPasswordField jpf;

//清除号码

    JButton jb4;

//隐身登录，记住密码

    JCheckBox jcb1,jcb2;

    public static void main(String[] args) {

        Demo11_5_1 demo = new Demo11_5_1();

    }

    public Demo11_5_1()

    {

//创建组件，中间区域

        jl2 = new JLabel("QQ号码",JLabel.CENTER);

        jl3 = new JLabel("QQ密码",JLabel.CENTER);

        jl4 = new JLabel("忘记密码",JLabel.CENTER);

//设置标签的性质

        jl4.setFont(new Font("宋体",Font.PLAIN ,16));

        jl4.setForeground(Color.BLUE);

        jl5 = new JLabel("申请密码");

//如果将鼠标移到该位置，则自动变成手型

        jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

//输入号码框

        jtf = new JTextField();

//输入密码框

        jpf = new JPasswordField();

        jb4 = new JButton(new ImageIcon("2.png"));

//复选框

        jcb1 = new JCheckBox("隐身登陆");

        jcb2 = new JCheckBox("记住密码");

//北部区域就一张图片

        jl1 = new JLabel(new ImageIcon("2.png"));

//南部区域

        jp1 = new JPanel();

        jb1 = new JButton(new ImageIcon("2.png"));

        jb2 = new JButton(new ImageIcon("2.png"));

        jb3 = new JButton(new ImageIcon("2.png"));

//中部区域

        jtp = new JTabbedPane();

//设置三个Panel,因为点击选项的时候会翻页

        jp2 = new JPanel();

        jp3 = new JPanel();

        jp3.setBackground(Color.RED);

        jp4 =new JPanel();

        jp4.setBackground(new Color(0,0,255));

//将面板添加到选项卡窗格上

        jtp.add("QQ号码",jp2);

        jtp.add("手机号码",jp3);

        jtp.add("电子邮箱",jp4);

//设置布局

        jp2.setLayout(new GridLayout(3,3));

//添加组件

        jp1.add(jb1);

        jp1.add(jb2);

        jp1.add(jb3);

        jp2.add(jl2);

        jp2.add(jtf);

        jp2.add(jb4);

        jp2.add(jl3);

        jp2.add(jpf);

        jp2.add(jl4);

        jp2.add(jcb1);

        jp2.add(jcb2);

        jp2.add(jl5);

        this.add(jp1,BorderLayout.SOUTH);

        this.add(jl1,BorderLayout.NORTH);

        this.add(jtp,BorderLayout.CENTER);

        ImageIcon icon = new ImageIcon("2.png");

        this.setIconImage(icon.getImage());

        this.setSize(3500,2400);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);

    }

}