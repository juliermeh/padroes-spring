package br.edu.ifpb.padroes.spring;

public class Employee {

        private Long id;
        private String name;
        private String address;
        private String hobby;

        private Employee() {}

        /* Usando o padrão Builder */
        public static class EmployeeBuilder {
            private Long id;
            private String name;
            private String address;
            private String hobby;

            public EmployeeBuilder(Long id, String name) {
                this.id=id;
                this.name=name;
            }

            public void setAddress(String address) { this.address = address; }
            public void setHobby(String  hobby) { this.hobby = hobby; }

            /* Construtor */
            public br.edu.ifpb.padroes.spring.Employee build() {
                br.edu.ifpb.padroes.spring.Employee emp = new br.edu.ifpb.padroes.spring.Employee();
                emp.id=id;
                emp.name=name;
                emp.address=address;
                emp.hobby=hobby;
                return emp;
            }
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", hobby="  + hobby + "]";
        }

}
