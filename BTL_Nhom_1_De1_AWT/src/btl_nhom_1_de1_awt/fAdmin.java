/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_nhom_1_de1_awt;

import static btl_nhom_1_de1_awt.fUser.about;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToolBar;

/**
 *
 * @author Chien10
 */
public class fAdmin {
    static Frame Admin = new Frame("Admin");
    static Frame dialog_about=new Frame("About");
    static MenuBar menubar= new MenuBar();
    static Menu mFile=new Menu("File");
    static MenuItem itemAbout = new MenuItem("About");
    static JToolBar toolbar=new JToolBar();
    static Button btnTimKiem=new Button("Tìm kiếm");
    static Label lb_title_user=new Label("THÔNG TIN CÁN BỘ");
    static Label lb_hoten =new Label("Nhập họ tên: ");
    
    static Button Add=new Button("Add");
    static Button Search=new Button("Search");
    static Button View=new Button("View");
 
    public static String iconNew = "iconNew.png";
    public static String iconOpen = "iconOpen.png";
    public static String iconSave = "iconSave.png";
    
    public static void main(String[] args) {
        //Code giao dien
        //Get SizeScreen
        Admin.setLayout(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
  // Set Size to Frame
        Admin.setSize(500, 300);
        //Get Location
        int w = Admin.getSize().width;
        int h = Admin.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        // Move the Frame to center Screen
        Admin.setLocation(x, y);
        Admin.setVisible(true);
        
       
       //menubar
       menubar.add(mFile);
       
       
       mFile.add(itemAbout);
       
       Admin.setMenuBar(menubar);
       
        //toolbar
        Panel p=new Panel();
        toolbar.setBounds(0, 50, Admin.getWidth(), 30);
        //toolbar.add(p);
        toolbar.add(Add);
        toolbar.add(Search);
        toolbar.add(View);
        
        
        
        //title
//        lb_title_user.setBounds(170, 50, 150, 30);
//        
//        
//        lb_hoten.setBounds(80, 80, 70, 30);
//        
//        TextField txtTimKiem=new TextField();
//        txtTimKiem.setBounds(170, 80, 200, 30);
//        
//        
//        btnTimKiem.setBounds(200, 120, 70, 30);
//        
//        TextArea txaTTCanBo=new TextArea();
//        txaTTCanBo.setBounds(50, 170, 400, 100);
//       
        Admin.add(toolbar,BorderLayout.NORTH);
//        User.add(lb_title_user);
//        User.add(lb_hoten);
//        User.add(txtTimKiem);
//        User.add(btnTimKiem);
//        User.add(txaTTCanBo);
       
        //code chuc nang
//        itemAbout.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                about();
// 
//            }
//        });

}
    
}
