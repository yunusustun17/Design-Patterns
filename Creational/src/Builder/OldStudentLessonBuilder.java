package Builder;

public class OldStudentLessonBuilder extends LessonBuilder {
    @Override
    public void getLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence";
        lesson.price = 49.99;
    }

    @Override
    public void applyDiscount() {
        lesson.discountedPrice = lesson.price;
        lesson.discountApplied = false;
    }

    @Override
    public void addLessonNote() {
        lesson.lessonNote = "";
    }

    @Override
    public Lesson getResult() {
        return lesson;
    }
}
