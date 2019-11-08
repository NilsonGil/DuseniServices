package com.duseni.duseni.entitiesPK;

import java.io.Serializable;
import java.util.Objects;




@SuppressWarnings("serial")
public class ContributePK implements Serializable{

	private long idMember;
	private long idRequest;
	
	@Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idMember);
        hash = 59 * hash + Objects.hashCode(this.idRequest);
        return hash;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final ContributePK other = (ContributePK) obj;
        if (!Objects.equals(this.idMember, other.idMember)) {
            return false;
        }
        if (!Objects.equals(this.idRequest, other.idRequest)) {
            return false;
        }
        return true;
    }

	
}
