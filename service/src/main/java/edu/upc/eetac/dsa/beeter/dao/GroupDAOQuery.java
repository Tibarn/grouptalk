package edu.upc.eetac.dsa.beeter.dao;

public class GroupDAOQuery
{
    public final static String UUID = "select REPLACE(UUID(),'-','')";
    public final static String CREATE_GROUP = "insert into groups (id, userid, name) values (UNHEX(?), unhex(?), ?)";
    public final static String JOIN_GROUP = "insert into group_users (userid, groupid) values (unhex(?), unhex(?))";
    public final static String LEAVE_GROUP = "delete from group_users (userid, groupid) values (unhex(?), unhex(?))";
    public final static String GET_GROUP_BY_ID = "select hex(id) as id, hex(userid) as userid, name FROM groups WHERE id = unhex(?)";
    public final static String GET_GROUP = "select hex(id) as id, hex(userid) as userid, name FROM groups";
   public final static String DELETE_GROUP = "delete from groups where id=unhex(?)";
}


