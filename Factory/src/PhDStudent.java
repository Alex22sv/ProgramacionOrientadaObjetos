public class PhDStudent implements Student{
    @Override
    public void enroll() {
        System.out.println("I enroll in the PhD in CS.");
    }

    @Override
    public void attendCourse() {
        System.out.println("I gotta write my thesis.");
    }

    @Override
    public void graduate() {
        System.out.println("I am now a Doctor.");
    }
}
