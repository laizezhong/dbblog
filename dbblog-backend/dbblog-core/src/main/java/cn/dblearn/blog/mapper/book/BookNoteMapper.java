package cn.dblearn.blog.mapper.book;

import cn.dblearn.blog.entity.book.BookNote;
import cn.dblearn.blog.entity.book.vo.BookNoteVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 笔记 Mapper 接口
 * </p>
 *
 * @author bobbi
 * @since 2019-02-13
 */
@Mapper
public interface BookNoteMapper extends BaseMapper<BookNote> {

    /**
     * 查询列表
     *
     * @param page
     * @param params
     * @return
     */
    List<BookNoteVo> listBookNoteVo(Page<BookNoteVo> page, @Param("params") Map<String, Object> params);

    /**
     * 分页分类获取列表
     *
     * @param params
     * @return
     */
    List<BookNoteVo> queryPageCondition(Page<BookNoteVo> page, @Param("params") Map<String, Object> params);

    /**
     * 更新阅读记录数
     * @param id
     */
    void updateReadNum(Integer id);
}
