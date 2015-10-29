package edu.upc.eetac.dsa.beeter.dao;

import edu.upc.eetac.dsa.beeter.entity.Sting;
import edu.upc.eetac.dsa.beeter.entity.StingCollection;

import java.sql.SQLException;

public interface StingDAO
{
    //usem la classe sting del beeter per fer els topics
    public Sting createSting(String userid, String subject, String content,String groupid) throws SQLException;
    public Sting getStingById(String id) throws SQLException;
    public StingCollection getStingsByGroup(String groupid) throws SQLException;
    public Sting updateSting(String id, String subject, String content) throws SQLException;
    public boolean deleteSting(String id) throws SQLException;

}
