package ImplementDAO;

import java.util.List;

import com.mysql.cj.util.StringUtils;

import DAO.INewsDAO;
import Mapper.NewsMapper;
import Model.NewsModel;
import Paging.Pageable;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewsMapper(), categoryId);
	}

	@Override
	public Long save(NewsModel newsModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO news (title, content,");
		sql.append(" thumbnail, shortdescription, categoryid, createddate, createdby)");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)");
		return add(sql.toString(), newsModel.getTitle(), newsModel.getContent(), newsModel.getThumbnail(), newsModel.getShortDescription(), newsModel.getCategoryId(),newsModel.getCreatedDate(), newsModel.getCreatedBy());
	}


	public void remove(Long idRemove) {
		String dlt = "Delete from News where id = ?";
		update(dlt, idRemove);
	}

	@Override
	public List<NewsModel> findAll(Pageable pageble) {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		if (pageble.getSorter() != null) {
			sql.append(" ORDER BY "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if (pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" LIMIT "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		return query(sql.toString(), new NewsMapper());
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		String sql = "Select count(*) from news";
		return count(sql);
	}

	@Override
	public NewsModel findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewsModel> newsList = query(sql, new NewsMapper(), id);
		return newsList.isEmpty() ? null : newsList.get(0);
	}

	@Override
	public void update(NewsModel updateNews) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
		sql.append(" shortdescription = ?, content = ?, categoryid = ?,");
		sql.append(" createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNews.getTitle(), updateNews.getThumbnail(), updateNews.getShortDescription(),updateNews.getContent(), updateNews.getCategoryId(), updateNews.getCreatedDate(), updateNews.getCreatedBy(), updateNews.getModifiedDate(), updateNews.getModifiedBy(), updateNews.getId());
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		String delete = "delete from news where id = ?";
		update(delete, id);
	}



}
