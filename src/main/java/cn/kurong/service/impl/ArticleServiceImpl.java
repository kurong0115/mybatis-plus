package cn.kurong.service.impl;

import cn.kurong.entity.Article;
import cn.kurong.mapper.ArticleMapper;
import cn.kurong.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Rong Ku
 * @since 2020-01-15
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
