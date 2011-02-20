#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class DummyEntity {
    
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private Long id;

	public Long getId() {
		return id;
	}

    public void setId(Long id) {
        this.id = id;
    }
}
