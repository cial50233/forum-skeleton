package fr.formation.training.forum.dtos;

import java.util.List;

public class DiscussionViewDto {

    private final QuestionViewDto question;

    private final List<AnswerViewDto> answers;
    // private String fieldAccess = "fieldAccess";

    public DiscussionViewDto(QuestionViewDto question,
	    List<AnswerViewDto> answers) {
	this.question = question;
	this.answers = answers;
    }
    // public QuestionViewDto getQuestion() {
    // return question;
    // }
    //
    // public List<AnswerViewDto> getAnswers() {
    // return answers;
    // }
    // public String getMethodAccess() {
    // return "getMethodAccess";
    // }
    //
    // private String getFieldAccess() {
    // return "fieldAccess";
    // }
}
