/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piratehawks;
import java.awt.HeadlessException;
import java.sql.* ;

import javax.swing.*;
public class sqliteConnection2 {
	Connection conn = null;

    /**
     *
     * @return
     * @throws java.lang.ClassNotFoundException
     */
    public static Connection dbConnector() throws ClassNotFoundException
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Agnes B\\eclipse-workspace1\\FilenameDB.sqlite");
			//JOptionPane.showMessageDialog(null,"Database Connection Successful");
			return conn; 
		}catch (HeadlessException | SQLException e)
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
		
	}
	
}