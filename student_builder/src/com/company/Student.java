package com.company;


public class Student {
    //required parameters
    private String id;
    private String name;
    private String age;
    private String className;
    private String gender;
    //optional parameters
    private String andress;
    private String fartherName;
    private String motherName;
    private String nationality;
    private String religion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAndress() {
        return andress;
    }

    public void setAndress(String andress) {
        this.andress = andress;
    }

    public String getFartherName() {
        return fartherName;
    }

    public void setFartherName(String fartherName) {
        this.fartherName = fartherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
    private Student(StudentBuilder builder) {
        this.id=builder.id;
        this.name=builder.name;
        this.age=builder.age;
        this.className=builder.className;
        this.gender=builder.gender;
        this.andress=builder.andress;
        this.fartherName=builder.fartherName;
        this.motherName=builder.motherName;
        this.nationality=builder.nationality;
        this.religion=builder.religion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", className='" + className + '\'' +
                ", gender='" + gender + '\'' +
                ", andress='" + andress + '\'' +
                ", fartherName='" + fartherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }

    //Builder Class
    public static class StudentBuilder{
        // required parameters
        private String id;
        private String name;
        private String age;
        private String className;
        private String gender;
        // optional parameters
        private String andress;
        private String fartherName;
        private String motherName;
        private String nationality;
        private String religion;

        public StudentBuilder(String id, String name, String age, String className, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.className = className;
            this.gender = gender;
        }

        public StudentBuilder setAndress(String andress) {
            this.andress = andress;
            return this;
        }
        public StudentBuilder setFartherName(String fartherName) {
            this.fartherName = fartherName;
            return this;
        }
        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }
        public StudentBuilder setNationnality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}