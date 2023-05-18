package db;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ls = List.of("A", "N");
        System.out.println(ls.contains("A"));
    }
}
