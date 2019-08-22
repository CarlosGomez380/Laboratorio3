package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryResult2() {

        Person person = new Person("Carlos GOMEZ", 234545667, 21, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryResult3() {

        Person person = new Person("Mateo Arango", 23457657, -1, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


    @Test
    public void validateRegistryResult4() {

        Person person = new Person("Maria Santos", 111986345, 0, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryResult5() {

        Person person = new Person("Camila Rivera", 101817152, 17, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryResult6() {

        Person person = new Person("Santiago Rodriguez", 213475966, 18, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryResult7() {

        Person person = new Person("Sebastian Caceres", 10180567,65, Gender.MALE, true);
	   
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryResult8() {

	   Person person1 = new Person("Sebastian Caceres", 10180567,65, Gender.MALE, true);
	   
        RegisterResult result1 = registry.registerVoter(person1);
        Assert.assertEquals(RegisterResult.VALID, result1);

        Person person = new Person("Juan Morales", 10180567,25, Gender.MALE, true);
	   	  	 	
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }


    @Test
    public void validateRegistryResult9() {

        Person person = new Person("Santiago Rodriguez", 110128364, 18, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validateRegistryResult0() {

        Person person = new Person("Maria Corrales", 56793423,220, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

}