package Builder;

public abstract class LessonBuilder {
    public Lesson lesson;

    public abstract void getLesson();

    public abstract void applyDiscount();

    public abstract void addLessonNote();

    public abstract Lesson getResult();
}
