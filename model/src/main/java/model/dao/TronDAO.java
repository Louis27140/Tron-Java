package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class TronDAO extends AbstractDAO{

	/** The sql chooseLevel. */
    private static String sqlChooseLevel = "{call ChooseLevel(?)}";
    
    /**
     * Gets the level's text by id.
     *
     * @param id
     *            the id
     * @return level
     * the level's text by id
     * @throws SQLException
     *             the SQL exception
     */
    public static String chooseLevel(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlChooseLevel);
        String level = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                level = result.getString("text");
            }
            result.close();
        }
        return level;
    }
    
    /**
     * 
     * Record information on the Game in DB.
     * 
     * @param Win
     * @param Lose
     * @param Timer
     */
    public static void RecordPartie(final String Win , final String Lose , final int Timer){
    	try {	
    		final CallableStatement callStatement = prepareCall("{call RecordPartie(?, ?, ?)}");
    		callStatement.setString(1, Win);
    		callStatement.setString(2, Lose);
			callStatement.setInt(3, Timer);
			if (callStatement.execute()) {
				final ResultSet result = callStatement.getResultSet();
				result.updateRow();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
