package Paging;

import Sort.Sorter;

public interface Pageable {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
