package Builder;

public class NewStudentLessonBuilder extends LessonBuilder {
    @Override
    public void getLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence";
        lesson.price = 49.99;
    }

    @Override
    public void applyDiscount() {
        lesson.discountedPrice = lesson.price * 0.5;
        lesson.discountApplied = true;
    }

    @Override
    public void addLessonNote() {
        lesson.lessonNote = "Hey, welcome";
    }

    @Override
    public Lesson getResult() {
        return lesson;
    }
}
