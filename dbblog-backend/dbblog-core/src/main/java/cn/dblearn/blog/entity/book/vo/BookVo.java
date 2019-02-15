package cn.dblearn.blog.entity.book.vo;

import cn.dblearn.blog.entity.book.Book;
import cn.dblearn.blog.entity.operation.Tag;
import lombok.Data;

import java.util.List;

/**
 * ReadBookVo
 *
 * @author bobbi
 * @date 2019/01/29 14:17
 * @email 571002217@qq.com
 * @description
 */
@Data
public class BookVo extends Book {

    /**
     * 所属分类，以逗号分隔
     */
    private String categoryListStr;

    /**
     * 所属标签
     */
    private List<Tag> tagList;
}
