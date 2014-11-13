//7:18:50 PM
package com.datos;

/**
 * @author Angel Daniel Munoz Gonzalez
 * @email scythes.lol@gmail.com
 * @school Universidad Tecnologica de Ciudad Juarez
 * @date Nov 11, 2014
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseConnection {
	private Connection conn = null;
	private static final String SQLDRIVER = "org.postgresql.Driver";
	private static final String URLCONN = "jdbc:postgresql://localhost:5432/BancoPalabras";
	private static final String USR = "Tunaxor";
	private static final String PW = "Admin123";
	
	public DatabaseConnection()
	{
		if(checkConnection())
		{
			try 
			{
				this.conn = DriverManager.getConnection(URLCONN, USR,PW);
			}
			catch (SQLException e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage(), "Failed to Connect", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
	
	public boolean checkConnection()
	{
		try
		{
			Class.forName(SQLDRIVER);
			conn = DriverManager.getConnection(URLCONN, USR,PW);
			conn.close();
			return true;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage(), "Failed to Connect", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}//ends check connection
	
	public void close()
	{
		if(conn != null)
		{
			try 
			{
				this.conn.close();
			} 
			catch (SQLException e)
			{
				JOptionPane.showMessageDialog(null, e.getMessage(), "Failed to Close", JOptionPane.ERROR_MESSAGE);
			}
			finally
			{
				try 
				{
					this.finalize();
				}
				catch (Throwable e)
				{
					JOptionPane.showMessageDialog(null, e.getMessage(), "Failed to Close", JOptionPane.ERROR_MESSAGE);
				}
			}//try to finalize the method for this class once not used.
		}//check first if the connection is open
	}//ends close method
	
}//ends class

