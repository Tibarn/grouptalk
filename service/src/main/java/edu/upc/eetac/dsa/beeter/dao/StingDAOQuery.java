package edu.upc.eetac.dsa.beeter.dao;

public class StingDAOQuery
{
    public final static String UUID = "select REPLACE(UUID(),'-','')";
    public final static String CREATE_STING = "insert into stings (id, userid, subject, content,groupid) values (UNHEX(?), unhex(?), ?, ?,unhex(?))";
    public final static String GET_STING_BY_ID = "select hex(s.id) as id, hex(s.userid) as userid, s.content, s.subject, s.creation_timestamp, s.last_modified, u.fullname from stings s, users u where s.id=unhex(?) and u.id=s.userid";
    public final static String GET_STINGS = "select hex(id) as id, hex(userid) as userid, subject as subject  from stings where groupid=unhex(?)";
    public final static String UPDATE_STING = "update stings set subject=?, content=? where id=unhex(?) ";
    public final static String DELETE_STING = "delete from stings where id=unhex(?)";
    public final static String CHECK_GROUP = "select userid from group_users where groupid=unhex(?)";

}
