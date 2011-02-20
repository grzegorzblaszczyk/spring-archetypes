#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server.dao.impl;

import org.springframework.stereotype.Repository;

import ${package}.server.dao.DummyDAO;
import ${package}.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link ${package}.server.dao.impl.GenericHibernateDAOImpl} methods
 */
@Repository
public class DummyDAOImpl extends GenericHibernateDAOImpl<DummyEntity, Long> implements DummyDAO {
    
}
