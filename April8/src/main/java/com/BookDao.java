package com;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //INSERTION
    public int insertRecord(Book book){
        String sql = "insert into jtbookdetails values(?,?,?,?)";
        Object[] values = {null,book.getBookName(),book.getAuthorName(),book.getPrice()};
        jdbcTemplate.update(sql,values);
        return 0;

    }

    public int updateRecord(String bookName,float p){
        String sql = "update jtbookdetails set price='"+p+"' where bookName = '"+bookName+"'";
        return jdbcTemplate.update(sql);
    }

    public int deleteRecord(int bid){
        String sql = "delete from jtbookdetails where bid = '"+bid+"'";
        return jdbcTemplate.update(sql);
    }

    public List<Book> fetchRecordsMapper(){
        String sql = "select * from jtbookdetails";
        List<Book> list = jdbcTemplate.query(sql,new RowMapper(){

            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setBid(resultSet.getInt(1));
                book.setBookName(resultSet.getString(2));
                book.setAuthorName(resultSet.getString(3));
                book.setPrice(resultSet.getFloat(4));
                return book;
            }
        });
        return list;
    }

    public List<Book> fetchByCriteria(int bookid) {
        String sql = "select * from jtbookdetails where bid = ?";
        Object[] values = {bookid};
        List<Book> list = jdbcTemplate.query(sql, values, new ResultSetExtractor<List<Book>>() {
            @Override
            public List<Book> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<Book> l = new ArrayList<>();
                while (resultSet.next()){
                    Book book = new Book();
                    book.setBid(resultSet.getInt(1));
                    book.setBookName(resultSet.getString(2));
                    book.setAuthorName(resultSet.getString(3));
                    book.setPrice(resultSet.getFloat(4));
                    l.add(book);
                }
                return l;
            }
        });
        return list;
    }

}
