package Builder;

public class LessonDirector {
    private LessonBuilder lessonBuilder;

    public LessonDirector(LessonBuilder lessonBuilder) {
        this.lessonBuilder = lessonBuilder;
    }

    public void make() {
        lessonBuilder.getLesson();
        lessonBuilder.applyDiscount();
        lessonBuilder.addLessonNote();
    }
}
