package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class upcon implements upinter{

    upgetset up=new upgetset();

    /**
     *
     * @param up
     * @return
     * @throws SQLException
     */
    @Override
    public int upload(upgetset up){
 try{
        String query="insert into hmdata(movie,poster,banner)values(?,?,?)";
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Movieupload","hr","hr");
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, up.getMovie());
        ps.setString(2, up.getPoster());
        ps.setString(3, up.getBanner());
        ps.execute();
        
    }catch(Exception e){
        
    }
        return 1;
    }
    
    @Override
    public void update(upgetset up, int movie_id){
        try{
        String query="update hmdata set movie=?,poster=?,banner=? where id="+movie_id;
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Movieupload","hr","hr");
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, up.getMovie());
        ps.setString(2, up.getPoster());
        ps.setString(3, up.getBanner());
ps.execute();
    
    }catch(Exception e){
        e.printStackTrace();
    }}
        
        
    @Override
    public void delete(int id) {
        try{
        String query="delete from hmdata where id="+id;
    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Movieupload","hr","hr");
      PreparedStatement ps=con.prepareStatement(query);
      ps.executeUpdate();
    
    }catch(Exception e){
      e.printStackTrace();
    }}
        
    @Override
    public upgetset get(int id)  {
      try{
        upgetset ug=null;
        String query="select * from hmdata where id=?";
   Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Movieupload","hr","hr");
      PreparedStatement ps=con.prepareStatement(query);
ps.setInt(1, id);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            ug=new upgetset();
            ug.setId(rs.getInt("id"));
            ug.setMovie(rs.getString("movie"));
            ug.setPoster(rs.getString("poster"));
            ug.setBanner(rs.getString("banner"));
        }
    }catch(Exception e){
        e.printStackTrace();

    }
        return null;
    }
    @Override
    public List<upgetset>get()  {
   List<upgetset> al=new ArrayList();
       
        try{
        String query="select * from hmdata";
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Movieupload","hr","hr");
      PreparedStatement ps=con.prepareStatement(query);
ResultSet rs=ps.executeQuery();
while(rs.next()){
    upgetset up=new upgetset();
    up.setId(rs.getInt("id"));
    up.setMovie(rs.getString("movie"));
    up.setPoster(rs.getString("poster"));
up.setBanner(rs.getString("banner"));
al.add(up);
}
     System.out.println(al);      
    }catch(Exception e){
    e.printStackTrace();
    }
        return al;
    
    }}
    
