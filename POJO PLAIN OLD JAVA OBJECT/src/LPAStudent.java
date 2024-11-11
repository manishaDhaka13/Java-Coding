public record LPAStudent(String id, String name, String dateOfBirth, String classList) {

    // record replace POJO we use record keyword to create a record it can also take parameter
    // parameter are private and final and also called component field of record
    // we can't change the value of these parameter after we create record using new record and passing the value of parameter
    //getter are called accesser in record but record does not use get prefix
    // there is no setter in record
    // in record there is implicit constructor , accesser and toString method we don't have to write them
    //in record there will always be a implicit constructor even when we write a overloaded constructor in it and we should
    // call the default constructor in first line
    // record object is created like this
    // LPAStudent recordStudent=new LPAStudent("6546","gsdgfdg","4/7/1992","java");

}
