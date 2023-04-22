package own.cfb.boot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import own.cfb.boot.model.Student;

import java.util.List;

public interface StudentDao {

    @Select(value="select stuCode,stuName from student")
    @Results(
            value={
                    @Result(column = "stuCode",property = "stuCode",jdbcType = JdbcType.INTEGER,javaType = Integer.class),
                    @Result(column = "stuName",property = "stuName",jdbcType = JdbcType.CHAR,javaType = String.class),
            }
    )
    public List<Student> getStudentList();
    public List<Student> getStudentAll();
}
