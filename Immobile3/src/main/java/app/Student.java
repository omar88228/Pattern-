package app;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

 

@Entity

@Table(name = "STUDENT")

public class Student {

        @Id

        @Column(name = "id")

        private int id;

 

        @Column(name = "fistName")

        private String firstName;

 

        @Column(name = "lastName")

        private String lastName;

 

        @Column(name = "marks")

        private int marks;

       

        public Student() {

               

        }

 

        public Student(int id, String firstName, String lastName, int marks) {

                super();

                this.id = id;

                this.firstName = firstName;

                this.lastName = lastName;

                this.marks = marks;

        }

 

        public int getId() {

                return id;

        }

 

        public void setId(int id) {

                this.id = id;

        }

 

        public String getFirstName() {

                return firstName;

        }

 

        public void setFirstName(String firstName) {

                this.firstName = firstName;

        }

 

        public String getLastName() {

                return lastName;

        }

 

        public void setLastName(String lastName) {

                this.lastName = lastName;

        }

 

        public int getMarks() {

                return marks;

        }

 

        public void setMarks(int marks) {

                this.marks = marks;

        }

}
