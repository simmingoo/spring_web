package com.rpt.admin.common.main;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public abstract class BaseAbstractDao extends SqlSessionDaoSupport {

    /**
     * Annotation ???Όλ‘? sqlSession(SqlSessionFactoryBean)? λ°μ?? 
     * ?΄λ₯? super(SqlSessionDaoSupport)? setSqlSessionFactory λ©μ?λ₯? ?ΈμΆν?¬ ?€? ?΄ μ€??€.
     * <p>
     * SqlSessionTemplate?΄ μ§?? ? κ²½μ°? κ²½μ° ?΄ SqlSessionFactoryκ°? λ¬΄μ??€. (Batch μ²λ¦¬λ₯? ??΄?? SqlSessionTemplateκ°? ??)
     * 
     * 
     * @param sqlSession SqlSessionFactoryλ‘? MyBatis??? ?°κ³λ?? ?? κΈ°λ³Έ ?΄??€
     */
    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSession) {
    	super.setSqlSessionFactory(sqlSession);
    }

    /**
     * ?? ₯ μ²λ¦¬ SQL mapping ? ?€???€.
     * 
     * @param queryId -  ?? ₯ μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     * @param parameterObject - ?? ₯ μ²λ¦¬ SQL mapping ?? ₯ ?°?΄?°λ₯? ?Έ?? ??Όλ©ν° κ°μ²΄(λ³΄ν΅ VO ?? Map)
     * 
     * @return DBMSκ°? μ§???? κ²½μ° insert ? ?© κ²°κ³Ό count
     */
    public int insert(String queryId, Object parameterObject) {
    	return getSqlSession().insert(queryId, parameterObject);
    }

    /**
     * ??  μ²λ¦¬ SQL mapping ? ?€???€.
     * 
     * @param queryId - ??  μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     * @param parameterObject - ??  μ²λ¦¬ SQL mapping ?? ₯ ?°?΄?°(key μ‘°κ±΄ λ°? λ³?κ²? ?°?΄?°)λ₯? ?Έ?? ??Όλ©ν° κ°μ²΄(λ³΄ν΅ VO ?? Map)
     * 
     * @return DBMSκ°? μ§???? κ²½μ° update ? ?© κ²°κ³Ό count
     */
    public int update(String queryId) {
        return getSqlSession().update(queryId);
    }
    
    /**
     * ??  μ²λ¦¬ SQL mapping ? ?€???€.
     * 
     * @param queryId - ??  μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     * @param parameterObject - ??  μ²λ¦¬ SQL mapping ?? ₯ ?°?΄?°(key μ‘°κ±΄ λ°? λ³?κ²? ?°?΄?°)λ₯? ?Έ?? ??Όλ©ν° κ°μ²΄(λ³΄ν΅ VO ?? Map)
     * 
     * @return DBMSκ°? μ§???? κ²½μ° update ? ?© κ²°κ³Ό count
     */
    public int update(String queryId, Object parameterObject) {
        return getSqlSession().update(queryId, parameterObject);
    }

    /**
     * ?­?  μ²λ¦¬ SQL mapping ? ?€???€.
     * 
     * @param queryId - ?­?  μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     * @param parameterObject - ?­?  μ²λ¦¬ SQL mapping ?? ₯ ?°?΄?°(?Όλ°μ ?Όλ‘? key μ‘°κ±΄)λ₯?  ?Έ?? ??Όλ©ν° κ°μ²΄(λ³΄ν΅ VO ?? Map)
     *        
     * @return DBMSκ°? μ§???? κ²½μ° delete ? ?© κ²°κ³Ό count
     */
    public int delete(String queryId, Object parameterObject) {
        return getSqlSession().delete(queryId, parameterObject);
    }

    /**
     * pk λ₯? μ‘°κ±΄?Όλ‘? ? ?¨κ±΄μ‘°? μ²λ¦¬ SQL mapping ? ?€???€. 
     * 
     * @param queryId - ?¨κ±? μ‘°ν μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     *
     * @return κ²°κ³Ό κ°μ²΄ - SQL mapping ??Ό?? μ§?? ? resultClass/resultMap ? ?? ?¨?Ό κ²°κ³Ό κ°μ²΄(λ³΄ν΅ VO ?? Map)
     */
    public Object selectOne(String queryId) {
        return getSqlSession().selectOne(queryId);
    }
    /**
     * pk λ₯? μ‘°κ±΄?Όλ‘? ? ?¨κ±΄μ‘°? μ²λ¦¬ SQL mapping ? ?€???€. 
     * 
     * @param queryId - ?¨κ±? μ‘°ν μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     * @param parameterObject - ?¨κ±? μ‘°ν μ²λ¦¬ SQL mapping ?? ₯ ?°?΄?°(key)λ₯? ?Έ?? ??Όλ©ν° κ°μ²΄(λ³΄ν΅ VO ?? Map)
     *        
     * @return κ²°κ³Ό κ°μ²΄ - SQL mapping ??Ό?? μ§?? ? resultClass/resultMap ? ?? ?¨?Ό κ²°κ³Ό κ°μ²΄(λ³΄ν΅ VO ?? Map)
     */
    public Object selectByPk(String queryId, Object parameterObject) {
        return getSqlSession().selectOne(queryId, parameterObject);
    }

    /**
     * λ¦¬μ€?Έ μ‘°ν μ²λ¦¬ SQL mapping ? ?€???€.
     * 
     * @param queryId - λ¦¬μ€?Έ μ‘°ν μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     *
     * @return κ²°κ³Ό List κ°μ²΄ - SQL mapping ??Ό?? μ§?? ?  resultClass/resultMap ? ?? κ²°κ³Ό κ°μ²΄(λ³΄ν΅ VO   ?? Map)? List
     */
    @SuppressWarnings("rawtypes")
	public List list(String queryId) {
        return getSqlSession().selectList(queryId);
    }
    @SuppressWarnings("rawtypes")
	public List list(String queryId, Object parameterObject) {
        return getSqlSession().selectList(queryId, parameterObject);
    }

    /**w
     * λΆ?λΆ? λ²μ λ¦¬μ€?Έ μ‘°ν μ²λ¦¬ SQL mapping ? ?€???€. 
     * (λΆ?λΆ? λ²μ - pageIndex ?? pageSize κΈ°λ°?Όλ‘? ??¬ λΆ?λΆ? λ²μ μ‘°νλ₯? ?? skipResults, maxResults λ₯? κ³μ°??¬ ibatis ?ΈμΆ?)
     * 
     * @param queryId - λ¦¬μ€?Έ μ‘°ν μ²λ¦¬ SQL mapping μΏΌλ¦¬ ID
     * @param parameterObject - λ¦¬μ€?Έ μ‘°ν μ²λ¦¬ SQL mapping ?? ₯ ?°?΄?°(μ‘°ν μ‘°κ±΄)λ₯? ?Έ?? ??Όλ©ν° κ°μ²΄(λ³΄ν΅ VO ?? Map)
     * @param pageIndex - ??¬ ??΄μ§? λ²νΈ
     * @param pageSize - ? ??΄μ§? μ‘°ν ?(pageSize)
     * 
     * @return λΆ?λΆ? λ²μ κ²°κ³Ό List κ°μ²΄ - SQL mapping ??Ό?? μ§?? ? resultClass/resultMap ? ?? λΆ?λΆ? λ²μ κ²°κ³Ό κ°μ²΄(λ³΄ν΅ VO ?? Map) List
     */
    @SuppressWarnings("rawtypes")
	public List listWithPaging(String queryId, Object parameterObject, int pageIndex, int pageSize) {
        int skipResults = pageIndex * pageSize;
        //int maxResults = (pageIndex * pageSize) + pageSize;
        
        RowBounds rowBounds = new RowBounds(skipResults, pageSize);
        
        return getSqlSession().selectList(queryId, parameterObject, rowBounds);
    }
    
    public void select(String queryId, Object parameter, ResultHandler handler) {
    	getSqlSession().select(queryId, parameter, handler);
      }
}
