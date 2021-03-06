package com.neusoft.common.dao.ifac;

import java.util.List;

import com.neusoft.common.domain.NurseAdving;

public interface NurseAdvingDAO extends BaseDAO<String, NurseAdving> {

	List<NurseAdving> findAdvingByAdvId(String advId);

}