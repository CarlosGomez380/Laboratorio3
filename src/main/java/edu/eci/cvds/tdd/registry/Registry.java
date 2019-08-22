package edu.eci.cvds.tdd.registry;

import java.util.*;

public class Registry {

	public Set<Integer> register= new HashSet<Integer>();
	public RegisterResult registerVoter(Person p) {
		
		if (p.isAlive()== false){
			return RegisterResult.DEAD;
		}
		else if (p.getAge()>=0 && p.getAge()<18){
			return RegisterResult.UNDERAGE;
		}
		else if (p.getAge()<0 || p.getAge()>200){
			return RegisterResult.INVALID_AGE;
		}
		else if (register.contains(p.getId())){
			return RegisterResult.DUPLICATED;
		}
	  	else{
			register.add(p.getId());
        		return RegisterResult.VALID;
		}
    }
	public Set<Integer> getRegister(){
		return register;
	}
}


