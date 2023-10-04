package com.QusAns;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Answers_MTO")
public class Answers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answerId;
	private String answer;
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Questions question;
	
	public Answers() {
		// TODO Auto-generated constructor stub
	}

	public Answers(int answerId, String answer, Questions question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + ", question=" + question + "]";
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	
}
